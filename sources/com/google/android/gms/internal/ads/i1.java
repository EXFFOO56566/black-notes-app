package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import b.c.b.a.d.a;
import b.c.b.a.d.b;

public final class i1 extends y1 {

    /* renamed from: b  reason: collision with root package name */
    private final Drawable f3009b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f3010c;
    private final double d;
    private final int e;
    private final int f;

    public i1(Drawable drawable, Uri uri, double d2, int i, int i2) {
        this.f3009b = drawable;
        this.f3010c = uri;
        this.d = d2;
        this.e = i;
        this.f = i2;
    }

    @Override // com.google.android.gms.internal.ads.v1
    public final int getHeight() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.v1
    public final int getWidth() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.v1
    public final Uri l0() {
        return this.f3010c;
    }

    @Override // com.google.android.gms.internal.ads.v1
    public final a l1() {
        return b.a(this.f3009b);
    }

    @Override // com.google.android.gms.internal.ads.v1
    public final double s0() {
        return this.d;
    }
}
