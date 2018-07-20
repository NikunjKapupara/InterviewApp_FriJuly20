package com.android.nytimes.list_adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.nytimes.R;
import com.android.nytimes.utils.CircularImageView;

import org.w3c.dom.Text;

/**
 * Created by N!K$ on 7/19/18.
 */

public class NewsListViewHolder extends RecyclerView.ViewHolder {
    CircularImageView newsThumbIV;
    TextView newsTitleTV, newsSubTitleTV, newsPublishedDateTV;
    LinearLayout newsItemMainLL;
    public NewsListViewHolder(View itemView) {
        super(itemView);
        newsItemMainLL = itemView.findViewById(R.id.newsItemMainLL);
        newsThumbIV = itemView.findViewById(R.id.newsThumbIV);
        newsTitleTV = itemView.findViewById(R.id.newsTitleTV);
        newsSubTitleTV = itemView.findViewById(R.id.newsSubTitleTV);
        newsPublishedDateTV = itemView.findViewById(R.id.newsPublishedDateTV);
    }
}
