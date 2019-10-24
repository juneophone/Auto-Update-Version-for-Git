package com.eink.autoupdateandroidstudioversionname;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String Testversion = getString(R.string.VersionName);
        Log.i(TAG,"BuildVersion1= " + Testversion);
//        Log.i(TAG,"BuildVersion2 = " + BuildConfig.VersionName);
    }
}
