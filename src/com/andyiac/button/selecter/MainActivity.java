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

//        for (int i = 0; i < mVals.length; i++) {
//            lables.add(mVals[i]);
//        }

        // todo 传给 SelectView 一个空的list 点击就增加和删除

        // todo

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


//        for (int i = 0; i < mVals.length; i++) {
//
//            final SelectView tv = (SelectView) mInflater.inflate(R.layout.select_view_item, flowLayout, false);
//            tv.setText(mVals[i]);
//            flowLayout.addView(tv);
//            tv.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if (lables.size() >= 5 && !tv.mToggle().toString().startsWith("_remove")) {
//                        Toast.makeText(MainActivity.this, "最多添加5个标签", Toast.LENGTH_SHORT).show();
//                        return;
//                    }
//                    String lable = tv.mToggle();
//                    lables.add(lable);
//
//                    if (lable.startsWith("_remove")) {
//                        lables.remove(lable.substring("_remove".length() - 1, lable.length() - 1));
//                        Log.e("TAG", "=====lables===>>" + lables);
//                        Toast.makeText(MainActivity.this, "删除标签" + lable, Toast.LENGTH_SHORT).show();
//                    }
//
//
//                }
//            });
//        }
    }

}
