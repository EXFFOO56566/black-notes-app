package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import b.c.b.a.d.b;
import b.c.b.a.f.a.a;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ja {

    /* renamed from: b  reason: collision with root package name */
    private static ja f3196b;

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f3197a = new AtomicBoolean(false);

    ja() {
    }

    public static ja a() {
        if (f3196b == null) {
            f3196b = new ja();
        }
        return f3196b;
    }

    private static void a(Context context, a aVar) {
        try {
            ((gv) bo.a(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", ka.f3355a)).a(b.a(context), new ga(aVar));
        } catch (RemoteException | Cdo | NullPointerException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    static /* synthetic */ void b(Context context, String str) {
        zr2.a(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) on2.e().a(zr2.X)).booleanValue());
        a(context, a.a(context, "FA-Ads", "am", str, bundle));
    }

    private static boolean b(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    static /* synthetic */ void c(Context context) {
        zr2.a(context);
        if (((Boolean) on2.e().a(zr2.c0)).booleanValue() && b(context)) {
            a(context, a.a(context));
        }
    }

    public final Thread a(Context context) {
        if (!this.f3197a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new la(this, context));
        thread.start();
        return thread;
    }

    public final Thread a(Context context, String str) {
        if (!this.f3197a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new ia(this, context, str));
        thread.start();
        return thread;
    }
}
