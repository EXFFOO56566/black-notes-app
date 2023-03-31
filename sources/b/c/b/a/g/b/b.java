package b.c.b.a.g.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class b implements Parcelable.Creator<c> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.w.b.b(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.w.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.w.b.a(a2);
            if (a3 == 1) {
                i = com.google.android.gms.common.internal.w.b.k(parcel, a2);
            } else if (a3 == 2) {
                i2 = com.google.android.gms.common.internal.w.b.k(parcel, a2);
            } else if (a3 != 3) {
                com.google.android.gms.common.internal.w.b.n(parcel, a2);
            } else {
                intent = (Intent) com.google.android.gms.common.internal.w.b.a(parcel, a2, Intent.CREATOR);
            }
        }
        com.google.android.gms.common.internal.w.b.g(parcel, b2);
        return new c(i, i2, intent);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c[] newArray(int i) {
        return new c[i];
    }
}
