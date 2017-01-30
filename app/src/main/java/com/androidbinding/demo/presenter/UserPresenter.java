package com.androidbinding.demo.presenter;

import com.androidbinding.demo.interfaces.UserView;
import com.androidbinding.demo.model.User;
import com.androidbinding.demo.viewmodel.UserViewModel;

/**
 *  Presenter class to set user details via view model and update data on view
 */

public class UserPresenter {

    private UserView userView;
    private User user;
    private UserViewModel userViewModel;

    public UserPresenter(UserView userView) {
        this.userView=userView;
        userViewModel=new UserViewModel();
    }

    public void setUserData() {

        user=userViewModel.getUserData();
        userView.updateUserData(user);

    }
}
