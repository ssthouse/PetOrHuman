package com.ssthouse.petorhuman.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;

import com.ssthouse.petorhuman.R;
import com.ssthouse.petorhuman.model.event.LoginActivityFinishEvent;
import com.ssthouse.petorhuman.model.event.ProgressBarEvent;
import com.ssthouse.petorhuman.view.fragment.LoginFragment;
import com.ssthouse.petorhuman.view.fragment.SignUpFragment;

import de.greenrobot.event.EventBus;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends BaseActivity {

    private LoginFragment loginFragment;
    private SignUpFragment signUpFragment;

    /**
     * actionbar上的进度条item
     */
    private MenuItem pbItem;

    /**
     * 切换为注册fragment的item
     */
    private MenuItem signUpItem;
    /**
     * 切换为登陆的item
     */
    private MenuItem loginItem;

    public static void start(Context context) {
        context.startActivity(new Intent(context, LoginActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EventBus.getDefault().register(this);
        initView();
    }

    private void initView() {
        setSupportActionBar((android.support.v7.widget.Toolbar) findViewById(R.id.id_tb));

        transToLoginFragment();
    }

    /**
     * progressbar是否显示事件处理
     *
     * @param event
     */
    public void onEventMainThread(ProgressBarEvent event) {
        if (event.isShow()) {
            pbItem.setVisible(true);
        } else {
            pbItem.setVisible(false);
        }
    }

    /**
     * 收到消息退出activity
     * @param event
     */
    public void onEventMainThread(LoginActivityFinishEvent event){
        finish();
    }

    /**
     * 加载login片段
     */
    private void transToLoginFragment() {
        getSupportActionBar().setTitle("登陆");
        if (signUpItem != null)
            signUpItem.setVisible(true);
        if (loginItem != null)
            loginItem.setVisible(false);
        if (loginFragment == null) {
            loginFragment = new LoginFragment();
        }
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.id_fragment_container, loginFragment).commit();

    }

    /**
     * 加载sign up片段
     */
    private void transToSignUpFragment() {
        getSupportActionBar().setTitle("注册");
        if (signUpItem != null)
            signUpItem.setVisible(false);
        if (loginItem != null)
            loginItem.setVisible(true);
        if (signUpFragment == null) {
            signUpFragment = new SignUpFragment();
        }
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.id_fragment_container, signUpFragment).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_login, menu);
        pbItem = menu.findItem(R.id.id_action_pb);
        pbItem.setVisible(false);
        signUpItem = menu.findItem(R.id.id_action_sign_up);
        loginItem = menu.findItem(R.id.id_action_login);
        loginItem.setVisible(false);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.id_action_sign_up:
                transToSignUpFragment();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

