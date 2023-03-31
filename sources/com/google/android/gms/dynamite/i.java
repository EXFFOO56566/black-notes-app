package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;
import b.c.b.a.e.e.b;
import b.c.b.a.e.e.c;

public final class i extends b implements j {
    i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    @Override // com.google.android.gms.dynamite.j
    public final int I1() {
        Parcel a2 = a(6, r0());
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.j
    public final int a(a aVar, String str, boolean z) {
        Parcel r0 = r0();
        c.a(r0, aVar);
        r0.writeString(str);
        c.a(r0, z);
        Parcel a2 = a(5, r0);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.j
    public final a a(a aVar, String str, int i) {
        Parcel r0 = r0();
        c.a(r0, aVar);
        r0.writeString(str);
        r0.writeInt(i);
        Parcel a2 = a(4, r0);
        a a3 = a.AbstractBinderC0058a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.dynamite.j
    public final int b(a aVar, String str, boolean z) {
        Parcel r0 = r0();
        c.a(r0, aVar);
        r0.writeString(str);
        c.a(r0, z);
        Parcel a2 = a(3, r0);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.j
    public final a b(a aVar, String str, int i) {
        Parcel r0 = r0();
        c.a(r0, aVar);
        r0.writeString(str);
        r0.writeInt(i);
        Parcel a2 = a(2, r0);
        a a3 = a.AbstractBinderC0058a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
