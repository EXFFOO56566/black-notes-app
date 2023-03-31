package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
public final class h9 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2879a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Object f2880b = new Object();
    @GuardedBy("lockClient")

    /* renamed from: c  reason: collision with root package name */
    private q9 f2881c;
    @GuardedBy("lockService")
    private q9 d;

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final q9 a(Context context, fo foVar) {
        q9 q9Var;
        synchronized (this.f2880b) {
            if (this.d == null) {
                this.d = new q9(a(context), foVar, v0.f5031a.a());
            }
            q9Var = this.d;
        }
        return q9Var;
    }

    public final q9 b(Context context, fo foVar) {
        q9 q9Var;
        synchronized (this.f2879a) {
            if (this.f2881c == null) {
                this.f2881c = new q9(a(context), foVar, (String) on2.e().a(zr2.f5802a));
            }
            q9Var = this.f2881c;
        }
        return q9Var;
    }
}
