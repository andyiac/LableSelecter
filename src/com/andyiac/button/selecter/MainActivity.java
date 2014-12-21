package com.andyiac.button.selecter;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends Activity {
    private SelectView selectView;
    private FlowLayout flowLayout;

    private String[] mVals = new String[]
            {"Hello", "Android", "Weclome Hi ", "Button", "TextView", "Hello",
                    "Android", "Weclome", "Button ImageView", "TextView", "Helloworld",
                    "Android", "Weclome Hello", "Button Text", "TextView"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        selectView = (SelectView) findViewById(R.id.id_btn_selecter);
        selectView.setText("000");
        selectView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                selectView.mToggle();
            }
        });

        flowLayout = (FlowLayout) findViewById(R.id.flow_layout);
        initData();
    }

    public void initData() {
        LayoutInflater mInflater = LayoutInflater.from(this);

        for (int i = 0; i < mVals.length; i++) {
            final SelectView tv = (SelectView) mInflater.inflate(R.layout.select_view_item, flowLayout, false);
            tv.setText(mVals[i]);
            flowLayout.addView(tv);
            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tv.mToggle();
                }
            });
        }
    }

}
