package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class t6 implements Parcelable.Creator<q6> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q6 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i2 = b.k(parcel, a2);
            } else if (a3 == 2) {
                str = b.d(parcel, a2);
            } else if (a3 == 3) {
                i3 = b.k(parcel, a2);
            } else if (a3 != 1000) {
                b.n(parcel, a2);
            } else {
                i = b.k(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new q6(i, i2, str, i3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q6[] newArray(int i) {
        return new q6[i];
    }
}
