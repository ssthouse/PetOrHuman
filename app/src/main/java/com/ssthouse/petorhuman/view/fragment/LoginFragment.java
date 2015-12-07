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

import com.ssthouse.petorhuman.R;

/**
 * 登陆Fragment
 * Created by ssthouse on 2015/12/6.
 */
public class LoginFragment extends Fragment {

    private AutoCompleteTextView autoEtUserName;
    private EditText etPassword;
    private Button btnLogin;
    private ImageView ivAvatar;


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
        initView(rootView);
        return rootView;
    }

    private void initView(View rootView) {
        ivAvatar = (ImageView) rootView.findViewById(R.id.id_iv_avatar);
        //TODO---获取本地avatar--如果有的话
        ivAvatar.setImageResource(R.drawable.ic_action_person);

        //用户名(自动提示本地username)
        autoEtUserName = (AutoCompleteTextView) rootView.findViewById(R.id.id_et_username);

        etPassword = (EditText) rootView.findViewById(R.id.id_et_password);

        //登陆
        btnLogin = (Button) rootView.findViewById(R.id.id_btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    /**
     * 登陆
     */
    private void login(){
        //先disable按钮
        btnLogin.setClickable(false);
        //TODO---尝试登陆
        String userName = autoEtUserName.getText().toString();
        String password = etPassword.getText().toString();
    }
}
