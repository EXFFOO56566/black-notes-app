package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;

final /* synthetic */ class ec0 implements l70 {

    /* renamed from: b  reason: collision with root package name */
    private final Context f2396b;

    /* renamed from: c  reason: collision with root package name */
    private final fo f2397c;
    private final id1 d;
    private final zd1 e;

    ec0(Context context, fo foVar, id1 id1, zd1 zd1) {
        this.f2396b = context;
        this.f2397c = foVar;
        this.d = id1;
        this.e = zd1;
    }

    @Override // com.google.android.gms.internal.ads.l70
    public final void s() {
        q.m().b(this.f2396b, this.f2397c.f2633b, this.d.z.toString(), this.e.f);
    }
}
