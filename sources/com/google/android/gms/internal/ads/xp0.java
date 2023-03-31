package com.google.android.gms.internal.ads;

import android.content.Context;

public final class xp0 implements r42<String> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f5473a;

    private xp0(e52<Context> e52) {
        this.f5473a = e52;
    }

    public static xp0 a(e52<Context> e52) {
        return new xp0(e52);
    }

    public static String a(Context context) {
        String packageName = context.getPackageName();
        y42.a(packageName, "Cannot return null from a non-@Nullable @Provides method");
        return packageName;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f5473a.get());
    }
}
