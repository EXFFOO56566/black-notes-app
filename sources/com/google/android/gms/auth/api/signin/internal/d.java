package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class d implements Parcelable.Creator<a> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.k(parcel, a2);
            } else if (a3 == 2) {
                i2 = b.k(parcel, a2);
            } else if (a3 != 3) {
                b.n(parcel, a2);
            } else {
                bundle = b.a(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new a(i, i2, bundle);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i) {
        return new a[i];
    }
}
