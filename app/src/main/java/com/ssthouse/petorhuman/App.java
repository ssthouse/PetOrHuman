package com.ssthouse.petorhuman;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;
import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;
import com.umeng.analytics.MobclickAgent;
import com.umeng.update.UmengUpdateAgent;

import im.fir.sdk.FIR;

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

        //umeng---用户使用统计---自动更新
        MobclickAgent.setDebugMode(true);
        UmengUpdateAgent.update(this);

        //fir---bug统计
        FIR.init(this);
        //设为开发模式---不提交bug
        FIR.setDebug(true);

        //leanCloud集成
        AVOSCloud.initialize(this, "baGcAcqXpQnoAJCGryuz9kIF", "iegM684uOe88JElH1jdpel03");
    }
}
