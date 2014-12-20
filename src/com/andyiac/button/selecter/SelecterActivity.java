package com.andyiac.button.selecter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class SelecterActivity extends Activity {
    private SelectView selectView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        selectView = (SelectView) findViewById(R.id.id_btn_selecter);
        selectView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectView.mToggle();
            }
        });

    }
}
