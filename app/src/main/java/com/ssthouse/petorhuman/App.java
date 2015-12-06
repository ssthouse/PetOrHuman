package com.ssthouse.petorhuman;

import android.app.Application;

import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;
import com.umeng.analytics.MobclickAgent;

/**
 * Created by ssthouse on 2015/12/5.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //init log
        Logger.init("ssthouse")
                .setLogLevel(LogLevel.FULL)
                .hideThreadInfo();

        //umeng
        MobclickAgent.setDebugMode(false);
    }
}
