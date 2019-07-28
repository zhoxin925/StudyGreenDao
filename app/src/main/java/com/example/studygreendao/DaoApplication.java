package com.example.studygreendao;

import android.app.Application;
import android.content.Context;

public class DaoApplication extends Application {
    private Context appContext;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;

    }

}
