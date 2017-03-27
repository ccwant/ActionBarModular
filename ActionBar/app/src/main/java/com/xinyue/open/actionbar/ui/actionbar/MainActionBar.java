package com.xinyue.open.actionbar.ui.actionbar;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.xinyue.open.actionbar.R;
import com.xinyue.open.actionbar.base.XSupportActionBarImplBase;
import com.xinyue.open.actionbar.base.XSupportActionBarNormal;

/**
 * Created by Administrator on 2017/3/27.
 */

public class MainActionBar extends XSupportActionBarNormal implements XSupportActionBarImplBase.OnActionBarMenuClickListener {

    public MainActionBar(Context context) {
        super(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置菜单显示
        setMenuTextVisibility(View.VISIBLE);

        setActionBarMenu(R.layout.actionbar_menu);
        ///

        setOnActionBarMenuClickListener(this);
    }
    @Override
    public void onCreateMenu(View view) {
        setOnMenuItemListener(R.id.menu1);
        setOnMenuItemListener(R.id.menu2);
        setOnMenuItemListener(R.id.menu3);
    }
    @Override
    public void onMenuItemSelected(View v) {
        switch (v.getId()){
            case R.id.menu1:
                Toast.makeText(mContext,"菜单1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu2:
                Toast.makeText(mContext,"菜单2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu3:
                Toast.makeText(mContext,"菜单3",Toast.LENGTH_SHORT).show();
                break;
        }
    }
    @Override
    public void onMenuClick(View v) {
        showActionBarMenu(v);
    }
}
