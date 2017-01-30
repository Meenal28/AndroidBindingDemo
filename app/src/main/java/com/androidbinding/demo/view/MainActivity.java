package com.androidbinding.demo.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.androidbinding.demo.R;
import com.androidbinding.demo.databinding.ActivityMainBinding;
import com.androidbinding.demo.model.MyDataBindingHelper;


public class MainActivity extends AppCompatActivity{
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Line 1
        TextView unbound = (TextView)
                findViewById(R.id.textViewUnBound);
        // Line 2
        MyDataBindingHelper myDataBindingHelper =
                MyDataBindingHelper.get("Unbound");

        // Line 3
        unbound.setText(myDataBindingHelper.getMessage());


        // Line 4

        binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        // Line 5
        binding.setMydatabindinghelper(MyDataBindingHelper.get("Bound"));




    }


}
