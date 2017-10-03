package com.ymangu.unit;

import android.content.Intent;

import com.common.activity.RecycleActivity;
import com.ymangu.unit.section1.activity.InstrumentationActivity;
import com.ymangu.unit.section1.activity.RobotiumActivity;

import java.util.Arrays;

public class MainActivity extends RecycleActivity {

     protected void handleClick(int position) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(this, InstrumentationActivity.class);
                break;
            case 1:
                intent = new Intent(this, RobotiumActivity.class);
                break;
            case 2:
//                intent = new Intent(this, CustomActivity.class);
                break;
            case 3:
//                intent = new Intent(this, FrameActivity.class);
                break;
        }

        if (intent != null) {
            startActivity(intent);
        }

    }

     public void initData() {
        String[] array = getResources().getStringArray(R.array.main);
        mDatas = Arrays.asList(array);
        mAdapter.setDatas(mDatas);
    }




}
