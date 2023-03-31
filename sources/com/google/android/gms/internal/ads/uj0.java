package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class uj0 implements Callable<jj0> {

    /* renamed from: a */
    private final a f4962a;

    /* renamed from: b */
    private final et f4963b;

    /* renamed from: c */
    private final Context f4964c;
    private final Executor d;
    private final eq1 e;
    private final fo f;

    public uj0(Context context, Executor executor, eq1 eq1, fo foVar, a aVar, et etVar) {
        this.f4964c = context;
        this.d = executor;
        this.e = eq1;
        this.f = foVar;
        this.f4962a = aVar;
        this.f4963b = etVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ jj0 call() {
        jj0 jj0 = new jj0(this);
        jj0.b();
        return jj0;
    }
}
