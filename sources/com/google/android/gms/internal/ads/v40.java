package com.google.android.gms.internal.ads;

import android.content.Context;

final /* synthetic */ class v40 implements xk1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5047a;

    /* renamed from: b  reason: collision with root package name */
    private final fo f5048b;

    /* renamed from: c  reason: collision with root package name */
    private final zd1 f5049c;

    v40(Context context, fo foVar, zd1 zd1) {
        this.f5047a = context;
        this.f5048b = foVar;
        this.f5049c = zd1;
    }

    @Override // com.google.android.gms.internal.ads.xk1
    public final Object a(Object obj) {
        Context context = this.f5047a;
        fo foVar = this.f5048b;
        zd1 zd1 = this.f5049c;
        id1 id1 = (id1) obj;
        xl xlVar = new xl(context);
        xlVar.c(id1.y);
        xlVar.d(id1.z.toString());
        xlVar.b(foVar.f2633b);
        xlVar.a(zd1.f);
        return xlVar;
    }
}
