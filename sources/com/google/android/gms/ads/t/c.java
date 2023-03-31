package com.google.android.gms.ads.t;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import b.c.b.a.c.j;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f1489a;

    public c(Context context) {
        try {
            Context b2 = j.b(context);
            this.f1489a = b2 == null ? null : b2.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f1489a = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final float a(String str, float f) {
        try {
            if (this.f1489a == null) {
                return 0.0f;
            }
            return this.f1489a.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    /* access modifiers changed from: package-private */
    public final String a(String str, String str2) {
        try {
            return this.f1489a == null ? str2 : this.f1489a.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }

    public final boolean a(String str, boolean z) {
        try {
            if (this.f1489a == null) {
                return false;
            }
            return this.f1489a.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }
}
