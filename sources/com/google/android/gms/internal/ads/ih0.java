package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* access modifiers changed from: package-private */
public final class ih0 implements xk1<ef2, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ double f3085a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f3086b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ jh0 f3087c;

    ih0(jh0 jh0, double d, boolean z) {
        this.f3087c = jh0;
        this.f3085a = d;
        this.f3086b = z;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.xk1
    public final /* synthetic */ Bitmap a(ef2 ef2) {
        return this.f3087c.a(ef2.f2418b, this.f3085a, this.f3086b);
    }
}
