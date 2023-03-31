package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class q9 {

    /* renamed from: b  reason: collision with root package name */
    private static final mm<r7> f4291b = new p9();

    /* renamed from: c  reason: collision with root package name */
    private static final mm<r7> f4292c = new s9();

    /* renamed from: a  reason: collision with root package name */
    private final f8 f4293a;

    public q9(Context context, fo foVar, String str) {
        this.f4293a = new f8(context, foVar, str, f4291b, f4292c);
    }

    public final <I, O> i9<I, O> a(String str, j9<I> j9Var, k9<O> k9Var) {
        return new r9(this.f4293a, str, j9Var, k9Var);
    }

    public final v9 a() {
        return new v9(this.f4293a);
    }
}
