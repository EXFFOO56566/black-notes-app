package com.google.android.gms.internal.ads;

import android.content.Context;

final class tw implements fa1 {

    /* renamed from: a  reason: collision with root package name */
    private Context f4863a;

    /* renamed from: b  reason: collision with root package name */
    private String f4864b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ iw f4865c;

    private tw(iw iwVar) {
        this.f4865c = iwVar;
    }

    @Override // com.google.android.gms.internal.ads.fa1
    public final ca1 a() {
        y42.a(this.f4863a, Context.class);
        y42.a(this.f4864b, String.class);
        return new sw(this.f4865c, this.f4863a, this.f4864b);
    }

    @Override // com.google.android.gms.internal.ads.fa1
    public final /* synthetic */ fa1 a(Context context) {
        y42.a(context);
        this.f4863a = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fa1
    public final /* synthetic */ fa1 a(String str) {
        y42.a(str);
        this.f4864b = str;
        return this;
    }
}
