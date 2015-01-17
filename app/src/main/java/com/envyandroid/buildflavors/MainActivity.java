package com.envyandroid.buildflavors;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
