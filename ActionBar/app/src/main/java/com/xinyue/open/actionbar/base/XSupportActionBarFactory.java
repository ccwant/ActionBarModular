package com.xinyue.open.actionbar.base;

import android.app.Activity;

import com.xinyue.open.actionbar.ui.LoginActivity;
import com.xinyue.open.actionbar.ui.MainActivity;
import com.xinyue.open.actionbar.ui.actionbar.LoginActionBar;
import com.xinyue.open.actionbar.ui.actionbar.MainActionBar;

/**
 * Created by cc_want on 2017/3/27.
 */
public class XSupportActionBarFactory {
    public static XSupportActionBar create(Activity activity){
        if(activity instanceof LoginActivity){
            return new LoginActionBar(activity);
        }else if(activity instanceof MainActivity){
            return new MainActionBar(activity);
        }
        return null;
    }
}
