package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class ak implements Parcelable.Creator<yj> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ yj createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        um2 um2 = null;
        rm2 rm2 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 == 2) {
                str2 = b.d(parcel, a2);
            } else if (a3 == 3) {
                um2 = (um2) b.a(parcel, a2, um2.CREATOR);
            } else if (a3 != 4) {
                b.n(parcel, a2);
            } else {
                rm2 = (rm2) b.a(parcel, a2, rm2.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new yj(str, str2, um2, rm2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ yj[] newArray(int i) {
        return new yj[i];
    }
}
