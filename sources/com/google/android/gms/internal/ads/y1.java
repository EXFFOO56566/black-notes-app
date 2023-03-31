package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;

public abstract class y1 extends j72 implements v1 {
    public y1() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static v1 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof v1 ? (v1) queryLocalInterface : new x1(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        if (i == 1) {
            a l1 = l1();
            parcel2.writeNoException();
            i72.a(parcel2, l1);
        } else if (i == 2) {
            Uri l0 = l0();
            parcel2.writeNoException();
            i72.b(parcel2, l0);
        } else if (i != 3) {
            if (i == 4) {
                i3 = getWidth();
            } else if (i != 5) {
                return false;
            } else {
                i3 = getHeight();
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        } else {
            double s0 = s0();
            parcel2.writeNoException();
            parcel2.writeDouble(s0);
        }
        return true;
    }
}
