package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

final class yq0 implements m80 {

    /* renamed from: b  reason: collision with root package name */
    private final Context f5634b;

    /* renamed from: c  reason: collision with root package name */
    private final cj f5635c;

    yq0(Context context, cj cjVar) {
        this.f5634b = context;
        this.f5635c = cjVar;
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void a(vd1 vd1) {
        if (!TextUtils.isEmpty(vd1.f5093b.f4642b.d)) {
            this.f5635c.a(this.f5634b, vd1.f5092a.f4150a.d);
            this.f5635c.f(this.f5634b, vd1.f5093b.f4642b.d);
        }
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void a(zf zfVar) {
    }
}
