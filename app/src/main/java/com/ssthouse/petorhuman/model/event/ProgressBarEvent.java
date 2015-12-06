package com.ssthouse.petorhuman.model.event;

/**
 * Created by ssthouse on 2015/12/6.
 */
public class ProgressBarEvent {
    private boolean show;

    public ProgressBarEvent(boolean show) {
        this.show = show;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }
}
