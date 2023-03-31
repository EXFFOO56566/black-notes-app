package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class q implements Parcelable.Creator<Status> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i2 = b.k(parcel, a2);
            } else if (a3 == 2) {
                str = b.d(parcel, a2);
            } else if (a3 == 3) {
                pendingIntent = (PendingIntent) b.a(parcel, a2, PendingIntent.CREATOR);
            } else if (a3 != 1000) {
                b.n(parcel, a2);
            } else {
                i = b.k(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new Status(i, i2, str, pendingIntent);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }
}
