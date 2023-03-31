package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.q;

@TargetApi(24)
public class ul extends rl {
    private static boolean a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final boolean a(Activity activity, Configuration configuration) {
        if (!((Boolean) on2.e().a(zr2.c2)).booleanValue()) {
            return false;
        }
        if (((Boolean) on2.e().a(zr2.e2)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        on2.a();
        int b2 = sn.b(activity, configuration.screenHeightDp);
        int b3 = sn.b(activity, configuration.screenWidthDp);
        q.c();
        DisplayMetrics a2 = gl.a((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = a2.heightPixels;
        int i2 = a2.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) on2.e().a(zr2.b2)).intValue();
        return !(a(i, b2 + dimensionPixelSize, round) && a(i2, b3, round));
    }
}
