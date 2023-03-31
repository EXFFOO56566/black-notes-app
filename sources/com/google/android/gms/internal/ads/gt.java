package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.i;
import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
public final /* synthetic */ class gt implements nl1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2806a;

    /* renamed from: b  reason: collision with root package name */
    private final lu f2807b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2808c;
    private final boolean d;
    private final boolean e;
    private final eq1 f;
    private final fo g;
    private final o h = null;
    private final i i;
    private final a j;
    private final wj2 k;
    private final yi2 l;
    private final boolean m;

    gt(Context context, lu luVar, String str, boolean z, boolean z2, eq1 eq1, fo foVar, o oVar, i iVar, a aVar, wj2 wj2, yi2 yi2, boolean z3) {
        this.f2806a = context;
        this.f2807b = luVar;
        this.f2808c = str;
        this.d = z;
        this.e = z2;
        this.f = eq1;
        this.g = foVar;
        this.i = iVar;
        this.j = aVar;
        this.k = wj2;
        this.l = yi2;
        this.m = z3;
    }

    @Override // com.google.android.gms.internal.ads.nl1
    public final Object get() {
        Context context = this.f2806a;
        lu luVar = this.f2807b;
        String str = this.f2808c;
        boolean z = this.d;
        boolean z2 = this.e;
        eq1 eq1 = this.f;
        fo foVar = this.g;
        o oVar = this.h;
        i iVar = this.i;
        a aVar = this.j;
        wj2 wj2 = this.k;
        ht htVar = new ht(nt.a(context, luVar, str, z, z2, eq1, foVar, oVar, iVar, aVar, wj2, this.l, this.m));
        htVar.setWebViewClient(q.e().a(htVar, wj2, z2));
        htVar.setWebChromeClient(new os(htVar));
        return htVar;
    }
}
