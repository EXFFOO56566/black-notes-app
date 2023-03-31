package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class sf1 implements Parcelable.Creator<nf1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ nf1 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    i = b.k(parcel, a2);
                    break;
                case 2:
                    i2 = b.k(parcel, a2);
                    break;
                case 3:
                    i3 = b.k(parcel, a2);
                    break;
                case 4:
                    i4 = b.k(parcel, a2);
                    break;
                case 5:
                    str = b.d(parcel, a2);
                    break;
                case 6:
                    i5 = b.k(parcel, a2);
                    break;
                case 7:
                    i6 = b.k(parcel, a2);
                    break;
                default:
                    b.n(parcel, a2);
                    break;
            }
        }
        b.g(parcel, b2);
        return new nf1(i, i2, i3, i4, str, i5, i6);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ nf1[] newArray(int i) {
        return new nf1[i];
    }
}
