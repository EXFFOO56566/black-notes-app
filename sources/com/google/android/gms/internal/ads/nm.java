package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class nm implements Parcelable.Creator<lm> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ lm createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 != 2) {
                b.n(parcel, a2);
            } else {
                i = b.k(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new lm(str, i);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ lm[] newArray(int i) {
        return new lm[i];
    }
}
