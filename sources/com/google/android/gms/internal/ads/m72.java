package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class m72 extends h72 implements l72 {
    m72(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.l72
    public final void R1() {
        b(3, r0());
    }

    @Override // com.google.android.gms.internal.ads.l72
    public final void a(byte[] bArr) {
        Parcel r0 = r0();
        r0.writeByteArray(bArr);
        b(5, r0);
    }

    @Override // com.google.android.gms.internal.ads.l72
    public final void a(int[] iArr) {
        Parcel r0 = r0();
        r0.writeIntArray(null);
        b(4, r0);
    }

    @Override // com.google.android.gms.internal.ads.l72
    public final void b(a aVar, String str) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        r0.writeString(str);
        b(2, r0);
    }

    @Override // com.google.android.gms.internal.ads.l72
    public final void b(a aVar, String str, String str2) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        r0.writeString(str);
        r0.writeString(null);
        b(8, r0);
    }

    @Override // com.google.android.gms.internal.ads.l72
    public final void h(int i) {
        Parcel r0 = r0();
        r0.writeInt(i);
        b(6, r0);
    }

    @Override // com.google.android.gms.internal.ads.l72
    public final void k(int i) {
        Parcel r0 = r0();
        r0.writeInt(i);
        b(7, r0);
    }
}
