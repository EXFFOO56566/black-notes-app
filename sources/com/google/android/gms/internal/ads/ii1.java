package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class ii1 extends h72 implements hi1 {
    ii1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    @Override // com.google.android.gms.internal.ads.hi1
    public final void P(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(4, r0);
    }

    @Override // com.google.android.gms.internal.ads.hi1
    public final a a(String str, a aVar, String str2, String str3, String str4, String str5) {
        Parcel r0 = r0();
        r0.writeString(str);
        i72.a(r0, aVar);
        r0.writeString(str2);
        r0.writeString(str3);
        r0.writeString(str4);
        r0.writeString(str5);
        Parcel a2 = a(9, r0);
        a a3 = a.AbstractBinderC0058a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.hi1
    public final void a(a aVar, a aVar2) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, aVar2);
        b(8, r0);
    }

    @Override // com.google.android.gms.internal.ads.hi1
    public final void b(a aVar, a aVar2) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, aVar2);
        b(5, r0);
    }

    @Override // com.google.android.gms.internal.ads.hi1
    public final String getVersion() {
        Parcel a2 = a(6, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.hi1
    public final void m(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(7, r0);
    }

    @Override // com.google.android.gms.internal.ads.hi1
    public final boolean u(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        Parcel a2 = a(2, r0);
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }
}
