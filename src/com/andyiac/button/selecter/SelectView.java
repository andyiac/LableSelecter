package com.andyiac.button.selecter;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.TextView;

import java.util.ArrayList;


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

    public ArrayList<String> mToggle(ArrayList<String> lables) {

        if (lables.size() >= 5 && !mChecked) return lables;

        if (mChecked) {
            lables = setNormalState(lables);
        } else {
            lables = setPressedState(lables);
        }
        return lables;
    }

    private ArrayList<String> setPressedState(ArrayList<String> lables) {
        this.setBackgroundResource(R.drawable.select_bg_checked);
        this.setTextColor(Color.WHITE);
        // this.setBackground(getContext().getResources().getDrawable(R.drawable.select_bg_checked));
        lables.add(this.getText().toString());
        mChecked = true;

        return lables;
    }

    private ArrayList<String> setNormalState(ArrayList<String> lables) {
//        this.setBackground(getContext().getResources().getDrawable(R.drawable.select_bg_normal));
        this.setBackgroundResource(R.drawable.select_bg_normal);
        this.setTextColor(Color.GRAY);
        lables.remove(this.getText().toString());
        mChecked = false;
        return lables;
    }

    private void setDefaultState() {
//        this.setBackground(getContext().getResources().getDrawable(R.drawable.select_bg_normal));
        this.setBackgroundResource(R.drawable.select_bg_normal);
        this.setTextColor(Color.GRAY);
        mChecked = false;
    }
}
