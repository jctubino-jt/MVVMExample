package com.jctubino.mvvmexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import android.widget.Toast;

import com.jctubino.mvvmexample.commands.UserLogin;
import com.jctubino.mvvmexample.databinding.ActivityMainBinding;
import com.jctubino.mvvmexample.model.User;
import com.jctubino.mvvmexample.viewmodel.UserModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //This sets the layout xml file to use
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        //This sets the email hint and password hint
        UserModel userModel = new UserModel(new User("Email","Password"));
        activityMainBinding.setLogin(userModel);

        activityMainBinding.setUserloginevent(new UserLogin() {
            @Override
            public void onClickLogin() {
                Toast.makeText(MainActivity.this,""+activityMainBinding.getLogin().getEmail(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
