package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class lm extends a {
    public static final Parcelable.Creator<lm> CREATOR = new nm();

    /* renamed from: b  reason: collision with root package name */
    public final String f3575b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3576c;

    lm(String str, int i) {
        this.f3575b = str == null ? BuildConfig.FLAVOR : str;
        this.f3576c = i;
    }

    public static lm a(Throwable th, int i) {
        return new lm(th.getMessage(), i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f3575b, false);
        c.a(parcel, 2, this.f3576c);
        c.a(parcel, a2);
    }
}
