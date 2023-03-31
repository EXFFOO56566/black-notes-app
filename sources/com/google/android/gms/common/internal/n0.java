package com.google.android.gms.common.internal;

import android.os.Parcel;
import b.c.b.a.e.e.a;
import b.c.b.a.e.e.c;

public abstract class n0 extends a implements m0 {
    public n0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* access modifiers changed from: protected */
    @Override // b.c.b.a.e.e.a
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            b.c.b.a.d.a j0 = j0();
            parcel2.writeNoException();
            c.a(parcel2, j0);
        } else if (i != 2) {
            return false;
        } else {
            int J = J();
            parcel2.writeNoException();
            parcel2.writeInt(J);
        }
        return true;
    }
}
