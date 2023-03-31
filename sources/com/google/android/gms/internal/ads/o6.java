package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class o6 extends a {
    public static final Parcelable.Creator<o6> CREATOR = new r6();

    /* renamed from: b  reason: collision with root package name */
    public final String f3951b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f3952c;

    public o6(String str, Bundle bundle) {
        this.f3951b = str;
        this.f3952c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f3951b, false);
        c.a(parcel, 2, this.f3952c, false);
        c.a(parcel, a2);
    }
}
