package com.liziyang.dall.greengao2;

import android.app.Application;

import org.greenrobot.greendao.database.Database;

public class App extends Application {
    //声明一个全局对象
    //需要在功能清单注册
    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate ();
//        //创建一个表
//        DaoMaster.DevOpenHelper helper=new DaoMaster.DevOpenHelper ( this,"come.db" );
//        Database db=helper.getWritableDb ();
//        daoSession=new DaoMaster ( db ).newSession ();
        /**
         * 注意当你写完整个类再加密的话会报错
         * 因为表已经在手机中创建完毕 要不更新数据库版本 要不换一个名字来测试
         */
        DaoMaster.DevOpenHelper helper=new DaoMaster.DevOpenHelper ( this,"co1me.db" );
        Database database=helper.getEncryptedWritableDb ( "wangyouhu.." );
        DaoMaster daoMaster=new DaoMaster ( database );
        daoSession=daoMaster.newSession ();

    }

//    public App(DaoSession daoSession) {
//        this.daoSession = daoSession;
//    }

    public DaoSession getDaoSession() {
        return daoSession;
    }

}
