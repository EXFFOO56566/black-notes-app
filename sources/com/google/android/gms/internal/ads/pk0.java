package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;

public final class pk0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4193a;

    /* renamed from: b  reason: collision with root package name */
    private final eq1 f4194b;

    /* renamed from: c  reason: collision with root package name */
    private final fo f4195c;
    private final a d;
    private final wj2 e;
    private final e80 f;
    private final yi2 g;

    public pk0(et etVar, Context context, zd1 zd1, eq1 eq1, fo foVar, a aVar, wj2 wj2, e80 e80, zb0 zb0) {
        this.f4193a = context;
        this.f4194b = eq1;
        this.f4195c = foVar;
        this.d = aVar;
        this.e = wj2;
        this.f = e80;
        this.g = zb0;
    }

    public final ws a(um2 um2) {
        return a(um2, false);
    }

    public final ws a(um2 um2, boolean z) {
        return et.a(this.f4193a, lu.a(um2), um2.f4976b, false, false, this.f4194b, this.f4195c, null, new tk0(this), this.d, this.e, this.g, z);
    }
}
