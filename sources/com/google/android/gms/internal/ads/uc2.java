package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

final class uc2 implements Parcelable.Creator<sc2> {
    uc2() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ sc2 createFromParcel(Parcel parcel) {
        return new sc2(parcel);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ sc2[] newArray(int i) {
        return new sc2[i];
    }
}
