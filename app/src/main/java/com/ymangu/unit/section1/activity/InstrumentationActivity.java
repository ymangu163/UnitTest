package com.ymangu.unit.section1.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ymangu.unit.R;

/**
 * Created by gao on 2017/10/3.
 */

public class InstrumentationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrumentation);

        final TextView infoTextView = (TextView) findViewById(R.id.info_text_view);
        final Button clickMeButton = (Button) findViewById(R.id.launch_next_activity_button);
        clickMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoTextView.setVisibility(View.VISIBLE);
                infoTextView.setText(getString(R.string.info_text));
            }
        });
    }

    public void sayHello(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        EditText editText = (EditText) findViewById(R.id.editText);
        textView.setText("Hello, " + editText.getText().toString() + "!");
    }



}
