package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;
import java.util.ArrayList;
import java.util.List;

public final class xo2 extends h72 implements vo2 {
    xo2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void L() {
        b(1, r0());
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final boolean N0() {
        Parcel a2 = a(8, r0());
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final List<e6> V1() {
        Parcel a2 = a(13, r0());
        ArrayList createTypedArrayList = a2.createTypedArrayList(e6.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final String W1() {
        Parcel a2 = a(9, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void a(float f) {
        Parcel r0 = r0();
        r0.writeFloat(f);
        b(2, r0);
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void a(a aVar, String str) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        r0.writeString(str);
        b(5, r0);
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void a(l6 l6Var) {
        Parcel r0 = r0();
        i72.a(r0, l6Var);
        b(12, r0);
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void a(ra raVar) {
        Parcel r0 = r0();
        i72.a(r0, raVar);
        b(11, r0);
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void a(yq2 yq2) {
        Parcel r0 = r0();
        i72.a(r0, yq2);
        b(14, r0);
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void b(String str, a aVar) {
        Parcel r0 = r0();
        r0.writeString(str);
        i72.a(r0, aVar);
        b(6, r0);
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void d(boolean z) {
        Parcel r0 = r0();
        i72.a(r0, z);
        b(4, r0);
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void h(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        b(3, r0);
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void l(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        b(10, r0);
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final float o1() {
        Parcel a2 = a(7, r0());
        float readFloat = a2.readFloat();
        a2.recycle();
        return readFloat;
    }
}
