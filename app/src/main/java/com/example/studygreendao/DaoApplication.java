package com.example.studygreendao;

import android.app.Application;
import android.content.Context;

import com.example.studygreendao.greendao.DaoMaster;
import com.example.studygreendao.greendao.DaoSession;


public class DaoApplication extends Application {
    private Context appContext;
    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;

        initGreenDao();
    }

    private void initGreenDao(){
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(appContext, "mygreendao-db", null);
        DaoMaster daoMaster = new DaoMaster(helper.getWritableDatabase());
        daoSession = daoMaster.newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}
