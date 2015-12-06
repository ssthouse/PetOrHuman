package com.ssthouse.petorhuman.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.ssthouse.petorhuman.R;
import com.ssthouse.petorhuman.model.event.ProgressBarEvent;
import com.ssthouse.petorhuman.view.fragment.LoginFragment;
import com.ssthouse.petorhuman.view.fragment.SignUpFragment;
import com.ssthouse.petorhuman.view.widget.TbProgressProvider;

import de.greenrobot.event.EventBus;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends BaseActivity {

    private LoginFragment loginFragment;
    private SignUpFragment signUpFragment;

    private ProgressBar pb;

    public static void start(Context context) {
        context.startActivity(new Intent(context, LoginActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
        setContentView(R.layout.activity_login);
        transToLoginFragment();
        initView();
    }

    private void initView() {
        setSupportActionBar((android.support.v7.widget.Toolbar) findViewById(R.id.id_tb));

        pb = (ProgressBar) getSupportActionBar().getCustomView()
                .findViewById(R.id.id_action_pb);
        pb.setVisibility(View.VISIBLE);
    }

    /**
     * progressbar事件
     * @param event
     */
    public void onEventMainThread(ProgressBarEvent event){

    }


    private void transToLoginFragment() {
        //加载login片段
        if (loginFragment == null) {
            loginFragment = new LoginFragment();
        }
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.id_fragment_container, loginFragment).commit();
    }

    private void transToSignUpFragment() {
        //加载login片段
        if (signUpFragment == null) {
            signUpFragment = new SignUpFragment();
        }
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.id_fragment_container, signUpFragment).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_login, menu);
        MenuItem item = menu.findItem(R.id.id_action_pb);
        TbProgressProvider tbProgressProvider = (TbProgressProvider) MenuItemCompat.getActionProvider(item);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            //TODO---新用户
            case R.id.id_action_add_user:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

