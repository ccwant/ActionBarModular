package com.xinyue.open.actionbar.ui;

import android.os.Bundle;

import com.xinyue.open.actionbar.R;
import com.xinyue.open.actionbar.base.XSupportActivity;
/**
 * Created by cc_want on 2017/3/27.
 */
public class MainActivity extends XSupportActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("ActionBar模块化");
    }
}
