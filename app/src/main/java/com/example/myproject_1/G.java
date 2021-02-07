package com.example.myproject_1;

import android.app.Application;
import android.content.Context;

import com.example.myproject_1.Models.Users;

public class G extends Application {
    public  static Users user=new Users();
    public  static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
    }
}
