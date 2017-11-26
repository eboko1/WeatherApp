package com.example.vika.weatherapp.contract;

/**
 * Created by Vika on 26.11.2017.
 */

public interface Contract {

    interface View{
        void initView();
        void inputErrorMessage();
        void showProgressBar();
        void hideProgressBar();

    }

    interface  Presenter{
        void onClick(android.view.View view);
    }
}
