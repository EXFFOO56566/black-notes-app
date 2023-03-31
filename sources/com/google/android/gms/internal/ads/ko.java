package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class ko implements Parcelable.Creator<fo> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ fo createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 2) {
                str = b.d(parcel, a2);
            } else if (a3 == 3) {
                i = b.k(parcel, a2);
            } else if (a3 == 4) {
                i2 = b.k(parcel, a2);
            } else if (a3 == 5) {
                z = b.h(parcel, a2);
            } else if (a3 != 6) {
                b.n(parcel, a2);
            } else {
                z2 = b.h(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new fo(str, i, i2, z, z2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ fo[] newArray(int i) {
        return new fo[i];
    }
}
