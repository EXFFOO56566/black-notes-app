package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class hr2 implements Parcelable.Creator<er2> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ er2 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 2) {
                z = b.h(parcel, a2);
            } else if (a3 == 3) {
                z2 = b.h(parcel, a2);
            } else if (a3 != 4) {
                b.n(parcel, a2);
            } else {
                z3 = b.h(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new er2(z, z2, z3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ er2[] newArray(int i) {
        return new er2[i];
    }
}
