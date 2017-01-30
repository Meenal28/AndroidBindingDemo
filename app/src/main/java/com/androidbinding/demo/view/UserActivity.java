package com.androidbinding.demo.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.androidbinding.demo.R;
import com.androidbinding.demo.databinding.ActivityUserBinding;
import com.androidbinding.demo.interfaces.UserView;
import com.androidbinding.demo.model.User;
import com.androidbinding.demo.presenter.UserPresenter;

/**
 * Activity class for user details.
 */

public class UserActivity extends Activity implements UserView {
    public static final String TAG = UserActivity.class.getSimpleName();
    private ActivityUserBinding binding;
    private UserPresenter userPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_user);
        userPresenter = new UserPresenter(this);
        userPresenter.setUserData();

        binding.setActivity(this);
    }

    public void onButtonClick(String email) {

        Log.d(TAG, "Email :" + binding.getUser().getEmail());
        Log.d(TAG, "Email : " + email);
        Toast.makeText(this, email, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void updateUserData(User user) {
        binding.setUser(user);
    }
}
