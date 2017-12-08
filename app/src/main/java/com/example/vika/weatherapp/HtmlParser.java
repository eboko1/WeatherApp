package com.example.vika.weatherapp;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

/**
 * Created by Vika on 26.11.2017.
 */

public class HtmlParser {
    private String pUrl;


    public HtmlParser(String url){
        this.pUrl = url;
    }

    private void getHtml(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Document document = Jsoup.connect(pUrl).get();


                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        }).start();
    }

}
