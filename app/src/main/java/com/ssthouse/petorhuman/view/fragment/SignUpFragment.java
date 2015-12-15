package com.ssthouse.petorhuman.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVUser;
import com.avos.avoscloud.LogInCallback;
import com.ssthouse.petorhuman.R;
import com.ssthouse.petorhuman.control.UserHelper;
import com.ssthouse.petorhuman.control.utils.NetUtil;
import com.ssthouse.petorhuman.control.utils.PreferenceHelper;
import com.ssthouse.petorhuman.control.utils.ToastHelper;
import com.ssthouse.petorhuman.model.event.LoginActivityFinishEvent;
import com.ssthouse.petorhuman.model.event.ProgressBarEvent;
import com.ssthouse.petorhuman.model.event.UserCreateEvent;
import com.ssthouse.petorhuman.view.activity.MainActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import de.greenrobot.event.EventBus;

/**
 * 注册fragment
 * Created by ssthouse on 2015/12/6.
 */
public class SignUpFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        View rootView = View.inflate(getContext(), R.layout.fragment_sign_up, null);
        ButterKnife.bind(this, rootView);
        initView(rootView);
        return rootView;
    }

    @Bind(R.id.id_et_username)
    EditText etUserName;

    @Bind(R.id.id_et_password)
    EditText etPassword;

    @Bind(R.id.id_btn_sign_up)
    Button btnSignup;

    private void initView(View rootView) {
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!NetUtil.isConnected(getContext())) {
                    ToastHelper.show(getContext(), "请检查网络连接");
                    return;
                }
                UserHelper.tryNewUser(etUserName.getText().toString(), etPassword.getText().toString());
            }
        });
    }

    /**
     * 点击注册时的UI准备
     */
    private void prepareSignUp() {
        btnSignup.setClickable(false);
        EventBus.getDefault().post(new ProgressBarEvent(true));
    }

    /**
     * 用户创建结果的回调
     *
     * @param event
     */
    public void onEventMainThread(UserCreateEvent event) {
        if (event.isSuccess()) {
            EventBus.getDefault().post(new LoginActivityFinishEvent());
            //记录登陆状态
            PreferenceHelper.getInstance(getContext()).setIsFistIn(false);
            //注册后直接登陆
            AVUser.logInInBackground(etUserName.getText().toString(), etPassword.getText().toString(), new LogInCallback<AVUser>() {
                @Override
                public void done(AVUser avUser, AVException e) {
                    EventBus.getDefault().post(new LoginActivityFinishEvent());
                    MainActivity.start(getContext());
                    ToastHelper.show(getContext(), "登陆成功");
                }
            });
        } else {
            ToastHelper.show(getContext(), "该用户名已被使用");
            EventBus.getDefault().post(new ProgressBarEvent(false));
            btnSignup.setClickable(true);
        }
    }
}
