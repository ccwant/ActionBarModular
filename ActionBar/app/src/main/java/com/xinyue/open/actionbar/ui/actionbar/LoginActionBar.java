package com.xinyue.open.actionbar.ui.actionbar;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.xinyue.open.actionbar.base.XSupportActionBarNormal;

/**
 * Created by cc_want on 2017/3/27.
 */
public class LoginActionBar extends XSupportActionBarNormal {
    public LoginActionBar(Context context) {
        super(context);
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置返回按钮隐藏
        setBackVisibility(View.GONE);
        //此处若想获取到LoginActivity可以通过强制转换上下文对象来获取LoginActivity
        //(LoginActivity)mContext
    }
}
