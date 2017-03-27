package com.xinyue.open.actionbar.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.xinyue.open.actionbar.R;

/**
 * Created by Administrator on 2017/3/27.
 */

public abstract class XSupportActionBarNormal extends XSupportActionBarImplBase {

    private BaseClick mBaseClick;
    private ImageView mImgBack;
    private TextView mTxtTitle;
    private ImageButton mIbtnMenu1;
    private TextView mTxtMenu1;


    public XSupportActionBarNormal(Context context) {
        super(context);
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.abs_normal_action_bar);
        init();
    }
    private void init(){
        mBaseClick=new BaseClick();
        mImgBack=(ImageView)findViewById(R.id.action_bar_back);
        mTxtTitle=(TextView)findViewById(R.id.action_bar_title);
        mIbtnMenu1=(ImageButton)findViewById(R.id.ibtn_menu_1);
        mTxtMenu1=(TextView)findViewById(R.id.txt_menu_1);
        mImgBack.setOnClickListener(mBaseClick);
        mIbtnMenu1.setOnClickListener(mBaseClick);
        mTxtMenu1.setOnClickListener(mBaseClick);
        mImgBack.setVisibility(View.VISIBLE);
        mIbtnMenu1.setVisibility(View.GONE);
        mTxtMenu1.setVisibility(View.GONE);
    }


    @Override
    public void setTitle(CharSequence title) {
        mTxtTitle.setText(title);
    }

    @Override
    public void setTitleColor(int color) {
        mTxtTitle.setTextColor(color);
    }

    @Override
    public void setDividerVisibility(int visibility) {
        findViewById(R.id.action_bar_divider).setVisibility(visibility);
    }

    /**
     * 设置返回按钮的显示方式
     * @param visibility
     */
    public void setBackVisibility(int visibility){
        mImgBack.setVisibility(visibility);
    }

    /**
     * 设置图片菜单按钮的显示方式
     * @param visibility
     */
    public void setMenuImageVisibility(int visibility){
        if(visibility == View.VISIBLE){
            mTxtMenu1.setVisibility(View.GONE);
        }
        mIbtnMenu1.setVisibility(visibility);
    }

    /**
     * 设置文字菜单按钮的显示方式
     * @param visibility
     */
    public void setMenuTextVisibility(int visibility){
        if(visibility == View.VISIBLE){
            mIbtnMenu1.setVisibility(View.GONE);
        }
        mTxtMenu1.setVisibility(visibility);
    }

    /**
     * 设置菜单按钮图标
     * @param resId
     */
    public void setMenuImageResource(int resId){
        mIbtnMenu1.setImageResource(resId);
    }

    /**
     * 设置菜单按钮文字内容
     * @param text
     */
    public void setMenuText(CharSequence text){
        mTxtMenu1.setText(text);
    }

    private class BaseClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.action_bar_back:
                    ((Activity)mContext).finish();
                    break;
                case R.id.ibtn_menu_1:
                case R.id.txt_menu_1:
                    menuClick(v);
                    break;
                default:
                    break;
            }
        }
    }


}
