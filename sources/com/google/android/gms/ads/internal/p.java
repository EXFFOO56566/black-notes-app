package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.eq1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class p extends AsyncTask<Void, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ l f1434a;

    private p(l lVar) {
        this.f1434a = lVar;
    }

    /* synthetic */ p(l lVar, k kVar) {
        this(lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            this.f1434a.i = (eq1) this.f1434a.d.get(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            co.c(BuildConfig.FLAVOR, e);
        }
        return this.f1434a.b2();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        if (this.f1434a.g != null && str2 != null) {
            this.f1434a.g.loadUrl(str2);
        }
    }
}
