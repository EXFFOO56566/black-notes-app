package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

final class yc2 implements Parcelable.Creator<vc2> {
    yc2() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ vc2 createFromParcel(Parcel parcel) {
        return new vc2(parcel);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ vc2[] newArray(int i) {
        return new vc2[i];
    }
}
