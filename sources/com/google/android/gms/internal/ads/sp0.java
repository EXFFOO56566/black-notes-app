package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

public final class sp0 implements r42<ApplicationInfo> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f4691a;

    private sp0(e52<Context> e52) {
        this.f4691a = e52;
    }

    public static ApplicationInfo a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        y42.a(applicationInfo, "Cannot return null from a non-@Nullable @Provides method");
        return applicationInfo;
    }

    public static sp0 a(e52<Context> e52) {
        return new sp0(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f4691a.get());
    }
}
