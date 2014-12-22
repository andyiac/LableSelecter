package com.andyiac.button.selecter;

import android.content.Context;
import android.graphics.Color;
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

    public String mToggle() {
        String lable = "";
        if (mChecked)
            lable = setDefaultState();
        else {
            lable = setPressedState();
        }

        return lable;
    }

    private String setPressedState() {
        this.setBackgroundResource(R.drawable.select_bg_checked);
        this.setTextColor(Color.WHITE);
        // this.setBackground(getContext().getResources().getDrawable(R.drawable.select_bg_checked));
        mChecked = true;
        return this.getText().toString();
    }

    private String setDefaultState() {
//        this.setBackground(getContext().getResources().getDrawable(R.drawable.select_bg_normal));
        this.setBackgroundResource(R.drawable.select_bg_normal);
        this.setTextColor(Color.GRAY);
        mChecked = false;
        return "_remove" + this.getText().toString();

    }
}
