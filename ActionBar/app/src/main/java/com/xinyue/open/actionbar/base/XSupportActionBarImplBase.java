package com.xinyue.open.actionbar.base;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by cc_want on 2017/3/27.
 */

public abstract class XSupportActionBarImplBase extends XSupportActionBar {

    View contentView;
    protected final Context mContext;
    MenuPopup mMenu;
    private OnActionBarMenuClickListener mOnActionBarMenuClickListener;

    public XSupportActionBarImplBase(Context context) {
        mContext=context;
    }
    /**
     * Set the activity ActionBar from a layout resource.
     * @param layoutResID Resource ID to be inflated.
     * @see #setContentView(android.view.View)
     */
    public final void setContentView(int layoutResID){
        final LayoutInflater inflater =LayoutInflater.from(mContext);
        contentView=inflater.inflate(layoutResID,null, false);
        setContentView(contentView);
    }
    /**
     * Set the activity content to an explicit view.
     * @param view The desired content to display.
     * @see #setContentView(int)
     */
    public final void setContentView(View view){
        ((AppCompatActivity)mContext).getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        ((AppCompatActivity)mContext).getSupportActionBar().setCustomView(view);
    }
    public final View findViewById(int resId){
        return contentView.findViewById(resId);
    }

    public void setBackgroundResource(int resId){
        contentView.setBackgroundResource(resId);
    }

    public void setOnActionBarMenuClickListener(OnActionBarMenuClickListener listener){
        mOnActionBarMenuClickListener = listener;
    }
    protected final void menuClick(View v){
        if(mOnActionBarMenuClickListener != null){
            mOnActionBarMenuClickListener.onMenuClick(v);
        }
    }
    /**
     * Set the Menu to display.
     * @param layoutResID Resource ID to be inflated.
     */
    public void setActionBarMenu(int layoutResID){
        mMenu=new MenuPopup(mContext,layoutResID);
        onCreateMenu(mMenu.getContentView());
    }
    /**
     * When the menu is created.
     * @param view The View is MenuView
     */
    public void onCreateMenu(View view){

    }

    /**
     * Set the Menu item on click listener.
     * @param resId This is a Item Layout Resource ID
     */
    public void setOnMenuItemListener(int resId){
        if(mMenu == null){
            return ;
        }
        View v=mMenu.getContentView();
        v.findViewById(resId).setOnClickListener(new OnMenuItemListener());
    }

    /**
     * Called when a menu iten has been selected.
     * @param v This View is item
     */
    public void onMenuItemSelected(View v){

    }
    /**
     * Display Menu
     * @param v
     */
    public void showActionBarMenu(View v){
        mMenu.show(v);
    }

    private class OnMenuItemListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            onMenuItemSelected(v);
            mMenu.dismiss();
        }
    }
    public interface OnActionBarMenuClickListener{
        void onMenuClick(View v);
    }
}
