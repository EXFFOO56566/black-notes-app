package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.concurrent.Callable;

final class ln implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f3581a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f3582b;

    ln(jn jnVar, Context context, Context context2) {
        this.f3581a = context;
        this.f3582b = context2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.f3581a != null) {
            wk.e("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f3581a.getSharedPreferences("admob_user_agent", 0);
        } else {
            wk.e("Attempting to read user agent from local cache.");
            sharedPreferences = this.f3582b.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", BuildConfig.FLAVOR);
        if (TextUtils.isEmpty(string)) {
            wk.e("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f3582b);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                wk.e("Persisting user agent.");
            }
        }
        return string;
    }
}
