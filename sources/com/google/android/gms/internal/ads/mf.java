package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;
import java.util.ArrayList;

public final class mf implements Parcelable.Creator<nf> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ nf createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        boolean z = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 2) {
                z = b.h(parcel, a2);
            } else if (a3 != 3) {
                b.n(parcel, a2);
            } else {
                arrayList = b.f(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new nf(z, arrayList);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ nf[] newArray(int i) {
        return new nf[i];
    }
}
