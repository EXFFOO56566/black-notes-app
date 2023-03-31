package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class u5 implements Parcelable.Creator<r5> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r5 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    z = b.h(parcel, a2);
                    break;
                case 2:
                    str = b.d(parcel, a2);
                    break;
                case 3:
                    i = b.k(parcel, a2);
                    break;
                case 4:
                    bArr = b.b(parcel, a2);
                    break;
                case 5:
                    strArr = b.e(parcel, a2);
                    break;
                case 6:
                    strArr2 = b.e(parcel, a2);
                    break;
                case 7:
                    z2 = b.h(parcel, a2);
                    break;
                case 8:
                    j = b.l(parcel, a2);
                    break;
                default:
                    b.n(parcel, a2);
                    break;
            }
        }
        b.g(parcel, b2);
        return new r5(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r5[] newArray(int i) {
        return new r5[i];
    }
}
