package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.n;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class yq2 extends a {
    public static final Parcelable.Creator<yq2> CREATOR = new cr2();

    /* renamed from: b  reason: collision with root package name */
    private final int f5636b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5637c;

    public yq2(int i, int i2) {
        this.f5636b = i;
        this.f5637c = i2;
    }

    public yq2(n nVar) {
        this.f5636b = nVar.b();
        this.f5637c = nVar.c();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f5636b);
        c.a(parcel, 2, this.f5637c);
        c.a(parcel, a2);
    }
}
