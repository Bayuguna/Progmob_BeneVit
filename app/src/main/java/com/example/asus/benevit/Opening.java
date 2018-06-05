package com.example.asus.benevit;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Asus on 4/22/2018.
 */

public class Opening extends AppCompatActivity {
    private LinearLayout OpeningView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);

        setupEnv();
        SetTimer(1500, MainActivity.class);
    }

    private void SetTimer(int delay, final Class intent) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),intent));
                finish();
            }
        },delay);
    }

    private void setupEnv() {
        OpeningView = (LinearLayout) findViewById(R.id.opening);

        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.KITKAT){
            OpeningView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

        }

    }
}
