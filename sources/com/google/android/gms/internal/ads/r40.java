package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;

public final class r40 implements m80 {

    /* renamed from: b  reason: collision with root package name */
    private final Context f4443b;

    /* renamed from: c  reason: collision with root package name */
    private final zd1 f4444c;
    private final fo d;
    private final yk e;
    private final uo0 f;

    public r40(Context context, zd1 zd1, fo foVar, yk ykVar, uo0 uo0) {
        this.f4443b = context;
        this.f4444c = zd1;
        this.d = foVar;
        this.e = ykVar;
        this.f = uo0;
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void a(vd1 vd1) {
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void a(zf zfVar) {
        if (((Boolean) on2.e().a(zr2.D1)).booleanValue()) {
            q.k().a(this.f4443b, this.d, this.f4444c.f, this.e.i());
        }
        this.f.a();
    }
}
