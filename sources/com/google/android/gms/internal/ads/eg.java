package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class eg implements Parcelable.Creator<bg> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bg createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            if (b.a(a2) != 2) {
                b.n(parcel, a2);
            } else {
                str = b.d(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new bg(str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bg[] newArray(int i) {
        return new bg[i];
    }
}
