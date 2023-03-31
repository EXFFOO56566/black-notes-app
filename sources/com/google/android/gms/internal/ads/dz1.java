package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class dz1 {

    /* renamed from: b  reason: collision with root package name */
    private static volatile dz1 f2339b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile dz1 f2340c;
    private static final dz1 d = new dz1(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, rz1.d<?, ?>> f2341a;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f2342a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2343b;

        a(Object obj, int i) {
            this.f2342a = obj;
            this.f2343b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2342a == aVar.f2342a && this.f2343b == aVar.f2343b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f2342a) * 65535) + this.f2343b;
        }
    }

    dz1() {
        this.f2341a = new HashMap();
    }

    private dz1(boolean z) {
        this.f2341a = Collections.emptyMap();
    }

    public static dz1 a() {
        dz1 dz1 = f2339b;
        if (dz1 == null) {
            synchronized (dz1.class) {
                dz1 = f2339b;
                if (dz1 == null) {
                    dz1 = d;
                    f2339b = dz1;
                }
            }
        }
        return dz1;
    }

    public static dz1 b() {
        dz1 dz1 = f2340c;
        if (dz1 != null) {
            return dz1;
        }
        synchronized (dz1.class) {
            dz1 dz12 = f2340c;
            if (dz12 != null) {
                return dz12;
            }
            dz1 a2 = qz1.a(dz1.class);
            f2340c = a2;
            return a2;
        }
    }

    public final <ContainingType extends c12> rz1.d<ContainingType, ?> a(ContainingType containingtype, int i) {
        return (rz1.d<ContainingType, ?>) this.f2341a.get(new a(containingtype, i));
    }
}
