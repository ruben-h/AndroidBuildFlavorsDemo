package com.envyandroid.buildflavors;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by EnvyAndroid
 */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String LOG_TAG = "BuildFlavorsExample";

        //Flavor will be FREE or DONATE:
        Log.d(LOG_TAG, "This is flavor: " + BuildConfig.FLAVOR);

        //You can get hold of your variable from the buildConfigField in build.gradle:
        //Will be true or false
        Log.d(LOG_TAG, "This is version: " + BuildConfig.IS_DONATE);

        Log.d(LOG_TAG, "Version from Version.java: " + Version.getVersion());
    }
}
