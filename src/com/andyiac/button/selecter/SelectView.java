package com.andyiac.button.selecter;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;


public class SelectView extends Button {

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
        this.setBackgroundResource(R.drawable.bg_alibuybutton_pressed);
        mChecked = true;
    }

    private void setDefaultState() {
        this.setBackgroundResource(R.drawable.bg_alibuybutton_default);
        mChecked = false;
    }
}
