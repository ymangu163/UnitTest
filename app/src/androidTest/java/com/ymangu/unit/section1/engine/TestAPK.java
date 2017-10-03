package com.ymangu.unit.section1.engine;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;

import com.robotium.solo.Solo;
import com.ymangu.unit.R;

import org.junit.Assert;

/**
 * Created by gao on 2017/10/3.
 */

public class TestAPK extends ActivityInstrumentationTestCase2 {
    private Solo solo;
    private static final String MainActivity = "com.ymangu.unit.section1.activity.RobotiumActivity";
    private static Class launchActivityClass;

    static {
        try {
            launchActivityClass = Class.forName(MainActivity);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public TestAPK() throws ClassNotFoundException {
        super(launchActivityClass);
    }


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testAddResult() throws Exception {
        EditText firstEt = solo.getEditText(0);
        solo.enterText(firstEt, "12");

        EditText secondEt = solo.getEditText(1);
        solo.enterText(secondEt, "19");

        solo.clickOnButton("ADD");
        String sum = ((TextView) solo.getView(R.id.tv_result)).getText().toString();
        Assert.assertEquals("31", sum);

        /*
        Activity act = solo.getCurrentActivity();
        int btnId=act.getResources().getIdentifier("launch_next_activity_button","id",act.getPackageName());
        solo.waitForView(btnId);
        solo.clickOnButton("hello world");

        int txtId=act.getResources().getIdentifier("info_text_view","id",act.getPackageName());
        TextView outMsg = (TextView)solo.getView(txtId);
        assertEquals("imooc Android Automation Testing",outMsg.getText().toString());
*/

    }

    @Override
    protected void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }
}
