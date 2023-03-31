package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class nh implements Parcelable.Creator<kh> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ kh createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        rm2 rm2 = null;
        String str = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 2) {
                rm2 = (rm2) b.a(parcel, a2, rm2.CREATOR);
            } else if (a3 != 3) {
                b.n(parcel, a2);
            } else {
                str = b.d(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new kh(rm2, str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ kh[] newArray(int i) {
        return new kh[i];
    }
}
