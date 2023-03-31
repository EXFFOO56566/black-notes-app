package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class e0 implements Parcelable.Creator<t> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        IBinder iBinder = null;
        b.c.b.a.c.b bVar = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.k(parcel, a2);
            } else if (a3 == 2) {
                iBinder = b.j(parcel, a2);
            } else if (a3 == 3) {
                bVar = (b.c.b.a.c.b) b.a(parcel, a2, b.c.b.a.c.b.CREATOR);
            } else if (a3 == 4) {
                z = b.h(parcel, a2);
            } else if (a3 != 5) {
                b.n(parcel, a2);
            } else {
                z2 = b.h(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new t(i, iBinder, bVar, z, z2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t[] newArray(int i) {
        return new t[i];
    }
}
