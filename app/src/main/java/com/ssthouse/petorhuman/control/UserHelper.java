package com.ssthouse.petorhuman.control;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVUser;
import com.avos.avoscloud.SignUpCallback;
import com.ssthouse.petorhuman.model.event.UserCreateEvent;

import de.greenrobot.event.EventBus;

/**
 * app用户的控制器
 * Created by ssthouse on 2015/12/15.
 */
public class UserHelper {

    /**
     * 尝试新建用户
     * 创建结果通过Eventbus返回UserCreateEvent
     */
    public static void tryNewUser(String userName, String password){
        if(userName == null || password ==  null){
            return;
        }
        AVUser newUser = new AVUser();
        newUser.setUsername(userName);
        newUser.setPassword(password);
        newUser.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(AVException e) {
                if(e == null){
                    EventBus.getDefault().post(new UserCreateEvent(true));
                }else{
                    EventBus.getDefault().post(new UserCreateEvent(false));
                }
            }
        });
    }

}
