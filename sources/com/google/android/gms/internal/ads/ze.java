package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class ze implements Parcelable.Creator<xe> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ xe createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                iBinder = b.j(parcel, a2);
            } else if (a3 != 2) {
                b.n(parcel, a2);
            } else {
                iBinder2 = b.j(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new xe(iBinder, iBinder2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ xe[] newArray(int i) {
        return new xe[i];
    }
}
