package com.xinyue.open.actionbar.base;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/**
 * Created by cc_want on 2017/3/22.
 */
public class MenuPopup {

    PopupWindow mWindow;
    public MenuPopup(Context context, int resId){
        View view=LayoutInflater.from(context).inflate(resId, null,false);
        mWindow = new PopupWindow(view, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        mWindow.setFocusable(true);
        mWindow.setOutsideTouchable(true);
        mWindow.setBackgroundDrawable(new ColorDrawable(0x00ffffff));
    }
    public void show(View v){
        mWindow.showAsDropDown(v);
    }
    public View getContentView(){
        return mWindow.getContentView();
    }
    public void dismiss(){
        mWindow.dismiss();
    }



}
