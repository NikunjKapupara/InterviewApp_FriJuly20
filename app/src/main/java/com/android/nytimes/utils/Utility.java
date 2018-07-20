package com.android.nytimes.utils;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by N!Ks on 7/19/18.
 */

public class Utility {

    public static boolean isConnectingToInternet(Context context) {
        try {
            ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

            if (connectivity != null) {
                NetworkInfo[] info = connectivity.getAllNetworkInfo();
                if (info != null) {
                    for (int i = 0; i < info.length; i++) {
                        LogUtils.logError("INTERNET:", String.valueOf(i));
                        if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                            LogUtils.logError("INTERNET:", "connected!");
                            return true;
                        }
                    }
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }



    public static String readJsonDataFromLocalFile(Activity activity, String localJsonFileName){
        String json = null;
        try {
            InputStream is = activity.getAssets().open(localJsonFileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
            //LogUtils.logError("Read Data: ", json);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        finally {
            return json;
        }
    }
}
