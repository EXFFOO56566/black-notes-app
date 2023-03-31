package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    private final String f1415b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1416c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    private final String h;
    public final Intent i;

    public d(Intent intent) {
        this(null, null, null, null, null, null, null, intent);
    }

    public d(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null);
    }

    public d(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.f1415b = str;
        this.f1416c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = intent;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f1415b, false);
        c.a(parcel, 3, this.f1416c, false);
        c.a(parcel, 4, this.d, false);
        c.a(parcel, 5, this.e, false);
        c.a(parcel, 6, this.f, false);
        c.a(parcel, 7, this.g, false);
        c.a(parcel, 8, this.h, false);
        c.a(parcel, 9, (Parcelable) this.i, i2, false);
        c.a(parcel, a2);
    }
}
