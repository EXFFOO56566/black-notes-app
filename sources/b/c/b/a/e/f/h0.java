package b.c.b.a.e.f;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class h0 extends a {
    public static final Parcelable.Creator<h0> CREATOR = new j0();

    /* renamed from: b  reason: collision with root package name */
    public final long f1202b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1203c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final Bundle h;

    public h0(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.f1202b = j;
        this.f1203c = j2;
        this.d = z;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1202b);
        c.a(parcel, 2, this.f1203c);
        c.a(parcel, 3, this.d);
        c.a(parcel, 4, this.e, false);
        c.a(parcel, 5, this.f, false);
        c.a(parcel, 6, this.g, false);
        c.a(parcel, 7, this.h, false);
        c.a(parcel, a2);
    }
}
