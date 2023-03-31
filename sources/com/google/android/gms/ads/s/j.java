package com.google.android.gms.ads.s;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import com.google.android.gms.internal.ads.mo2;
import com.google.android.gms.internal.ads.no2;
import com.google.android.gms.internal.ads.r3;
import com.google.android.gms.internal.ads.u3;

public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new n();

    /* renamed from: b  reason: collision with root package name */
    private final boolean f1475b;

    /* renamed from: c  reason: collision with root package name */
    private final no2 f1476c;
    private final IBinder d;

    j(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.f1475b = z;
        this.f1476c = iBinder != null ? mo2.a(iBinder) : null;
        this.d = iBinder2;
    }

    public final boolean d() {
        return this.f1475b;
    }

    public final no2 e() {
        return this.f1476c;
    }

    public final r3 g() {
        return u3.a(this.d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, d());
        no2 no2 = this.f1476c;
        c.a(parcel, 2, no2 == null ? null : no2.asBinder(), false);
        c.a(parcel, 3, this.d, false);
        c.a(parcel, a2);
    }
}
