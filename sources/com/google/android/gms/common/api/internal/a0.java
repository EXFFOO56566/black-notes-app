package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.k;

public final class a0<O extends a.d> extends t {

    /* renamed from: b  reason: collision with root package name */
    private final e<O> f1548b;

    public a0(e<O> eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f1548b = eVar;
    }

    @Override // com.google.android.gms.common.api.f
    public final Looper a() {
        return this.f1548b.f();
    }

    @Override // com.google.android.gms.common.api.f
    public final <A extends a.b, T extends d<? extends k, A>> T a(T t) {
        this.f1548b.a(t);
        return t;
    }
}
