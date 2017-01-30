package com.androidbinding.demo.viewmodel;

import com.androidbinding.demo.model.User;

/**
 *  Model class to get/set user details i.e name and email id.
 */

public class UserViewModel {

    private User user;

    public User getUserData() {
        user = new User();
        user.setName("Data Binding");
        return user;
    }
}
