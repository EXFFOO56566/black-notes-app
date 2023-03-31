package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class nf extends a {
    public static final Parcelable.Creator<nf> CREATOR = new mf();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3836b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f3837c;

    public nf() {
        this(false, Collections.emptyList());
    }

    public nf(boolean z, List<String> list) {
        this.f3836b = z;
        this.f3837c = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f3836b);
        c.b(parcel, 3, this.f3837c, false);
        c.a(parcel, a2);
    }
}
