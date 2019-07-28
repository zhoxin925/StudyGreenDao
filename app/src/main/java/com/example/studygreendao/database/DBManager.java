package com.example.studygreendao.database;

import android.content.Context;

import com.example.studygreendao.bean.DaoMaster;
import com.example.studygreendao.bean.DaoSession;
import com.example.studygreendao.bean.StudentDao;

import org.greenrobot.greendao.database.Database;

public class DBManager {
    private static final String myDbName = "zxgreendao.db";
    private static DaoSession daoSession = null;
    private static StudentDao studentDao;

    public DBManager() {
    }

    private static final class Holder {
        private static final DBManager INSTANCE = new DBManager();
    }

    public static DBManager getInstance(Context context) {
        initDao(context);
        return Holder.INSTANCE;
    }

    private static void initDao(Context context) {
        DBOpenHelper helper = new DBOpenHelper(context, myDbName);
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
        studentDao = daoSession.getStudentDao();
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }
}
