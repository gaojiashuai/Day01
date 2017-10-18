package com.example.lianxi1;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.alex.greendao.gen.DaoMaster;
import com.alex.greendao.gen.YesterdayBeanDao;

/**
 * Created by 你瞅啥 on 2017/10/12.
 */
public class MyApplication extends Application{
    private static MyApplication application;

    private YesterdayBeanDao yesterdayBeanDao;

    @Override
    public void onCreate() {
        super.onCreate();
   application = this;
        createMyDatabase();
    }


    private void createMyDatabase() {

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "yesterday");
        SQLiteDatabase writableDatabase = helper.getWritableDatabase();
       yesterdayBeanDao = new DaoMaster(writableDatabase).newSession().getYesterdayBeanDao();
    }
    public YesterdayBeanDao getDao(){
        return yesterdayBeanDao;
    }
    public static MyApplication getInstance(){
        return application;
    }

}
