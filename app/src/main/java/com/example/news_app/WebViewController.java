package com.example.news_app;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewController  extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String Url) {
        view.loadUrl(Url);
        return true;
    }
}
