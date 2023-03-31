package b.c.b.a.g;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.p;

public final class a implements a.d.e {
    public static final a k = new a(false, false, null, false, null, null, false, null, null);

    /* renamed from: b  reason: collision with root package name */
    private final boolean f1211b = false;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1212c = false;
    private final String d = null;
    private final boolean e = false;
    private final String f = null;
    private final String g = null;
    private final boolean h = false;
    private final Long i = null;
    private final Long j = null;

    /* renamed from: b.c.b.a.g.a$a  reason: collision with other inner class name */
    public static final class C0060a {
    }

    static {
        new C0060a();
    }

    private a(boolean z, boolean z2, String str, boolean z3, String str2, String str3, boolean z4, Long l, Long l2) {
    }

    public final Long a() {
        return this.i;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.g;
    }

    public final Long e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1211b == aVar.f1211b && this.f1212c == aVar.f1212c && p.a(this.d, aVar.d) && this.e == aVar.e && this.h == aVar.h && p.a(this.f, aVar.f) && p.a(this.g, aVar.g) && p.a(this.i, aVar.i) && p.a(this.j, aVar.j);
    }

    public final String f() {
        return this.d;
    }

    public final boolean g() {
        return this.e;
    }

    public final boolean h() {
        return this.f1212c;
    }

    public final int hashCode() {
        return p.a(Boolean.valueOf(this.f1211b), Boolean.valueOf(this.f1212c), this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.h), this.f, this.g, this.i, this.j);
    }

    public final boolean i() {
        return this.f1211b;
    }

    public final boolean j() {
        return this.h;
    }
}
