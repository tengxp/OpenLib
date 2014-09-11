package com.open.lib;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

/**
 * Created by showmo on 2014/8/25.
 */
public class WakeUpActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }
}
