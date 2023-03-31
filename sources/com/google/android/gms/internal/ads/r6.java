package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class r6 implements Parcelable.Creator<o6> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o6 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 != 2) {
                b.n(parcel, a2);
            } else {
                bundle = b.a(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new o6(str, bundle);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o6[] newArray(int i) {
        return new o6[i];
    }
}
