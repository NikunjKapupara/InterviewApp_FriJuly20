package com.android.nytimes.app_fragments_modules.news;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.nytimes.MainActivity;
import com.android.nytimes.R;
import com.android.nytimes.app_fragments_modules.news_details.NewsDetailsFragment;
import com.android.nytimes.list_adapters.NewsListAdapter;
import com.android.nytimes.utils.DialogUtils;
import com.android.nytimes.utils.LogUtils;
import com.android.nytimes.utils.NavigationUtils;
import com.android.nytimes.volley_ws.HttpHandler;
import com.android.nytimes.ws_models.NewsModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewsListingFragment extends Fragment{

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    MainActivity mainActivity;
    View parentView;
    @BindView(R.id.newsRV) RecyclerView newsRV;
    @BindView(R.id.copyrightTV) TextView copyrightTV;
    int lastSerchFilter = 1;

    public static NewsListingFragment newInstance(String param1, String param2) {
        NewsListingFragment fragment = new NewsListingFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivity = (MainActivity) getActivity();
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(parentView != null)
            return parentView;

        parentView = inflater.inflate(R.layout.fragment_news_listing, container, false);
        ButterKnife.bind(this, parentView);
        newsRV.setLayoutManager(new LinearLayoutManager(mainActivity, LinearLayoutManager.VERTICAL, false));

        getNewYorkNews();
        filterNews();
        return parentView ;
    }

    @Override
    public void onResume() {
        super.onResume();
        mainActivity.setToolbarTitle(getString(R.string.title_news));
    }

    /**
     * GET NEWS: By default and from Search Filter also
     */
    private void getNewYorkNews(){
        new HttpHandler(mainActivity).getNewYorkNews(response -> {
            if (response.getStatus().toLowerCase().equalsIgnoreCase("ok")){
                LogUtils.logError("News Size: ", response.getResults().size()+"");
                if (response.getResults().size() > 0){
                    bindNewsDataInRecyclerview(response);
                }
                else{
                    DialogUtils.showAlertDialogOnly(mainActivity, getString(R.string.no_news_found));
                }
            }
        }, lastSerchFilter);
    }

    /**
     * handle Search News Filter Functionality
     */
    public void filterNews(){
        mainActivity.getSearchButtonOnToolbar().setOnClickListener(view -> DialogUtils.showNewsFilterDialog(mainActivity, (filterDays, object) -> {
            if (filterDays == lastSerchFilter){
                Toast.makeText(mainActivity, R.string.news_search_violation, Toast.LENGTH_SHORT).show();
                return;
            }
            lastSerchFilter = filterDays;
            getNewYorkNews();
        }, lastSerchFilter));
    }

    /**
     * Bind News Data in Recyclerview,
     * Navigate to New Detail Screen on New Item Tapped.
     * @param newsModel
     */
    private void bindNewsDataInRecyclerview(NewsModel newsModel){
        newsRV.setAdapter(new NewsListAdapter(mainActivity, newsModel, objOfNewsItem -> {
            NewsModel.ResultsBean resultsBean = (NewsModel.ResultsBean) objOfNewsItem;
            NavigationUtils.getInstance().navigateToFragment(NewsDetailsFragment.newInstance(resultsBean, newsModel.getCopyright()));
        }));
        copyrightTV.setText(newsModel.getCopyright());
    }
}
