package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zf extends a {
    public static final Parcelable.Creator<zf> CREATOR = new cg();

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f5745b;

    /* renamed from: c  reason: collision with root package name */
    public final fo f5746c;
    public final ApplicationInfo d;
    public final String e;
    public final List<String> f;
    public final PackageInfo g;
    public final String h;
    public final boolean i;
    public final String j;
    public nf1 k;
    public String l;

    public zf(Bundle bundle, fo foVar, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, boolean z, String str3, nf1 nf1, String str4) {
        this.f5745b = bundle;
        this.f5746c = foVar;
        this.e = str;
        this.d = applicationInfo;
        this.f = list;
        this.g = packageInfo;
        this.h = str2;
        this.i = z;
        this.j = str3;
        this.k = nf1;
        this.l = str4;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f5745b, false);
        c.a(parcel, 2, (Parcelable) this.f5746c, i2, false);
        c.a(parcel, 3, (Parcelable) this.d, i2, false);
        c.a(parcel, 4, this.e, false);
        c.b(parcel, 5, this.f, false);
        c.a(parcel, 6, (Parcelable) this.g, i2, false);
        c.a(parcel, 7, this.h, false);
        c.a(parcel, 8, this.i);
        c.a(parcel, 9, this.j, false);
        c.a(parcel, 10, (Parcelable) this.k, i2, false);
        c.a(parcel, 11, this.l, false);
        c.a(parcel, a2);
    }
}
