package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.util.HashMap;

public final class kk1 {
    private static final HashMap<String, Class<?>> f = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private final Context f3411a;

    /* renamed from: b  reason: collision with root package name */
    private final nk1 f3412b;

    /* renamed from: c  reason: collision with root package name */
    private final ji1 f3413c;
    private bk1 d;
    private final Object e = new Object();

    public kk1(Context context, nk1 nk1, ji1 ji1) {
        this.f3411a = context;
        this.f3412b = nk1;
        this.f3413c = ji1;
    }

    private final Object a(Class<?> cls, zj1 zj1) {
        try {
            return cls.getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f3411a, "msa-r", zj1.e(), null, new Bundle(), 2);
        } catch (Exception e2) {
            throw new lk1(2004, e2);
        }
    }

    private final synchronized Class<?> b(zj1 zj1) {
        if (zj1.b() != null) {
            String p = zj1.b().p();
            Class<?> cls = f.get(p);
            if (cls != null) {
                return cls;
            }
            try {
                File d2 = zj1.d();
                if (!d2.exists()) {
                    d2.mkdirs();
                }
                Class<?> loadClass = new DexClassLoader(zj1.c().getAbsolutePath(), d2.getAbsolutePath(), null, this.f3411a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                f.put(p, loadClass);
                return loadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e2) {
                throw new lk1(2008, e2);
            }
        } else {
            throw new lk1(4010, "mc");
        }
    }

    public final pi1 a() {
        bk1 bk1;
        synchronized (this.e) {
            bk1 = this.d;
        }
        return bk1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Exception] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.internal.ads.zj1 r9) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kk1.a(com.google.android.gms.internal.ads.zj1):void");
    }

    public final zj1 b() {
        synchronized (this.e) {
            if (this.d == null) {
                return null;
            }
            return this.d.b();
        }
    }
}
