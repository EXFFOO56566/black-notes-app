package b.c.b.a.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new s();

    /* renamed from: b  reason: collision with root package name */
    private final String f1158b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    private final int f1159c;
    private final long d;

    public d(String str, int i, long j) {
        this.f1158b = str;
        this.f1159c = i;
        this.d = j;
    }

    public String d() {
        return this.f1158b;
    }

    public long e() {
        long j = this.d;
        return j == -1 ? (long) this.f1159c : j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            return ((d() != null && d().equals(dVar.d())) || (d() == null && dVar.d() == null)) && e() == dVar.e();
        }
    }

    public int hashCode() {
        return p.a(d(), Long.valueOf(e()));
    }

    public String toString() {
        p.a a2 = p.a(this);
        a2.a("name", d());
        a2.a("version", Long.valueOf(e()));
        return a2.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, d(), false);
        c.a(parcel, 2, this.f1159c);
        c.a(parcel, 3, e());
        c.a(parcel, a2);
    }
}
