package com.example.lynar.finalhelp;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.Button;
import android.widget.TextView;

public class Notification extends WearableActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        mTextView = (TextView) findViewById(R.id.text);
        Button annul = findViewById(R.id.button4);
        Button help = findViewById(R.id.button3);

        // Enables Always-on
        setAmbientEnabled();
    }
}
