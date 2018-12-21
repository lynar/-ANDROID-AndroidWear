package com.example.lynar.finalhelp;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class WarRoom2 extends WearableActivity {

    private TextView mTextView;
    private ImageButton cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_war_room2);

        cancel =(ImageButton)findViewById(R.id.imageButton);
        cancel.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                try {
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.intro_text, duration);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
