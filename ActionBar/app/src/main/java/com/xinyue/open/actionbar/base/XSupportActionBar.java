package com.xinyue.open.actionbar.base;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by cc_want on 2017/3/27.
 */
public abstract class XSupportActionBar {

    public abstract void onCreate(Bundle savedInstanceState);

    public abstract void setTitle(CharSequence title);
    public abstract void setTitleColor(int color);
    public abstract void setDividerVisibility(int visibility);

    public static XSupportActionBar create(Activity activity){
        return XSupportActionBarFactory.create(activity);
    }
}
