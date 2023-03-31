package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class p1 implements Parcelable.Creator<m1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m1 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        er2 er2 = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    i = b.k(parcel, a2);
                    break;
                case 2:
                    z = b.h(parcel, a2);
                    break;
                case 3:
                    i2 = b.k(parcel, a2);
                    break;
                case 4:
                    z2 = b.h(parcel, a2);
                    break;
                case 5:
                    i3 = b.k(parcel, a2);
                    break;
                case 6:
                    er2 = (er2) b.a(parcel, a2, er2.CREATOR);
                    break;
                case 7:
                    z3 = b.h(parcel, a2);
                    break;
                case 8:
                    i4 = b.k(parcel, a2);
                    break;
                default:
                    b.n(parcel, a2);
                    break;
            }
        }
        b.g(parcel, b2);
        return new m1(i, z, i2, z2, i3, er2, z3, i4);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m1[] newArray(int i) {
        return new m1[i];
    }
}
