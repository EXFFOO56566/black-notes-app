package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class yn2 extends h72 implements wn2 {
    yn2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.wn2
    public final String V() {
        Parcel a2 = a(4, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.wn2
    public final String a() {
        Parcel a2 = a(2, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.wn2
    public final void a(rm2 rm2, int i) {
        Parcel r0 = r0();
        i72.a(r0, rm2);
        r0.writeInt(i);
        b(5, r0);
    }

    @Override // com.google.android.gms.internal.ads.wn2
    public final void b(rm2 rm2) {
        Parcel r0 = r0();
        i72.a(r0, rm2);
        b(1, r0);
    }

    @Override // com.google.android.gms.internal.ads.wn2
    public final boolean u() {
        Parcel a2 = a(3, r0());
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }
}
