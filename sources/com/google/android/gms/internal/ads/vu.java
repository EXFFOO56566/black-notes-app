package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.i;

/* access modifiers changed from: package-private */
public final /* synthetic */ class vu implements nl1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5161a;

    /* renamed from: b  reason: collision with root package name */
    private final lu f5162b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5163c;
    private final boolean d;
    private final boolean e;
    private final eq1 f;
    private final fo g;
    private final o h;
    private final i i;
    private final a j;
    private final wj2 k;
    private final yi2 l;
    private final boolean m;

    vu(Context context, lu luVar, String str, boolean z, boolean z2, eq1 eq1, fo foVar, o oVar, i iVar, a aVar, wj2 wj2, yi2 yi2, boolean z3) {
        this.f5161a = context;
        this.f5162b = luVar;
        this.f5163c = str;
        this.d = z;
        this.e = z2;
        this.f = eq1;
        this.g = foVar;
        this.h = oVar;
        this.i = iVar;
        this.j = aVar;
        this.k = wj2;
        this.l = yi2;
        this.m = z3;
    }

    @Override // com.google.android.gms.internal.ads.nl1
    public final Object get() {
        Context context = this.f5161a;
        lu luVar = this.f5162b;
        String str = this.f5163c;
        boolean z = this.d;
        boolean z2 = this.e;
        eq1 eq1 = this.f;
        fo foVar = this.g;
        o oVar = this.h;
        i iVar = this.i;
        a aVar = this.j;
        wj2 wj2 = this.k;
        yi2 yi2 = this.l;
        boolean z3 = this.m;
        pu puVar = new pu();
        uu uuVar = new uu(new nu(context), puVar, luVar, str, z, z2, eq1, foVar, oVar, iVar, aVar, wj2, yi2, z3);
        ht htVar = new ht(uuVar);
        uuVar.setWebChromeClient(new os(htVar));
        puVar.a(htVar, z2);
        return htVar;
    }
}
