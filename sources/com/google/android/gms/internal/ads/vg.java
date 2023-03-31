package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import java.lang.ref.WeakReference;

public final class vg extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private Context f5109a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Activity> f5110b = new WeakReference<>(null);

    private vg(Context context) {
        super(context);
    }

    public static Context a(Context context) {
        return context instanceof vg ? ((vg) context).getBaseContext() : b(context);
    }

    private final synchronized Intent a(Intent intent) {
        if (!(this.f5109a == null || intent.getComponent() == null)) {
            if (intent.getComponent().getPackageName().equals(this.f5109a.getPackageName())) {
                Intent intent2 = (Intent) intent.clone();
                intent2.setClassName(super.getPackageName(), intent.getComponent().getClassName());
                return intent2;
            }
        }
        return intent;
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private final synchronized void b(Intent intent) {
        Activity activity = this.f5110b.get();
        if (activity == null) {
            intent.addFlags(268435456);
            super.startActivity(intent);
            return;
        }
        try {
            Intent intent2 = (Intent) intent.clone();
            intent2.setFlags(intent.getFlags() & -268435457);
            activity.startActivity(intent2);
        } catch (Throwable th) {
            q.g().a(th, BuildConfig.FLAVOR);
            intent.addFlags(268435456);
            super.startActivity(intent);
        }
    }

    public static vg c(Context context) {
        return new vg(b(context));
    }

    public final synchronized void a(String str) {
        this.f5109a = super.createPackageContext(str, 0);
    }

    public final Context getApplicationContext() {
        return this;
    }

    public final synchronized ApplicationInfo getApplicationInfo() {
        if (this.f5109a != null) {
            return this.f5109a.getApplicationInfo();
        }
        return super.getApplicationInfo();
    }

    public final synchronized String getPackageName() {
        if (this.f5109a != null) {
            return this.f5109a.getPackageName();
        }
        return super.getPackageName();
    }

    public final synchronized String getPackageResourcePath() {
        if (this.f5109a != null) {
            return this.f5109a.getPackageResourcePath();
        }
        return super.getPackageResourcePath();
    }

    public final synchronized void startActivity(Intent intent) {
        b(a(intent));
    }
}
