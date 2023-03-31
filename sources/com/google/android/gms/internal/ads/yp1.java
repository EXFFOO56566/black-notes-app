package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class yp1<P> {
    private static final Charset d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentMap<String, List<xp1<P>>> f5626a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private xp1<P> f5627b;

    /* renamed from: c  reason: collision with root package name */
    private final Class<P> f5628c;

    private yp1(Class<P> cls) {
        this.f5628c = cls;
    }

    public static <P> yp1<P> a(Class<P> cls) {
        return new yp1<>(cls);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.xp1<P> a(P r9, com.google.android.gms.internal.ads.yu1.a r10) {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yp1.a(java.lang.Object, com.google.android.gms.internal.ads.yu1$a):com.google.android.gms.internal.ads.xp1");
    }

    public final Class<P> a() {
        return this.f5628c;
    }

    public final void a(xp1<P> xp1) {
        if (xp1 == null) {
            throw new IllegalArgumentException("the primary entry must be non-null");
        } else if (xp1.b() == su1.ENABLED) {
            List<xp1<P>> list = this.f5626a.get(new String(xp1.d(), d));
            if (list == null) {
                list = Collections.emptyList();
            }
            if (!list.isEmpty()) {
                this.f5627b = xp1;
                return;
            }
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        } else {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
    }

    public final xp1<P> b() {
        return this.f5627b;
    }
}
