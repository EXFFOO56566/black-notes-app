package com.google.android.gms.common.internal;

import b.c.b.a.h.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.k;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private static final b f1645a = new a0();

    public interface a<R extends k, T> {
        T a(R r);
    }

    public interface b {
        com.google.android.gms.common.api.b a(Status status);
    }

    public static <R extends k> f<Void> a(g<R> gVar) {
        return a(gVar, new c0());
    }

    public static <R extends k, T> f<T> a(g<R> gVar, a<R, T> aVar) {
        b bVar = f1645a;
        b.c.b.a.h.g gVar2 = new b.c.b.a.h.g();
        gVar.a(new b0(gVar, gVar2, aVar, bVar));
        return gVar2.a();
    }
}
