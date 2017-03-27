package com.xinyue.open.actionbar.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.xinyue.open.actionbar.R;
import com.xinyue.open.actionbar.base.XSupportActivity;

/**
 * Created by cc_want on 2017/3/27.
 */
public class LoginActivity extends XSupportActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("登录");
    }
    public void onLogin(View v){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
