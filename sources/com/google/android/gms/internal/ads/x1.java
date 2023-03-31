package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class x1 extends h72 implements v1 {
    x1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.v1
    public final int getHeight() {
        Parcel a2 = a(5, r0());
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.v1
    public final int getWidth() {
        Parcel a2 = a(4, r0());
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.v1
    public final Uri l0() {
        Parcel a2 = a(2, r0());
        Uri uri = (Uri) i72.a(a2, Uri.CREATOR);
        a2.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.v1
    public final a l1() {
        Parcel a2 = a(1, r0());
        a a3 = a.AbstractBinderC0058a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.v1
    public final double s0() {
        Parcel a2 = a(3, r0());
        double readDouble = a2.readDouble();
        a2.recycle();
        return readDouble;
    }
}
