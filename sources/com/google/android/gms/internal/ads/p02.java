package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

/* access modifiers changed from: package-private */
public final class p02 implements y12 {

    /* renamed from: b  reason: collision with root package name */
    private static final z02 f4084b = new s02();

    /* renamed from: a  reason: collision with root package name */
    private final z02 f4085a;

    public p02() {
        this(new r02(pz1.a(), a()));
    }

    private p02(z02 z02) {
        uz1.a((Object) z02, "messageInfoFactory");
        this.f4085a = z02;
    }

    private static z02 a() {
        try {
            return (z02) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f4084b;
        }
    }

    private static boolean a(a12 a12) {
        return a12.a() == rz1.f.i;
    }

    @Override // com.google.android.gms.internal.ads.y12
    public final <T> z12<T> a(Class<T> cls) {
        b22.a((Class<?>) cls);
        a12 a2 = this.f4085a.a(cls);
        if (a2.b()) {
            return rz1.class.isAssignableFrom(cls) ? i12.a(b22.c(), hz1.b(), a2.c()) : i12.a(b22.a(), hz1.c(), a2.c());
        }
        if (rz1.class.isAssignableFrom(cls)) {
            boolean a3 = a(a2);
            k12 b2 = m12.b();
            l02 b3 = l02.b();
            s22<?, ?> c2 = b22.c();
            return a3 ? g12.a(cls, a2, b2, b3, c2, hz1.b(), x02.b()) : g12.a(cls, a2, b2, b3, c2, (fz1<?>) null, x02.b());
        }
        boolean a4 = a(a2);
        k12 a5 = m12.a();
        l02 a6 = l02.a();
        return a4 ? g12.a(cls, a2, a5, a6, b22.a(), hz1.c(), x02.a()) : g12.a(cls, a2, a5, a6, b22.b(), (fz1<?>) null, x02.a());
    }
}
