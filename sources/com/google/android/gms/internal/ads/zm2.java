package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class zm2 implements Parcelable.Creator<wm2> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wm2 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.k(parcel, a2);
            } else if (a3 == 2) {
                i2 = b.k(parcel, a2);
            } else if (a3 == 3) {
                str = b.d(parcel, a2);
            } else if (a3 != 4) {
                b.n(parcel, a2);
            } else {
                j = b.l(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new wm2(i, i2, str, j);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wm2[] newArray(int i) {
        return new wm2[i];
    }
}
