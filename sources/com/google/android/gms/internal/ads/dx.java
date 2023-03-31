package com.google.android.gms.internal.ads;

import android.content.Context;

final class dx implements zc1 {

    /* renamed from: a  reason: collision with root package name */
    private Context f2328a;

    /* renamed from: b  reason: collision with root package name */
    private String f2329b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ iw f2330c;

    private dx(iw iwVar) {
        this.f2330c = iwVar;
    }

    @Override // com.google.android.gms.internal.ads.zc1
    public final ad1 a() {
        y42.a(this.f2328a, Context.class);
        return new cx(this.f2330c, this.f2328a, this.f2329b);
    }

    @Override // com.google.android.gms.internal.ads.zc1
    public final /* synthetic */ zc1 a(Context context) {
        y42.a(context);
        this.f2328a = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zc1
    public final /* synthetic */ zc1 a(String str) {
        this.f2329b = str;
        return this;
    }
}
