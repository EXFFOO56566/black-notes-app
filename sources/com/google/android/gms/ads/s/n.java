package com.google.android.gms.ads.s;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class n implements Parcelable.Creator<j> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                z = b.h(parcel, a2);
            } else if (a3 == 2) {
                iBinder = b.j(parcel, a2);
            } else if (a3 != 3) {
                b.n(parcel, a2);
            } else {
                iBinder2 = b.j(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new j(z, iBinder, iBinder2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i) {
        return new j[i];
    }
}
