package com.learn.dimdimasdim.learnservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnStartService, btnStartIntentService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartService = findViewById(R.id.btn_start_service);
        btnStartIntentService = findViewById(R.id.btn_start_intent_service);

        btnStartService.setOnClickListener(this);
        btnStartIntentService.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_start_service:
                Intent mStartServiceIntent = new Intent(this, OriginService.class);
                startService(mStartServiceIntent);
                break;
            case R.id.btn_start_intent_service:
                Intent mIntentService = new Intent(this,MyIntentService.class);
                mIntentService.putExtra(MyIntentService.EXTRA_DURATION, 5000);
                startService(mIntentService);
                break;
        }

    }
}
