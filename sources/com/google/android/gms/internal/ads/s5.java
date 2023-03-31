package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class s5 implements Parcelable.Creator<p5> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p5 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 == 2) {
                strArr = b.e(parcel, a2);
            } else if (a3 != 3) {
                b.n(parcel, a2);
            } else {
                strArr2 = b.e(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new p5(str, strArr, strArr2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p5[] newArray(int i) {
        return new p5[i];
    }
}
