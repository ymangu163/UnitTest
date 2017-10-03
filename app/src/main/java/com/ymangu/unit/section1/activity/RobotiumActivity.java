package com.ymangu.unit.section1.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.ymangu.unit.R;

/**
 * Created by gao on 2017/10/3.
 */

public class RobotiumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robotium);


    }

    public void addNum(View view) {
        EditText first = (EditText) findViewById(R.id.et_one);
        EditText second = (EditText) findViewById(R.id.et_two);
        TextView result = (TextView) findViewById(R.id.tv_result);

        String one = first.getText().toString();
        String two = second.getText().toString();

        if (!TextUtils.isEmpty(one) && !TextUtils.isEmpty(two)) {
            int num = Integer.parseInt(one) + Integer.parseInt(two);
            result.setText(String.valueOf(num));
        }
    }
}
