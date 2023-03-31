package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.on2;
import com.google.android.gms.internal.ads.wk;
import com.google.android.gms.internal.ads.zr2;

public final class b {
    private static boolean a(Context context, Intent intent, t tVar) {
        try {
            String valueOf = String.valueOf(intent.toURI());
            wk.e(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            q.c();
            gl.a(context, intent);
            if (tVar == null) {
                return true;
            }
            tVar.a();
            return true;
        } catch (ActivityNotFoundException e) {
            co.d(e.getMessage());
            return false;
        }
    }

    public static boolean a(Context context, d dVar, t tVar) {
        String str;
        int i = 0;
        if (dVar == null) {
            str = "No intent data for launcher overlay.";
        } else {
            zr2.a(context);
            Intent intent = dVar.i;
            if (intent != null) {
                return a(context, intent, tVar);
            }
            Intent intent2 = new Intent();
            if (TextUtils.isEmpty(dVar.f1416c)) {
                str = "Open GMSG did not contain a URL.";
            } else {
                if (!TextUtils.isEmpty(dVar.d)) {
                    intent2.setDataAndType(Uri.parse(dVar.f1416c), dVar.d);
                } else {
                    intent2.setData(Uri.parse(dVar.f1416c));
                }
                intent2.setAction("android.intent.action.VIEW");
                if (!TextUtils.isEmpty(dVar.e)) {
                    intent2.setPackage(dVar.e);
                }
                if (!TextUtils.isEmpty(dVar.f)) {
                    String[] split = dVar.f.split("/", 2);
                    if (split.length < 2) {
                        String valueOf = String.valueOf(dVar.f);
                        co.d(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                        return false;
                    }
                    intent2.setClassName(split[0], split[1]);
                }
                String str2 = dVar.g;
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        i = Integer.parseInt(str2);
                    } catch (NumberFormatException unused) {
                        co.d("Could not parse intent flags.");
                    }
                    intent2.addFlags(i);
                }
                if (((Boolean) on2.e().a(zr2.U1)).booleanValue()) {
                    intent2.addFlags(268435456);
                    intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
                } else {
                    if (((Boolean) on2.e().a(zr2.T1)).booleanValue()) {
                        q.c();
                        gl.b(context, intent2);
                    }
                }
                return a(context, intent2, tVar);
            }
        }
        co.d(str);
        return false;
    }
}
