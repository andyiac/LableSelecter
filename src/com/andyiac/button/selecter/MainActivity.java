package com.andyiac.button.selecter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.*;

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

        setLocation();
    }


    private ArrayList<String> lables = new ArrayList<String>();

    public void initData() {
        LayoutInflater mInflater = LayoutInflater.from(this);


        // todo 传给 SelectView 一个空的list 点击就增加和删除

        for (String mVal : mVals) {
            final SelectView sv = (SelectView) mInflater.inflate(R.layout.select_view_item, flowLayout, false);
            sv.setText(mVal);
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

    //设置本Activity的位置
    private void setLocation() {
        WindowManager m = getWindowManager();
        Display d = m.getDefaultDisplay();//为获取屏幕宽、高

        WindowManager.LayoutParams p = getWindow().getAttributes();//获取对话框当前的参数值
        p.height = (int) (d.getHeight() * 0.35);//高度设置为屏幕的1.0
        p.width = (int) (d.getWidth() * 1.0);//宽度设置为屏幕的0.8
        p.alpha = 1.0f;//设置本身透明度
        p.dimAmount = 0.0f;//设置黑暗度

        getWindow().setAttributes(p);//设置生效
        getWindow().setGravity(Gravity.BOTTOM);//设置靠右对齐
    }
}
