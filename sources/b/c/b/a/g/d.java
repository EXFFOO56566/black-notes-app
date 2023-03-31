package b.c.b.a.g;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final a.g<b.c.b.a.g.b.a> f1219a = new a.g<>();

    /* renamed from: b  reason: collision with root package name */
    private static final a.g<b.c.b.a.g.b.a> f1220b = new a.g<>();

    /* renamed from: c  reason: collision with root package name */
    public static final a.AbstractC0069a<b.c.b.a.g.b.a, a> f1221c = new c();
    private static final a.AbstractC0069a<b.c.b.a.g.b.a, Object> d = new f();

    static {
        new Scope("profile");
        new Scope("email");
        new a("SignIn.API", f1221c, f1219a);
        new a("SignIn.INTERNAL_API", d, f1220b);
    }
}
