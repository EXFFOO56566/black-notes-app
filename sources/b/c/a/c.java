package b.c.a;

import com.google.android.gms.ads.e;

@Deprecated
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final c f1138b = new c(-1, -2, "mb");

    /* renamed from: c  reason: collision with root package name */
    public static final c f1139c = new c(320, 50, "mb");
    public static final c d = new c(300, 250, "as");
    public static final c e = new c(468, 60, "as");
    public static final c f = new c(728, 90, "as");
    public static final c g = new c(160, 600, "as");

    /* renamed from: a  reason: collision with root package name */
    private final e f1140a;

    private c(int i, int i2, String str) {
        this(new e(i, i2));
    }

    public c(e eVar) {
        this.f1140a = eVar;
    }

    public final int a() {
        return this.f1140a.a();
    }

    public final int b() {
        return this.f1140a.b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f1140a.equals(((c) obj).f1140a);
    }

    public final int hashCode() {
        return this.f1140a.hashCode();
    }

    public final String toString() {
        return this.f1140a.toString();
    }
}
