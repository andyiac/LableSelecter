package com.andyiac.button.selecter;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;


public class SelectView extends TextView {

    private boolean mChecked = false;


    public SelectView(Context context) {
        this(context, null);
    }

    public SelectView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SelectView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setDefaultState();
    }

    public void mToggle() {
        if (mChecked)
            setDefaultState();
        else
            setPressedState();
    }

    private void setPressedState() {
        this.setBackgroundResource(R.drawable.select_bg_checked);
//        this.setTextColor(android.R.color.white);
        mChecked = true;
    }

    private void setDefaultState() {
        this.setBackgroundResource(R.drawable.select_bg_normal);
//        this.setTextColor(android.R.color.darker_gray);
        mChecked = false;
    }
}
