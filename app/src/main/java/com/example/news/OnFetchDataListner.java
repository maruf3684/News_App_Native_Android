package com.example.news;

import com.example.news.models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListner<NewsApiResponse> {
    void onFetchData(List<NewsHeadlines> list , String message);
    void onError(String message);
}
