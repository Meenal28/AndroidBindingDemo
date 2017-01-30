package com.androidbinding.demo.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 *
 */

public class RowDetails extends BaseObservable {

    private String title="testing";

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(com.androidbinding.demo.BR.title);
    }
}
