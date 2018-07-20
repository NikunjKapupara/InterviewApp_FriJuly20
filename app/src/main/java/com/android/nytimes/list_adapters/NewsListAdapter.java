package com.android.nytimes.list_adapters;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.nytimes.R;
import com.android.nytimes.callbacks_interfaces.GetCallbackOnNewsItemClicked;
import com.android.nytimes.ws_models.NewsModel;
import com.bumptech.glide.Glide;

/**
 * Created by N!K$ on 3/28/18.
 */

public class NewsListAdapter extends RecyclerView.Adapter<NewsListViewHolder> {
    private Activity context;
    private LayoutInflater layoutInflater;
    private NewsModel newsModel;
    private GetCallbackOnNewsItemClicked callbackOnNewsItemClicked;
    public NewsListAdapter(Activity activity, NewsModel model, GetCallbackOnNewsItemClicked itemClicked){
        this.context = activity;
        layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        this.newsModel = model;
        this.callbackOnNewsItemClicked = itemClicked;
    }

    @NonNull
    @Override
    public NewsListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_listitem, parent, false);
        return new NewsListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsListViewHolder holder, final int position) {

        Glide.with(context).load(newsModel.getResults().get(position).getMedia().get(0).getMediametadata().get(1).getUrl()).into(holder.newsThumbIV);
        holder.newsTitleTV.setText(newsModel.getResults().get(position).getTitle());
        holder.newsSubTitleTV.setText(newsModel.getResults().get(position).getAbstractNewsData());
        holder.newsPublishedDateTV.setText(newsModel.getResults().get(position).getPublished_date());
        holder.newsItemMainLL.setOnClickListener(v -> callbackOnNewsItemClicked.getCalbackOfNewsItemOnClick(newsModel.getResults().get(position)));
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return newsModel.getResults().size();
    }
}
