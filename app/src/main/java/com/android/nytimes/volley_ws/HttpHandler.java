package com.android.nytimes.volley_ws;

/**
 * Created by N!K$ on 1/18/2018.
 */

import android.content.Context;
import android.util.Log;

import com.android.nytimes.R;
import com.android.nytimes.utils.DialogUtils;
import com.android.nytimes.utils.LogUtils;
import com.android.nytimes.utils.Utility;
import com.android.nytimes.ws_models.NewsModel;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.toolbox.Volley;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;


public class HttpHandler {

    private static final String TAG = HttpHandler.class.getSimpleName();
    Context context;
    DialogUtils dialogUtils;
    public HttpHandler(Context context) {
        this.context = context;
        dialogUtils = new DialogUtils();
    }


    private Map<String, String> getHeader() {
        Map<String, String> map = new HashMap<>();
        map.put("Content-Type", "application/json; charset=utf-8");
        //map.put("Content-Type", "application/json");
        return map;
    }

    private <T> Response.Listener<T> getOnResponse(final Response.Listener<T> onResponse) {
        return response -> {
            if (onResponse == null)
                return;
            dialogUtils.hideLoader();
            onResponse.onResponse(response);
        };
    }

    private Response.ErrorListener getOnErrorResponse() {
        return error -> {
            //Utils.hideLoading();
            dialogUtils.hideLoader();
            if (error == null || error.networkResponse == null){
                DialogUtils.showAlertDialogOnly(context, "An error occured, please try again after sometime.");
                return;
            }
            LogUtils.logError(TAG, "onErrorResponse: " + error.getMessage());
            //DialogUtils.showError(context, error.getMessage(), null);
            DialogUtils.showAlertDialogOnly(context, getErrorMessage(error.networkResponse.statusCode));
        };
    }

    private String getErrorMessage(int statusCode){
        switch (statusCode){
            case 204:
                return "No content found";
            case 400:
                return "Unauthenticated Access";
            case 401:
                return "User Role Has no Access to this Service Method";
            case 403:
                return "Invalid Service Information or Forbidden Access";
            case 404:
                return "Request/File could not found.";
            case 500:
                return "System error or Internal server error";
            case 412:
                return "The data provided is insufficient";
            case 301:
                return "Http/Http(s) URL connection problem, please check it...";
            case 302:
                return "Http/Http(s) URL connection problem, please check it...";
            case 303:
                return "Http/Http(s) URL connection problem, please check it...";
            default:
                return "An error occured, please try again after sometime.";
        }
    }

    public <T> void makeServiceCall(final String reqUrl, Class<T> clazz,
                                    Response.Listener<T> onResponse) {
        makeServiceCall(Request.Method.GET, reqUrl, null, clazz, onResponse, getOnErrorResponse());
    }

    public <T> void makeServiceCall(final String reqUrl, Class<T> clazz, JSONObject body, Response.Listener<T> onResponse) {

        makeServiceCall(body == null ? Request.Method.GET : Request.Method.POST, reqUrl, body, clazz, onResponse, getOnErrorResponse());
    }

    public <T> void makeServiceCall(final String reqUrl, JSONObject body, Class<T> clazz,
                                    Response.Listener<T> onResponse, Response.ErrorListener onError) {
        makeServiceCall(body == null ? Request.Method.GET : Request.Method.POST, reqUrl, body, clazz, onResponse, onError);
    }

    public <T> void makeServiceCall(final int method, final String reqUrl, JSONObject body, Class<T> clazz,
                                    Response.Listener<T> onResponse, Response.ErrorListener onError) {
        if (!Utility.isConnectingToInternet(context)) {
            DialogUtils.showAlertDialogOnly(context, context.getString(R.string.nointernet));
            return;
        }

        dialogUtils.showLoader(context);
        SSLConnection.allowAllSSL();

        if (body != null) {
            try {
                LogUtils.logError(TAG, "makeServiceCall: " + body.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        GsonRequest<T> jsonObjectRequest = new GsonRequest<T>(method, /*HttpConstants.SOAP_BASE_URL + */reqUrl, body, clazz, getOnResponse(onResponse), onError);

        makeRequest(jsonObjectRequest);
    }


    private void makeRequest(Request request) {
        RequestQueue requestQueue;
        requestQueue = Volley.newRequestQueue(context);
        RetryPolicy policy = new DefaultRetryPolicy(60000, 2, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        //RetryPolicy policy = new DefaultRetryPolicy(10000, 1, 1.0f);
        request.setRetryPolicy(policy);
        requestQueue.add(request);

    }

    // GET NEW YORK NEWS
    public void getNewYorkNews(Response.Listener<NewsModel> onResponse, int newsFilterInDays){
        makeServiceCall(HttpConstants.GET_NEWS + newsFilterInDays +".json?apikey="+ HttpConstants.NEWS_API_KEY, NewsModel.class, null, onResponse);
    }
}
