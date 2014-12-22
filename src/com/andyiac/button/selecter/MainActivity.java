package com.andyiac.button.selecter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private FlowLayout flowLayout;

    private String[] mVals = new String[]
            {"Hello", "Android", "Weclome Hi ", "Button", "TextView", "Hello",
                    "Android", "Weclome", "Button ImageView", "TextView", "Helloworld",
                    "Android", "Weclome Hello", "Button Text", "TextView"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        flowLayout = (FlowLayout) findViewById(R.id.flow_layout);
        initData();
    }


    private ArrayList<String> lables = new ArrayList<String>();

    public void initData() {
        LayoutInflater mInflater = LayoutInflater.from(this);


        // todo 传给 SelectView 一个空的list 点击就增加和删除

        for (int i = 0; i < mVals.length; i++) {
            final SelectView sv = (SelectView) mInflater.inflate(R.layout.select_view_item, flowLayout, false);
            sv.setText(mVals[i]);
            flowLayout.addView(sv);
            sv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    lables = sv.mToggle(lables);
                    Log.e("TAG", "=====lables====>" + lables);
                }
            });

        }

    }

}
