package com.android.nytimes.app_fragments_modules.news_details;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.nytimes.MainActivity;
import com.android.nytimes.R;
import com.android.nytimes.utils.LogUtils;
import com.android.nytimes.ws_models.NewsModel;
import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewsDetailsFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    String copyRightText;
    View parentView;
    NewsModel.ResultsBean resultsBeanofNews= null;
    MainActivity mainActivity;

    @BindView(R.id.newsPublishedDateTV) TextView newsPublishedDateTV;
    @BindView(R.id.newsLargeIV) ImageView newsLargeIV;
    @BindView(R.id.newsMediaCaptionTV) TextView newsMediaCaptionTV;
    @BindView(R.id.newssViewedTV) TextView newssViewedTV;
    @BindView(R.id.newsLinkTV) TextView newsLinkTV;
    @BindView(R.id.aboutNewsTV) TextView aboutNewsTV;
    @BindView(R.id.newsSourceTV) TextView newsSourceTV;
    @BindView(R.id.newsPublishedByTV) TextView newsPublishedByTV;
    @BindView(R.id.copyrightTV) TextView copyrightTV;


    public static NewsDetailsFragment newInstance(NewsModel.ResultsBean objOfNewsItem, String copyRightText) {
        NewsDetailsFragment fragment = new NewsDetailsFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PARAM1, objOfNewsItem);
        args.putString(ARG_PARAM2, copyRightText);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivity = (MainActivity) getActivity();
        if (getArguments() != null) {
            if (getArguments().getSerializable(ARG_PARAM1) != null) {
                resultsBeanofNews = (NewsModel.ResultsBean) getArguments().getSerializable(ARG_PARAM1);
                copyRightText = getArguments().getString(ARG_PARAM2);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(parentView != null)
            return parentView;

        parentView = inflater.inflate(R.layout.fragment_news_details, container, false);
        ButterKnife.bind(this, parentView);
        loadNewsDetailsData();
        return parentView ;
    }

    @Override
    public void onResume() {
        super.onResume();
        mainActivity.setToolbarTitle(getString(R.string.title_news_detail));
    }

    /**
     * Bind News Details data in SCREEN UI
     * New date, Publish, News Desc, News Media Photo etc....
     */
    private void loadNewsDetailsData(){
        try {
            Glide.with(mainActivity).load(resultsBeanofNews.getMedia().get(0).getMediametadata().get(3).getUrl()).into(newsLargeIV);
            newsMediaCaptionTV.setText(resultsBeanofNews.getMedia().get(0).getCaption());
            newssViewedTV.setText(resultsBeanofNews.getViews() + "");
            newsPublishedDateTV.setText("" + resultsBeanofNews.getPublished_date());
            aboutNewsTV.setText(resultsBeanofNews.getAbstractNewsData());
            newsSourceTV.setText(resultsBeanofNews.getType() + " - " + resultsBeanofNews.getSource());
            newsPublishedByTV.setText(resultsBeanofNews.getByline());
            copyrightTV.setText(copyRightText);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    /***
     * CLICK; Click event of READ MORE ABOUT THIS NEWS
     * It will open a separate link in a external browser and user can view full news article.
     */
    @OnClick(R.id.newsLinkTV) void moreNewsClicked(){
        try {
            if (resultsBeanofNews.getUrl() != null && resultsBeanofNews.getUrl().trim().length() > 0) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(resultsBeanofNews.getUrl())));
            } else {
                Toast.makeText(mainActivity, R.string.no_news_link_found, Toast.LENGTH_SHORT).show();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
