package com.learn.dimdimasdim.learnservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyIntentService extends IntentService {

    public static String EXTRA_DURATION = "extra_duration";

    public static final String TAG = "MyIntenService";

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(TAG, "onHandleIntent()");
        if ( intent != null){
            int duration = intent.getIntExtra(EXTRA_DURATION, 0);
            try {
                Thread.sleep(duration);
            }catch (InterruptedException e){
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestrot()");
    }
}
