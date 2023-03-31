package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;

public final class ie1 {
    public static void a(Context context, boolean z) {
        String sb;
        if (z) {
            sb = "This request is sent from a test device.";
        } else {
            on2.a();
            String a2 = sn.a(context);
            StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 101);
            sb2.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
            sb2.append(a2);
            sb2.append("\") to get test ads on this device.");
            sb = sb2.toString();
        }
        co.c(sb);
    }

    public static void a(Throwable th, String str) {
        int a2 = gp0.a(th);
        StringBuilder sb = new StringBuilder(31);
        sb.append("Ad failed to load : ");
        sb.append(a2);
        co.c(sb.toString());
        wk.e(str, th);
        if (gp0.a(th) != 3) {
            q.g().b(th, str);
        }
    }
}
