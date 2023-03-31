package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class xm2 implements Parcelable.Creator<um2> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ um2 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        um2[] um2Arr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 2:
                    str = b.d(parcel, a2);
                    break;
                case 3:
                    i = b.k(parcel, a2);
                    break;
                case 4:
                    i2 = b.k(parcel, a2);
                    break;
                case 5:
                    z = b.h(parcel, a2);
                    break;
                case 6:
                    i3 = b.k(parcel, a2);
                    break;
                case 7:
                    i4 = b.k(parcel, a2);
                    break;
                case 8:
                    um2Arr = (um2[]) b.b(parcel, a2, um2.CREATOR);
                    break;
                case 9:
                    z2 = b.h(parcel, a2);
                    break;
                case 10:
                    z3 = b.h(parcel, a2);
                    break;
                case 11:
                    z4 = b.h(parcel, a2);
                    break;
                case 12:
                    z5 = b.h(parcel, a2);
                    break;
                case 13:
                    z6 = b.h(parcel, a2);
                    break;
                case 14:
                    z7 = b.h(parcel, a2);
                    break;
                case 15:
                    z8 = b.h(parcel, a2);
                    break;
                default:
                    b.n(parcel, a2);
                    break;
            }
        }
        b.g(parcel, b2);
        return new um2(str, i, i2, z, i3, i4, um2Arr, z2, z3, z4, z5, z6, z7, z8);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ um2[] newArray(int i) {
        return new um2[i];
    }
}
