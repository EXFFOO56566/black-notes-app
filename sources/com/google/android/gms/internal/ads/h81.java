package com.google.android.gms.internal.ads;

import android.content.Context;

public final class h81 implements y61<e81> {

    /* renamed from: a  reason: collision with root package name */
    kj2 f2876a;

    /* renamed from: b  reason: collision with root package name */
    private ko1 f2877b;

    /* renamed from: c  reason: collision with root package name */
    Context f2878c;

    public h81(kj2 kj2, ko1 ko1, Context context) {
        this.f2876a = kj2;
        this.f2877b = ko1;
        this.f2878c = context;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<e81> a() {
        return this.f2877b.a(new g81(this));
    }
}
