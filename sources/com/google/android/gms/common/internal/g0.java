package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.c.d;
import com.google.android.gms.common.internal.w.b;

public final class g0 implements Parcelable.Creator<f0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f0 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        Bundle bundle = null;
        d[] dVarArr = null;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                bundle = b.a(parcel, a2);
            } else if (a3 == 2) {
                dVarArr = (d[]) b.b(parcel, a2, d.CREATOR);
            } else if (a3 != 3) {
                b.n(parcel, a2);
            } else {
                i = b.k(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new f0(bundle, dVarArr, i);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f0[] newArray(int i) {
        return new f0[i];
    }
}
