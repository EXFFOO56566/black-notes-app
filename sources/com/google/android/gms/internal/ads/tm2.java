package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;
import java.util.ArrayList;

public final class tm2 implements Parcelable.Creator<rm2> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ rm2 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        br2 br2 = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        lm2 lm2 = null;
        String str5 = null;
        ArrayList<String> arrayList3 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    i = b.k(parcel, a2);
                    break;
                case 2:
                    j = b.l(parcel, a2);
                    break;
                case 3:
                    bundle = b.a(parcel, a2);
                    break;
                case 4:
                    i2 = b.k(parcel, a2);
                    break;
                case 5:
                    arrayList = b.f(parcel, a2);
                    break;
                case 6:
                    z = b.h(parcel, a2);
                    break;
                case 7:
                    i3 = b.k(parcel, a2);
                    break;
                case 8:
                    z2 = b.h(parcel, a2);
                    break;
                case 9:
                    str = b.d(parcel, a2);
                    break;
                case 10:
                    br2 = (br2) b.a(parcel, a2, br2.CREATOR);
                    break;
                case 11:
                    location = (Location) b.a(parcel, a2, Location.CREATOR);
                    break;
                case 12:
                    str2 = b.d(parcel, a2);
                    break;
                case 13:
                    bundle2 = b.a(parcel, a2);
                    break;
                case 14:
                    bundle3 = b.a(parcel, a2);
                    break;
                case 15:
                    arrayList2 = b.f(parcel, a2);
                    break;
                case 16:
                    str3 = b.d(parcel, a2);
                    break;
                case 17:
                    str4 = b.d(parcel, a2);
                    break;
                case 18:
                    z3 = b.h(parcel, a2);
                    break;
                case 19:
                    lm2 = (lm2) b.a(parcel, a2, lm2.CREATOR);
                    break;
                case 20:
                    i4 = b.k(parcel, a2);
                    break;
                case 21:
                    str5 = b.d(parcel, a2);
                    break;
                case 22:
                    arrayList3 = b.f(parcel, a2);
                    break;
                default:
                    b.n(parcel, a2);
                    break;
            }
        }
        b.g(parcel, b2);
        return new rm2(i, j, bundle, i2, arrayList, z, i3, z2, str, br2, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3, lm2, i4, str5, arrayList3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ rm2[] newArray(int i) {
        return new rm2[i];
    }
}
