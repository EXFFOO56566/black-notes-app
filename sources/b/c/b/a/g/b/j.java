package b.c.b.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new i();

    /* renamed from: b  reason: collision with root package name */
    private final int f1215b;

    /* renamed from: c  reason: collision with root package name */
    private final s f1216c;

    j(int i, s sVar) {
        this.f1215b = i;
        this.f1216c = sVar;
    }

    public j(s sVar) {
        this(1, sVar);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1215b);
        c.a(parcel, 2, (Parcelable) this.f1216c, i, false);
        c.a(parcel, a2);
    }
}
