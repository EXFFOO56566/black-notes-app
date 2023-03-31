package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ol implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4012a;

    /* renamed from: b  reason: collision with root package name */
    private final WebSettings f4013b;

    ol(Context context, WebSettings webSettings) {
        this.f4012a = context;
        this.f4013b = webSettings;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = this.f4012a;
        WebSettings webSettings = this.f4013b;
        if (context.getCacheDir() != null) {
            webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
            webSettings.setAppCacheMaxSize(0);
            webSettings.setAppCacheEnabled(true);
        }
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        webSettings.setAllowContentAccess(false);
        return true;
    }
}
