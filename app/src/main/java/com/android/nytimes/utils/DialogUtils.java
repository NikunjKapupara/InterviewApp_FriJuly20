package com.android.nytimes.utils;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.nytimes.R;
import com.android.nytimes.callbacks_interfaces.ConfirmAlertCallBack;
import com.android.nytimes.callbacks_interfaces.GetCallbackFromNewsSearchFilter;

import java.util.HashMap;

/**
 * Created by N!K$ on 11/6/2017.
 */

public class DialogUtils {

    Dialog dialogLoader = null;

    ////show custom loader dialgo
    public void showLoader(Context mContext) {
        if (dialogLoader == null) {
            dialogLoader = new Dialog(mContext);
            dialogLoader.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialogLoader.setContentView(R.layout.custom_loader_dialog_layout);
            dialogLoader.setCancelable(false);
            dialogLoader.getWindow().getAttributes().windowAnimations = R.style.LoaderDiaogAnim;
            dialogLoader.setCanceledOnTouchOutside(false);
            dialogLoader.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        }
        dialogLoader.show();
    }

    //hide loader dialog
    public void hideLoader() {
        if (dialogLoader == null)
            return;

        if (dialogLoader.isShowing()) {
            dialogLoader.dismiss();
            dialogLoader.hide();
        }
    }



    /***
     * * PLEASE USE THIS DIALOG : to show Single button Only (Without click action callback)
     * @param mContext
     * @param mMessage
     */
    public static void showAlertDialogOnly(Context mContext, String mMessage) {
        final Dialog dialog = new Dialog(mContext);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.single_button_dialog);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(false);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        TextView message = dialog.findViewById(R.id.yourMessage);
        message.setText(mMessage);
        (dialog.findViewById(R.id.btnOK)).setOnClickListener(view -> dialog.dismiss());
        dialog.show();
    }

    /**
     * * PLEASE USE THIS DIALOG : to show Single button dialog with Callback (With click action callback)
     * @param mContext
     * @param mMessage
     * @param callBack
     */
    public static void showAlertDialogWithCallback(Context mContext, String mMessage, final ConfirmAlertCallBack callBack) {
        final Dialog dialog = new Dialog(mContext);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.single_button_dialog);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        TextView message = dialog.findViewById(R.id.yourMessage);
        message.setText(mMessage);
        (dialog.findViewById(R.id.btnOK)).setOnClickListener(v -> {
            if (callBack != null) {
                callBack.getConfirmAlertCallBack(true, null);
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    /**
     * PLEASE USE THIS DIALOG : to show Confirmation (OK & CANCEL) OR to show Double button dialog
     * @param mContext
     * @param message
     * @param alertCallback
     */
    public static void showConfirmationDialog(Context mContext, String message, final ConfirmAlertCallBack alertCallback) {
        final Dialog dialog = new Dialog(mContext);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.two_button_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(true);
        dialog.getWindow().getAttributes().windowAnimations = R.style.LoaderDiaogAnim;
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        TextView tMessage = dialog.findViewById(R.id.yourMessage);
        tMessage.setText(message);
        (dialog.findViewById(R.id.btnOK)).setOnClickListener(v -> {
            if (alertCallback != null) {
                alertCallback.getConfirmAlertCallBack(true, null);
            }
            dialog.dismiss();
        });
        (dialog.findViewById(R.id.btnCancel)).setOnClickListener(v -> {
            if (alertCallback != null) {
                alertCallback.getConfirmAlertCallBack(false, null);
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    /**
     * NEWS SEARCH FILTER DIALOG WITH CALLBACK Data passing.
     * @param mContext
     * @param callbackFromNewsSearchFilter
     * @param lastSearchFilter
     */
    public static void showNewsFilterDialog(Context mContext, GetCallbackFromNewsSearchFilter callbackFromNewsSearchFilter, int lastSearchFilter){
        final Dialog dialog = new Dialog(mContext);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.news_search_filter_dialog_layout);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        RadioButton todaysNewsRB = dialog.findViewById(R.id.todaysNewsRB);
        RadioButton lastWeekNewsRB = dialog.findViewById(R.id.lastWeekNewsRB);
        RadioButton lastMonthNewsRB = dialog.findViewById(R.id.lastMonthNewsRB);

        (dialog.findViewById(R.id.submitNewsFilterBTN)).setOnClickListener(view -> {
            int checkId = 0;
            if (todaysNewsRB.isChecked())
                checkId = 1;
            else if (lastWeekNewsRB.isChecked())
                checkId = 7;
            else
                checkId = 30;

            callbackFromNewsSearchFilter.getCallbackFromSearchNewsFilter(checkId, null);
            dialog.dismiss();

        });

        //// for setting last selected search
        if (lastSearchFilter == 1)
            todaysNewsRB.setChecked(true);
        else if (lastSearchFilter == 7)
            lastWeekNewsRB.setChecked(true);
        else
            lastMonthNewsRB.setChecked(true);

        dialog.show();
    }
}
