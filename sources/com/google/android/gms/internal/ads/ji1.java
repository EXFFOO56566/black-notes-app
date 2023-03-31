package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.h.f;
import b.c.b.a.h.i;
import com.google.android.gms.internal.ads.q00;
import java.util.Map;
import java.util.concurrent.Executor;

public final class ji1 {
    private static volatile q00.c d = q00.c.UNKNOWN;

    /* renamed from: a  reason: collision with root package name */
    private final Context f3236a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f3237b;

    /* renamed from: c  reason: collision with root package name */
    private final f<ak2> f3238c;

    private ji1(Context context, Executor executor, f<ak2> fVar) {
        this.f3236a = context;
        this.f3237b = executor;
        this.f3238c = fVar;
    }

    private final f<Boolean> a(int i, long j, Exception exc, String str, Map<String, String> map, String str2) {
        q00.a p = q00.p();
        p.a(this.f3236a.getPackageName());
        p.a(j);
        p.a(d);
        if (exc != null) {
            p.b(ml1.a(exc));
            p.c(exc.getClass().getName());
        }
        if (str2 != null) {
            p.d(str2);
        }
        if (str != null) {
            p.e(str);
        }
        return this.f3238c.a(this.f3237b, new ki1(p, i));
    }

    static final /* synthetic */ ak2 a(Context context) {
        return new ak2(context, "GLAS", null);
    }

    public static ji1 a(Context context, Executor executor) {
        return new ji1(context, executor, i.a(executor, new li1(context)));
    }

    static final /* synthetic */ Boolean a(q00.a aVar, int i, f fVar) {
        boolean z;
        if (fVar.e()) {
            fk2 a2 = ((ak2) fVar.b()).a(((q00) ((rz1) aVar.e())).f());
            a2.b(i);
            a2.a();
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    static void a(q00.c cVar) {
        d = cVar;
    }

    public final f<Boolean> a(int i, long j) {
        return a(i, j, null, null, null, null);
    }

    public final f<Boolean> a(int i, long j, Exception exc) {
        return a(i, j, exc, null, null, null);
    }

    public final f<Boolean> a(int i, long j, String str, Map<String, String> map) {
        return a(i, j, null, str, null, null);
    }

    public final f<Boolean> a(int i, String str) {
        return a(4007, 0, null, null, null, str);
    }
}
