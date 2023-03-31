package b.c.b.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.c.b;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new k();

    /* renamed from: b  reason: collision with root package name */
    private final int f1217b;

    /* renamed from: c  reason: collision with root package name */
    private final b f1218c;
    private final t d;

    public l(int i) {
        this(new b(8, null), null);
    }

    l(int i, b bVar, t tVar) {
        this.f1217b = i;
        this.f1218c = bVar;
        this.d = tVar;
    }

    private l(b bVar, t tVar) {
        this(1, bVar, null);
    }

    public final b d() {
        return this.f1218c;
    }

    public final t e() {
        return this.d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1217b);
        c.a(parcel, 2, (Parcelable) this.f1218c, i, false);
        c.a(parcel, 3, (Parcelable) this.d, i, false);
        c.a(parcel, a2);
    }
}
