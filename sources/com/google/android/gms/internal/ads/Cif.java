package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.if  reason: invalid class name */
public final class Cif implements Parcelable.Creator<jf> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ jf createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        long j = 0;
        long j2 = 0;
        Bundle bundle = null;
        rm2 rm2 = null;
        um2 um2 = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        fo foVar = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        m1 m1Var = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        xp2 xp2 = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        q6 q6Var = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    i = b.k(parcel, a2);
                    break;
                case 2:
                    bundle = b.a(parcel, a2);
                    break;
                case 3:
                    rm2 = (rm2) b.a(parcel, a2, rm2.CREATOR);
                    break;
                case 4:
                    um2 = (um2) b.a(parcel, a2, um2.CREATOR);
                    break;
                case 5:
                    str = b.d(parcel, a2);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) b.a(parcel, a2, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) b.a(parcel, a2, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = b.d(parcel, a2);
                    break;
                case 9:
                    str3 = b.d(parcel, a2);
                    break;
                case 10:
                    str4 = b.d(parcel, a2);
                    break;
                case 11:
                    foVar = (fo) b.a(parcel, a2, fo.CREATOR);
                    break;
                case 12:
                    bundle2 = b.a(parcel, a2);
                    break;
                case 13:
                    i2 = b.k(parcel, a2);
                    break;
                case 14:
                    arrayList = b.f(parcel, a2);
                    break;
                case 15:
                    bundle3 = b.a(parcel, a2);
                    break;
                case 16:
                    z = b.h(parcel, a2);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 62:
                default:
                    b.n(parcel, a2);
                    break;
                case 18:
                    i3 = b.k(parcel, a2);
                    break;
                case 19:
                    i4 = b.k(parcel, a2);
                    break;
                case 20:
                    f = b.i(parcel, a2);
                    break;
                case 21:
                    str5 = b.d(parcel, a2);
                    break;
                case 25:
                    j = b.l(parcel, a2);
                    break;
                case 26:
                    str6 = b.d(parcel, a2);
                    break;
                case 27:
                    arrayList2 = b.f(parcel, a2);
                    break;
                case 28:
                    str7 = b.d(parcel, a2);
                    break;
                case 29:
                    m1Var = (m1) b.a(parcel, a2, m1.CREATOR);
                    break;
                case 30:
                    arrayList3 = b.f(parcel, a2);
                    break;
                case 31:
                    j2 = b.l(parcel, a2);
                    break;
                case 33:
                    str8 = b.d(parcel, a2);
                    break;
                case 34:
                    f2 = b.i(parcel, a2);
                    break;
                case 35:
                    i5 = b.k(parcel, a2);
                    break;
                case 36:
                    i6 = b.k(parcel, a2);
                    break;
                case 37:
                    z3 = b.h(parcel, a2);
                    break;
                case 38:
                    z4 = b.h(parcel, a2);
                    break;
                case 39:
                    str9 = b.d(parcel, a2);
                    break;
                case 40:
                    z2 = b.h(parcel, a2);
                    break;
                case 41:
                    str10 = b.d(parcel, a2);
                    break;
                case 42:
                    z5 = b.h(parcel, a2);
                    break;
                case 43:
                    i7 = b.k(parcel, a2);
                    break;
                case 44:
                    bundle4 = b.a(parcel, a2);
                    break;
                case 45:
                    str11 = b.d(parcel, a2);
                    break;
                case 46:
                    xp2 = (xp2) b.a(parcel, a2, xp2.CREATOR);
                    break;
                case 47:
                    z6 = b.h(parcel, a2);
                    break;
                case 48:
                    bundle5 = b.a(parcel, a2);
                    break;
                case 49:
                    str12 = b.d(parcel, a2);
                    break;
                case 50:
                    str13 = b.d(parcel, a2);
                    break;
                case 51:
                    str14 = b.d(parcel, a2);
                    break;
                case 52:
                    z7 = b.h(parcel, a2);
                    break;
                case 53:
                    arrayList4 = b.c(parcel, a2);
                    break;
                case 54:
                    str15 = b.d(parcel, a2);
                    break;
                case 55:
                    arrayList5 = b.f(parcel, a2);
                    break;
                case 56:
                    i8 = b.k(parcel, a2);
                    break;
                case 57:
                    z8 = b.h(parcel, a2);
                    break;
                case 58:
                    z9 = b.h(parcel, a2);
                    break;
                case 59:
                    z10 = b.h(parcel, a2);
                    break;
                case 60:
                    arrayList6 = b.f(parcel, a2);
                    break;
                case 61:
                    str16 = b.d(parcel, a2);
                    break;
                case 63:
                    q6Var = (q6) b.a(parcel, a2, q6.CREATOR);
                    break;
                case 64:
                    str17 = b.d(parcel, a2);
                    break;
                case 65:
                    bundle6 = b.a(parcel, a2);
                    break;
            }
        }
        b.g(parcel, b2);
        return new jf(i, bundle, rm2, um2, str, applicationInfo, packageInfo, str2, str3, str4, foVar, bundle2, i2, arrayList, bundle3, z, i3, i4, f, str5, j, str6, arrayList2, str7, m1Var, arrayList3, j2, str8, f2, z2, i5, i6, z3, z4, str9, str10, z5, i7, bundle4, str11, xp2, z6, bundle5, str12, str13, str14, z7, arrayList4, str15, arrayList5, i8, z8, z9, z10, arrayList6, str16, q6Var, str17, bundle6);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ jf[] newArray(int i) {
        return new jf[i];
    }
}
