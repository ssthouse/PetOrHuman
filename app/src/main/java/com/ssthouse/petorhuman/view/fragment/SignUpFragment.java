package com.ssthouse.petorhuman.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ssthouse.petorhuman.R;

/**
 * 注册fragment
 * Created by ssthouse on 2015/12/6.
 */
public class SignUpFragment extends Fragment {

    private Context context;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context = getContext();
        View rootView = View.inflate(context, R.layout.fragment_sign_up, null);
        initView(rootView);
        return rootView;
    }

    private void initView(View rootView) {

    }
}
