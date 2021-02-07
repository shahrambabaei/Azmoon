package com.example.myproject_1.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.myproject_1.Data;
import com.example.myproject_1.G;
import com.example.myproject_1.Engine.Utils;
import com.example.myproject_1.OnResult;
import com.example.myproject_1.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private Button btnLogin;
    private TextInputLayout edtLUserName, edtLPassword;
    private TextInputEditText edtUserName, edtPassword;
    private CheckBox checkBox;
    private Utils utils;
    private Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        utils = new Utils(LoginActivity.this);
        init();
        data = new Data(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtUserName.getText().toString().length() > 0 && edtPassword.getText().toString().length() > 0) {
                    data.Login(edtUserName.getText().toString(), new OnResult() {
                        @Override
                        public void success(Object... objects) {
                            if ((Boolean) objects[0] == false) {
                                if ((Boolean) objects[1]) {
                                    if (G.user.isActive()) {  // زمانی که کاربر فعال باشد
                                        if (G.user.getPassword().equals(edtPassword.getText().toString())) {
                                            if (checkBox.isChecked()) {  // زمانی که روی مرا به خاطر بسپار کلیک کرده است
                                                utils.setSharedPreferences("isLogged", true);
                                            }
                                            //ورود کاربر
                                            utils.goTo(LoginActivity.this, MainActivity.class);  //null=صفحه اصلی
                                        } else {
                                            Toast.makeText(G.context, "رمز عبور اشتباه است", Toast.LENGTH_SHORT).show();
                                        }
                                    } else {
                                        Toast.makeText(G.context, "کاربر مسدود شده است", Toast.LENGTH_SHORT).show(); //در صورت نیاز*
                                    }

                                } else {
                                    Toast.makeText(G.context, "کاربری با این نام کاربری وجود ندارد", Toast.LENGTH_SHORT).show();
                                }

                            } else {
                                Toast.makeText(G.context, "خطا در اتصال به شبکه", Toast.LENGTH_SHORT).show();
                            }

                        }
                    });
                } else {
                    Toast.makeText(G.context, "نام کاربری یا رمزعبور خالی است!", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


    private void init() {
        toolbar = findViewById(R.id.activity_login_toolbar);
        edtPassword = findViewById(R.id.activity_login_edtPassword);
        edtUserName = findViewById(R.id.activity_login_edtUserName);
        edtLUserName = findViewById(R.id.activity_login_edtLUserName);
        edtLPassword = findViewById(R.id.activity_login_edtLPassword);
        btnLogin = findViewById(R.id.activity_login_btnLogin);
        checkBox = findViewById(R.id.activity_login_chk1);
    }
}