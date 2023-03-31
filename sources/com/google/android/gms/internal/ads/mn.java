package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.common.util.n;
import java.util.concurrent.Callable;

final class mn implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f3730a;

    mn(jn jnVar, Context context) {
        this.f3730a = context;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        SharedPreferences sharedPreferences = this.f3730a.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", BuildConfig.FLAVOR);
        if (!TextUtils.isEmpty(string)) {
            wk.e("User agent is already initialized on Google Play Services.");
            return string;
        }
        wk.e("User agent is not initialized on Google Play Services. Initializing.");
        n.a(this.f3730a, sharedPreferences.edit().putString("user_agent", WebSettings.getDefaultUserAgent(this.f3730a)), "admob_user_agent");
        throw null;
    }
}
