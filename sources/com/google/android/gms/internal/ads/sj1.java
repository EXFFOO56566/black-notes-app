package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class sj1 implements Parcelable.Creator<pj1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ pj1 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.k(parcel, a2);
            } else if (a3 != 2) {
                b.n(parcel, a2);
            } else {
                bArr = b.b(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new pj1(i, bArr);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ pj1[] newArray(int i) {
        return new pj1[i];
    }
}
