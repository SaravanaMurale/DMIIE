package com.pojo.dmiie.util;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

public class PreferenceUtil {

    public static final String SHARED_PREF_NAME = "dmiie";
    public static final String USER_ID="user_id";
    public static final String AUTH_TOKEN="auth_token";
    public static final String ACCESS="access";
    public static final String RIGHTS="rights";
    public static final String USER_NAME="user_name";




    public static void setValueString(Context context, String key, String value) {

        if (context == null) return;
        SharedPreferences preferences = context.getSharedPreferences(SHARED_PREF_NAME, Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key, value);
        editor.apply();

    }

    public static String getValueString(Context context, String key) {

        SharedPreferences preferences = context.getSharedPreferences(SHARED_PREF_NAME, Activity.MODE_PRIVATE);
        return preferences.getString(key, null);

    }


    public static void setValueSInt(Context context, String key, int value) {

        if (context == null) return;
        SharedPreferences preferences = context.getSharedPreferences(SHARED_PREF_NAME, Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(key, value);
        editor.apply();

    }

    public static int getValueInt(Context context, String key) {
        SharedPreferences preferences = context.getSharedPreferences(SHARED_PREF_NAME, Activity.MODE_PRIVATE);
        return preferences.getInt(key, -1);

    }

    public static void remove(Context contextRemoveRewardID, String key) {

        SharedPreferences removeRewardID = contextRemoveRewardID.getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = removeRewardID.edit();
        editor.remove(key);
        editor.commit();


    }

    public static void clear(Context context) {
        SharedPreferences preferences = context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.apply();
    }


}
