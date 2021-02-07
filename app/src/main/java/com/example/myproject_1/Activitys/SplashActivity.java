package com.example.myproject_1.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.widget.TextView;

import com.example.myproject_1.Engine.Utils;
import com.example.myproject_1.R;

public class SplashActivity extends AppCompatActivity {
    private TextView txtLoading;
    private Handler handler;
    private Utils utils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        utils = new Utils(SplashActivity.this);
        init();
        threadAnimSplash();
        handler=new Handler();
        handler.postDelayed(() -> {
            if ((Boolean) utils.getSharedPreferences("isLogged", false)) {
                utils.goTo(SplashActivity.this, null);//null=صفحه اصلی
            }else {
                utils.goTo(SplashActivity.this, LoginActivity.class);
            }}, 2000);
    }

    private void threadAnimSplash() {
        Thread thread = new Thread(new Runnable() {
            String str = "";
            byte level = 1;
            boolean flag = true;

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(200);
                        if (str.length() < 3 && flag == true) {
                            str += ".";
                            if (str.length() == 3)
                                level++;
                        } else {
                            flag = false;
                            str = str.substring(1);
                            if (str.length() == 0) {
                                flag = true;
                                level++;
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    handler.post(() -> {
                        if (level == 4)
                            level = 0;
                        if (level <= 1)
                            txtLoading.setGravity(Gravity.END);
                        if (level >= 2)
                            txtLoading.setGravity(Gravity.START);
                        txtLoading.setText(str);
                    });
                }
            }
        });
        thread.start();
    }

    private void init() {
        txtLoading = findViewById(R.id.activity_splash_txt2);
    }


}