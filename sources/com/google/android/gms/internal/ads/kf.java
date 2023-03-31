package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;
import java.util.ArrayList;

public final class kf implements Parcelable.Creator<lf> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ lf createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        ArrayList<String> arrayList3 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        yf yfVar = null;
        String str7 = null;
        String str8 = null;
        uh uhVar = null;
        ArrayList<String> arrayList4 = null;
        ArrayList<String> arrayList5 = null;
        nf nfVar = null;
        String str9 = null;
        ArrayList<String> arrayList6 = null;
        String str10 = null;
        ui uiVar = null;
        String str11 = null;
        Bundle bundle = null;
        ArrayList<String> arrayList7 = null;
        String str12 = null;
        String str13 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int i4 = 0;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    i = b.k(parcel, a2);
                    break;
                case 2:
                    str = b.d(parcel, a2);
                    break;
                case 3:
                    str2 = b.d(parcel, a2);
                    break;
                case 4:
                    arrayList = b.f(parcel, a2);
                    break;
                case 5:
                    i2 = b.k(parcel, a2);
                    break;
                case 6:
                    arrayList2 = b.f(parcel, a2);
                    break;
                case 7:
                    j = b.l(parcel, a2);
                    break;
                case 8:
                    z = b.h(parcel, a2);
                    break;
                case 9:
                    j2 = b.l(parcel, a2);
                    break;
                case 10:
                    arrayList3 = b.f(parcel, a2);
                    break;
                case 11:
                    j3 = b.l(parcel, a2);
                    break;
                case 12:
                    i3 = b.k(parcel, a2);
                    break;
                case 13:
                    str3 = b.d(parcel, a2);
                    break;
                case 14:
                    j4 = b.l(parcel, a2);
                    break;
                case 15:
                    str4 = b.d(parcel, a2);
                    break;
                case 16:
                case 17:
                case 20:
                case 27:
                case 41:
                default:
                    b.n(parcel, a2);
                    break;
                case 18:
                    z2 = b.h(parcel, a2);
                    break;
                case 19:
                    str5 = b.d(parcel, a2);
                    break;
                case 21:
                    str6 = b.d(parcel, a2);
                    break;
                case 22:
                    z3 = b.h(parcel, a2);
                    break;
                case 23:
                    z4 = b.h(parcel, a2);
                    break;
                case 24:
                    z5 = b.h(parcel, a2);
                    break;
                case 25:
                    z6 = b.h(parcel, a2);
                    break;
                case 26:
                    z7 = b.h(parcel, a2);
                    break;
                case 28:
                    yfVar = (yf) b.a(parcel, a2, yf.CREATOR);
                    break;
                case 29:
                    str7 = b.d(parcel, a2);
                    break;
                case 30:
                    str8 = b.d(parcel, a2);
                    break;
                case 31:
                    z8 = b.h(parcel, a2);
                    break;
                case 32:
                    z9 = b.h(parcel, a2);
                    break;
                case 33:
                    uhVar = (uh) b.a(parcel, a2, uh.CREATOR);
                    break;
                case 34:
                    arrayList4 = b.f(parcel, a2);
                    break;
                case 35:
                    arrayList5 = b.f(parcel, a2);
                    break;
                case 36:
                    z10 = b.h(parcel, a2);
                    break;
                case 37:
                    nfVar = (nf) b.a(parcel, a2, nf.CREATOR);
                    break;
                case 38:
                    z11 = b.h(parcel, a2);
                    break;
                case 39:
                    str9 = b.d(parcel, a2);
                    break;
                case 40:
                    arrayList6 = b.f(parcel, a2);
                    break;
                case 42:
                    z12 = b.h(parcel, a2);
                    break;
                case 43:
                    str10 = b.d(parcel, a2);
                    break;
                case 44:
                    uiVar = (ui) b.a(parcel, a2, ui.CREATOR);
                    break;
                case 45:
                    str11 = b.d(parcel, a2);
                    break;
                case 46:
                    z13 = b.h(parcel, a2);
                    break;
                case 47:
                    z14 = b.h(parcel, a2);
                    break;
                case 48:
                    bundle = b.a(parcel, a2);
                    break;
                case 49:
                    z15 = b.h(parcel, a2);
                    break;
                case 50:
                    i4 = b.k(parcel, a2);
                    break;
                case 51:
                    z16 = b.h(parcel, a2);
                    break;
                case 52:
                    arrayList7 = b.f(parcel, a2);
                    break;
                case 53:
                    z17 = b.h(parcel, a2);
                    break;
                case 54:
                    str12 = b.d(parcel, a2);
                    break;
                case 55:
                    str13 = b.d(parcel, a2);
                    break;
                case 56:
                    z18 = b.h(parcel, a2);
                    break;
                case 57:
                    z19 = b.h(parcel, a2);
                    break;
            }
        }
        b.g(parcel, b2);
        return new lf(i, str, str2, arrayList, i2, arrayList2, j, z, j2, arrayList3, j3, i3, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, yfVar, str7, str8, z8, z9, uhVar, arrayList4, arrayList5, z10, nfVar, z11, str9, arrayList6, z12, str10, uiVar, str11, z13, z14, bundle, z15, i4, z16, arrayList7, z17, str12, str13, z18, z19);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ lf[] newArray(int i) {
        return new lf[i];
    }
}
