package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;
import java.util.ArrayList;

public final class cg implements Parcelable.Creator<zf> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zf createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        Bundle bundle = null;
        fo foVar = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList<String> arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        nf1 nf1 = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    bundle = b.a(parcel, a2);
                    break;
                case 2:
                    foVar = (fo) b.a(parcel, a2, fo.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) b.a(parcel, a2, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = b.d(parcel, a2);
                    break;
                case 5:
                    arrayList = b.f(parcel, a2);
                    break;
                case 6:
                    packageInfo = (PackageInfo) b.a(parcel, a2, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = b.d(parcel, a2);
                    break;
                case 8:
                    z = b.h(parcel, a2);
                    break;
                case 9:
                    str3 = b.d(parcel, a2);
                    break;
                case 10:
                    nf1 = (nf1) b.a(parcel, a2, nf1.CREATOR);
                    break;
                case 11:
                    str4 = b.d(parcel, a2);
                    break;
                default:
                    b.n(parcel, a2);
                    break;
            }
        }
        b.g(parcel, b2);
        return new zf(bundle, foVar, applicationInfo, str, arrayList, packageInfo, str2, z, str3, nf1, str4);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zf[] newArray(int i) {
        return new zf[i];
    }
}
