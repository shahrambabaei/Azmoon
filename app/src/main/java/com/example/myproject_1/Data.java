package com.example.myproject_1;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.myproject_1.Models.Users;

import org.json.JSONException;
import org.json.JSONObject;

public class Data {
    private Context context;
    private RequestQueue requestQueue = null;
    private boolean isError = false;
    private boolean status = false;

    public Data(Context context) {
        this.context = context;
        requestQueue = Volley.newRequestQueue(context);
    }

    public void Login(String userName, OnResult onResult) {

//        JSONObject jsonObject = new JSONObject();
//        try {
//            jsonObject.put("userName", userName);
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                JsonObjectRequest request = new JsonObjectRequest(
//                        Request.Method.POST,
//                        "آدرس Api",
//                        jsonObject,
//                        response -> {
//                            try {
//                                if (response.getInt("userId") > 0) {  // زمانی که کاربری در سیستم با نام وارد شده کاربر وجود داشته باشد
//                                    G.user.setUserId(response.getInt("userId"));
//                                    G.user.setName(response.getString("name"));
//                                    G.user.setFamily(response.getString("family"));
//                                    G.user.setMobileNumber(response.getString("mobileNumber"));
//                                    G.user.setPassword(response.getString("password"));
//                                    G.user.setActive(response.getBoolean("isActive"));
//                                    status = true;
//                                } else {
//                                    G.user.setUserId(0);
//                                }
//                            } catch (JSONException e) {
//                                e.printStackTrace();
//                            }
//                        },
//                        new Response.ErrorListener() {
//                            @Override
//                            public void onErrorResponse(VolleyError error) {
//                                isError = true;
//                            }
//                        });
//                requestQueue.add(request);
//            }
//        });
//        thread.start();
//        onResult.success((boolean) isError, (boolean) status);


        //data fake
        G.user.setUserId(1);
        G.user.setName("admin");
        G.user.setFamily("admin");
        G.user.setMobileNumber("09181234567");
        G.user.setPassword("1234");
        G.user.setActive(true);
        G.user.setFieldId((byte) 1);
        onResult.success((boolean) false, (boolean) true);

    }
}
