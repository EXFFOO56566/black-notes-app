package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class gj2 implements Parcelable.Creator<hj2> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ hj2 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            if (b.a(a2) != 2) {
                b.n(parcel, a2);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) b.a(parcel, a2, ParcelFileDescriptor.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new hj2(parcelFileDescriptor);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ hj2[] newArray(int i) {
        return new hj2[i];
    }
}
