package com.example.codecademy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;


public class QuestionFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_question, container, false);
        WebView webView = root.findViewById(R.id.idWebViewQuestion);
        webView.loadUrl("https://viblo.asia/questions");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}