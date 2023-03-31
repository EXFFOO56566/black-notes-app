package b.c.b.a.g.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.w.a;

public final class c extends a implements k {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: b  reason: collision with root package name */
    private final int f1213b;

    /* renamed from: c  reason: collision with root package name */
    private int f1214c;
    private Intent d;

    public c() {
        this(0, null);
    }

    c(int i, int i2, Intent intent) {
        this.f1213b = i;
        this.f1214c = i2;
        this.d = intent;
    }

    private c(int i, Intent intent) {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.k
    public final Status a() {
        return this.f1214c == 0 ? Status.f : Status.j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.a(parcel, 1, this.f1213b);
        com.google.android.gms.common.internal.w.c.a(parcel, 2, this.f1214c);
        com.google.android.gms.common.internal.w.c.a(parcel, 3, (Parcelable) this.d, i, false);
        com.google.android.gms.common.internal.w.c.a(parcel, a2);
    }
}
