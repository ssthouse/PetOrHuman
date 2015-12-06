package com.ssthouse.petorhuman.view.activity;

import android.support.v7.app.AppCompatActivity;

import com.umeng.analytics.MobclickAgent;

/**
 * bese activity
 * 特性:
 * 加入友盟用户统计
 * Created by ssthouse on 2015/12/6.
 */
public class BaseActivity extends AppCompatActivity {

    public void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }

    public void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }
}
