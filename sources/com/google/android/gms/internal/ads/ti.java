package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;
import java.util.ArrayList;

public final class ti implements Parcelable.Creator<ui> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ui createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 2:
                    str = b.d(parcel, a2);
                    break;
                case 3:
                    str2 = b.d(parcel, a2);
                    break;
                case 4:
                    z = b.h(parcel, a2);
                    break;
                case 5:
                    z2 = b.h(parcel, a2);
                    break;
                case 6:
                    arrayList = b.f(parcel, a2);
                    break;
                case 7:
                    z3 = b.h(parcel, a2);
                    break;
                case 8:
                    z4 = b.h(parcel, a2);
                    break;
                case 9:
                    arrayList2 = b.f(parcel, a2);
                    break;
                default:
                    b.n(parcel, a2);
                    break;
            }
        }
        b.g(parcel, b2);
        return new ui(str, str2, z, z2, arrayList, z3, z4, arrayList2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ui[] newArray(int i) {
        return new ui[i];
    }
}
