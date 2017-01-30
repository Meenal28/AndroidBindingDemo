package com.androidbinding.demo.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;


/**
 *  User Model class to get/set user name and email.
 */

public class User extends BaseObservable {

   private String name,email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(com.androidbinding.demo.BR.email);
    }
}
