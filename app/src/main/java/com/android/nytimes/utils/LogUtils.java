package com.android.nytimes.utils;
import android.util.Log;
/**
 * Created by N!K$ on 8/30/2016.
 */
public class LogUtils {

    private static final String TAG = "NYTimes";
    private static boolean isLogEnable = true;

    public static void logDebug(String tag, String log) {
        if (!isLogEnable) {
            return;
        }
        try {
            if(log.length() > 3000){
                logLargeString(log);
            }
            else {
                Log.d(tag, log);
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Log.e("LOG-DEBUG:", "LOG PRINTING ERROR OCCURED...!");
        }
    }

    static void logLargeString(String data) {
        int maxLogSize = 1000;
        for(int i = 0; i <= data.length() / maxLogSize; i++) {
            int start = i * maxLogSize;
            int end = (i+1) * maxLogSize;
            end = end > data.length() ? data.length() : end;
            Log.v(TAG, data.substring(start, end));
        }
    }
    static void logErrorLargeString(String tag, String data) {
        int maxLogSize = 4000;
        for(int i = 0; i <= data.length() / maxLogSize; i++) {
            int start = i * maxLogSize;
            int end = (i+1) * maxLogSize;
            end = end > data.length() ? data.length() : end;


            Log.e(tag, data.substring(start, end));
        }
    }

    public static void logError(String tag, String log) {
        if (!isLogEnable) {
            return;
        }
        try {
            if (log == null) {
                return;
            }
            if (tag.isEmpty())
                tag = " ";
            else if (log.isEmpty())
                log = " ";

            if(log.length() > 3000){
                logErrorLargeString(tag, log);
            }
            else {
                Log.e(tag, log);
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Log.e("LOG-ERROR:", "LOG PRINTING ERROR OCCURED...!");
        }
    }

    public static void logDebug(String log) {
        logDebug(TAG, log);
    }

    public static void logError(String log) {
        logError(TAG, log);
    }

}
