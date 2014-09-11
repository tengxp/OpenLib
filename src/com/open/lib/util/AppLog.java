package com.open.lib.util;

import android.util.Log;

/**
 * Created by showmo on 2014/8/21.
 */
public class AppLog {
    public static final int TYPE_INFO = 0;
    public static final int TYPE_DEBUG = 1;
    public static final int TYPE_WARN = 2;
    public static final int TYPE_ERROR = 3;

    private final String mTag;
    private boolean sDebug = true;

    public AppLog(Object obj) {
        mTag = obj.getClass().getSimpleName();
    }

    public static AppLog getInstance(Object obj) {
        AppLog log = new AppLog(obj);
        return log;
    }

    public void i(String msg) {
        print(TYPE_INFO, msg);
    }

    public void d(String msg) {
        print(TYPE_DEBUG, msg);
    }

    public void w(String msg) {
        print(TYPE_WARN, msg);
    }

    public void e(String msg) {
        print(TYPE_ERROR, msg);
    }

    private void print(int type, String msg) {
        if (!sDebug)
            return;

        switch (type) {
            case TYPE_INFO:
                Log.i(mTag, msg);
                break;

            case TYPE_DEBUG:
                Log.d(mTag, msg);
                break;

            case TYPE_WARN:
                Log.w(mTag, msg);
                break;

            case TYPE_ERROR:
                Log.e(mTag, msg);
                break;
        }
    }
}
