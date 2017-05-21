package com.demo.cks.multipleflavors;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.text);

        textView.setText("app :"+BuildConfig.FLAVOR+" "+BuildConfig.BUILD_TYPE);
        textView.append("\nlib :"+BuildConfig.libFlavor+" "+BuildConfig.libBuildType);
    }
}
