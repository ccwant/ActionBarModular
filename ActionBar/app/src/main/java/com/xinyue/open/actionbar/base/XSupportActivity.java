package com.xinyue.open.actionbar.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by cc_want on 2017/3/27.
 */
public abstract class XSupportActivity extends AppCompatActivity {

    private XSupportActionBar mActionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final XSupportActionBar actionBar=getXSupportActionBar();
        actionBar.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
    }
    public XSupportActionBar getXSupportActionBar(){
        if(mActionBar == null){
            mActionBar= XSupportActionBar.create(this);
        }
        return mActionBar;
    }
    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        getXSupportActionBar().setTitle(title);
    }
}
