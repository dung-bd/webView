package com.example.codecademy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;


public class DiscussFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_discuss, container, false);
        WebView webView = root.findViewById(R.id.idWebViewDiscuss);
        webView.loadUrl("https://viblo.asia/discussion");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}