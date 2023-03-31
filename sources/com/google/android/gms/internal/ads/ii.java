package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class ii implements Parcelable.Creator<ji> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ji createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 != 2) {
                b.n(parcel, a2);
            } else {
                str2 = b.d(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new ji(str, str2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ji[] newArray(int i) {
        return new ji[i];
    }
}
