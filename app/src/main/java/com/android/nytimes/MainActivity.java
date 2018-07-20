package com.android.nytimes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.nytimes.app_fragments_modules.news.NewsListingFragment;
import com.android.nytimes.utils.DialogUtils;
import com.android.nytimes.utils.NavigationUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.titleLabel) TextView titleLabel;
    @BindView(R.id.btnNavBack) Button btnNavBack;
    @BindView(R.id.btnSearchOnToolbar) Button btnSearchOnToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        NavigationUtils.createInstance(this);
        NavigationUtils.getInstance().navigateToFragment(new NewsListingFragment(), false);
    }


    /**
     * Managing toolbar Title text, back button and search button
     * @param titleResId
     */
    public void setToolbarTitle(String titleResId){
        titleLabel.setText(titleResId);
        if (titleResId.equalsIgnoreCase(getString(R.string.title_news_detail))){
            btnNavBack.setVisibility(View.VISIBLE);
            btnSearchOnToolbar.setVisibility(View.GONE);
        }
        else{
            btnNavBack.setVisibility(View.GONE);
            btnSearchOnToolbar.setVisibility(View.VISIBLE);
        }
    }

    /**
     * Click: Back Arrow click on Toolbar
     */
    @OnClick(R.id.btnNavBack) void onNavigationBackClicked(){
        NavigationUtils.getInstance().goBack();
    }

    /**
     *  Get Search button on Toolbar for News Filter purpose.
     */

    public Button getSearchButtonOnToolbar(){
        return btnSearchOnToolbar;
    }

    @Override
    public void onBackPressed() {
        if (NavigationUtils.getInstance().isHomeFragment()){
            DialogUtils.showConfirmationDialog(this, getString(R.string.exit_from_app_confirmation), (state, obj) -> {
                if (state)
                    finish();
            });
        }
        else
            super.onBackPressed();
    }
}
