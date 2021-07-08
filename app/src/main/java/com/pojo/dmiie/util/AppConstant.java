package com.pojo.dmiie.util;

import android.content.Context;

public class AppConstant {

    public static final String BASE_URL="https://dmi.allsoftbooks.com/";
    public static final String DEVICE="web";

    public static final String RIGHTS_ADMIN="rw+";
    public static final String RIGHTS_SALESPERSON="r";

    // admin "rw+",
    // sales r


    public static String getAuthToken(Context context){
        String token=PreferenceUtil.getValueString(context,PreferenceUtil.AUTH_TOKEN);
        return token;

    }

}
