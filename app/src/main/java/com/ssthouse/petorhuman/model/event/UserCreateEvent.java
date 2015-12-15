package com.ssthouse.petorhuman.model.event;

/**
 * Created by ssthouse on 2015/12/15.
 */
public class UserCreateEvent {

    /**
     * 用户创建是否成功
     */
    boolean success;

    public UserCreateEvent(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
