package com.ssthouse.petorhuman.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVUser;
import com.avos.avoscloud.LogInCallback;
import com.ssthouse.petorhuman.R;
import com.ssthouse.petorhuman.control.utils.NetUtil;
import com.ssthouse.petorhuman.control.utils.PreferenceHelper;
import com.ssthouse.petorhuman.control.utils.ToastHelper;
import com.ssthouse.petorhuman.model.event.LoginActivityFinishEvent;
import com.ssthouse.petorhuman.model.event.ProgressBarEvent;
import com.ssthouse.petorhuman.view.activity.MainActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import de.greenrobot.event.EventBus;

/**
 * 登陆Fragment
 * Created by ssthouse on 2015/12/6.
 */
public class LoginFragment extends Fragment {

    @Bind(R.id.id_et_username)
    AutoCompleteTextView autoEtUserName;

    @Bind(R.id.id_et_password)
    EditText etPassword;

    @Bind(R.id.id_btn_login)
    Button btnLogin;

    @Bind(R.id.id_iv_avatar)
    ImageView ivAvatar;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //数据初始化
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_login, null);
        ButterKnife.bind(this, rootView);
        initView(rootView);
        return rootView;
    }

    private void initView(View rootView) {
        //TODO---获取本地avatar--如果有的话
        ivAvatar.setImageResource(R.drawable.ic_action_person);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!NetUtil.isConnected(getContext())) {
                    ToastHelper.show(getContext(), "请检查网络连接");
                    return;
                }
                prepareLogin();
                login();
            }
        });
    }

    /**
     * 登陆的UI准备
     */
    private void prepareLogin() {
        EventBus.getDefault().post(new ProgressBarEvent(true));
        btnLogin.setClickable(false);
    }

    /**
     * 登陆
     */
    private void login() {
        //TODO---尝试登陆
        String userName = autoEtUserName.getText().toString();
        String password = etPassword.getText().toString();
        AVUser.logInInBackground(userName, password, new LogInCallback<AVUser>() {
            @Override
            public void done(AVUser avUser, AVException e) {
                if (e == null) {
                    //TODO--跳转主activity
                    PreferenceHelper.getInstance(getContext()).setIsFistIn(false);
                    EventBus.getDefault().post(new LoginActivityFinishEvent());
                    MainActivity.start(getContext());
                } else {
                    ToastHelper.show(getContext(), "用户名或密码错误");
                    EventBus.getDefault().post(new ProgressBarEvent(false));
                }
            }
        });
    }
}
