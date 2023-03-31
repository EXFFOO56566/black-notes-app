package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

public final class d91 implements r42<ApplicationInfo> {

    /* renamed from: a  reason: collision with root package name */
    private final b91 f2227a;

    public d91(b91 b91) {
        this.f2227a = b91;
    }

    public static ApplicationInfo a(b91 b91) {
        ApplicationInfo f = b91.f();
        y42.a(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f2227a);
    }
}
