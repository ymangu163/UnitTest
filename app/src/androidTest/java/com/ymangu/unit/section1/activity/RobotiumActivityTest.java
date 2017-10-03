package com.ymangu.unit.section1.activity;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;

import com.robotium.solo.Solo;
import com.ymangu.unit.R;

import org.junit.Assert;
import org.junit.Before;

/**
 * Created by gao on 2017/10/3.
 */
public class RobotiumActivityTest extends ActivityInstrumentationTestCase2<RobotiumActivity> {
    private Solo solo;

    public RobotiumActivityTest(){
        super(RobotiumActivity.class);
    }

    public RobotiumActivityTest(Class<RobotiumActivity> activityClass) {
        super(activityClass);
    }


    @Before
    public void setUp() throws Exception {
        super.setUp();
        solo=new Solo(getInstrumentation(),getActivity());

    }

    @Override
    protected void tearDown() throws Exception{
        solo.finishOpenedActivities();
        super.tearDown();
    }

    //robotium采用的是junit3，所以test case的命名都必须以test开头。
    public void testaddNum() throws Exception {
        EditText firstEt = solo.getEditText(0);
        solo.enterText(firstEt, "12");

        EditText secondEt = solo.getEditText(1);
        solo.enterText(secondEt, "19");

        solo.clickOnButton("ADD");
        String sum = ((TextView) solo.getView(R.id.tv_result)).getText().toString();
        Assert.assertEquals("31", sum);

    }

}



