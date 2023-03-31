package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;
import b.c.b.a.e.e.b;
import b.c.b.a.e.e.c;

public final class k extends b implements l {
    k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    @Override // com.google.android.gms.dynamite.l
    public final a a(a aVar, String str, int i, a aVar2) {
        Parcel r0 = r0();
        c.a(r0, aVar);
        r0.writeString(str);
        r0.writeInt(i);
        c.a(r0, aVar2);
        Parcel a2 = a(2, r0);
        a a3 = a.AbstractBinderC0058a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.dynamite.l
    public final a b(a aVar, String str, int i, a aVar2) {
        Parcel r0 = r0();
        c.a(r0, aVar);
        r0.writeString(str);
        r0.writeInt(i);
        c.a(r0, aVar2);
        Parcel a2 = a(3, r0);
        a a3 = a.AbstractBinderC0058a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
