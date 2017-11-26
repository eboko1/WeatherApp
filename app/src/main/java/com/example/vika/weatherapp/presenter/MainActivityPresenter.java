package com.example.vika.weatherapp.presenter;

import android.support.design.widget.Snackbar;
import android.view.View;

import com.example.vika.weatherapp.Parse;
import com.example.vika.weatherapp.contract.Contract;

/**
 * Created by Vika on 26.11.2017.
 */

public class MainActivityPresenter implements Contract.Presenter {
    private Parse parseHtml;
    private  Contract.View cView;


    public MainActivityPresenter(Contract.View view){
        this.cView = view;
        initPresenter();
    }

    private void initPresenter() {
        cView.initView();
    }


    @Override
    public void onClick(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}
