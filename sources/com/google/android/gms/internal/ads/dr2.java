package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class dr2 implements Parcelable.Creator<br2> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ br2 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            if (b.a(a2) != 15) {
                b.n(parcel, a2);
            } else {
                str = b.d(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new br2(str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ br2[] newArray(int i) {
        return new br2[i];
    }
}
