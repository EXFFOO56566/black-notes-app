package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

/* access modifiers changed from: package-private */
public final /* synthetic */ class rh0 implements xk1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f4504a;

    /* renamed from: b  reason: collision with root package name */
    private final double f4505b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4506c;
    private final int d;

    rh0(String str, double d2, int i, int i2) {
        this.f4504a = str;
        this.f4505b = d2;
        this.f4506c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.ads.xk1
    public final Object a(Object obj) {
        String str = this.f4504a;
        return new i1(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.f4505b, this.f4506c, this.d);
    }
}
