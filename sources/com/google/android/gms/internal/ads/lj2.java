package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class lj2 implements Parcelable.Creator<ij2> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ij2 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 2:
                    str = b.d(parcel, a2);
                    break;
                case 3:
                    j = b.l(parcel, a2);
                    break;
                case 4:
                    str2 = b.d(parcel, a2);
                    break;
                case 5:
                    str3 = b.d(parcel, a2);
                    break;
                case 6:
                    str4 = b.d(parcel, a2);
                    break;
                case 7:
                    bundle = b.a(parcel, a2);
                    break;
                case 8:
                    z = b.h(parcel, a2);
                    break;
                case 9:
                    j2 = b.l(parcel, a2);
                    break;
                default:
                    b.n(parcel, a2);
                    break;
            }
        }
        b.g(parcel, b2);
        return new ij2(str, j, str2, str3, str4, bundle, z, j2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ij2[] newArray(int i) {
        return new ij2[i];
    }
}
