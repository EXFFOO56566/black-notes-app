package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.w.b;
import java.util.Random;
import java.util.WeakHashMap;

public final class on2 {
    private static on2 j = new on2();

    /* renamed from: a  reason: collision with root package name */
    private final sn f4021a;

    /* renamed from: b  reason: collision with root package name */
    private final cn2 f4022b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4023c;
    private final qr2 d;
    private final sr2 e;
    private final vr2 f;
    private final fo g;
    private final Random h;
    private final WeakHashMap<b, String> i;

    protected on2() {
        this(new sn(), new cn2(new pm2(), new mm2(), new oq2(), new a4(), new ih(), new hi(), new zd(), new d4()), new qr2(), new sr2(), new vr2(), sn.c(), new fo(0, 201004000, true), new Random(), new WeakHashMap());
    }

    private on2(sn snVar, cn2 cn2, qr2 qr2, sr2 sr2, vr2 vr2, String str, fo foVar, Random random, WeakHashMap<b, String> weakHashMap) {
        this.f4021a = snVar;
        this.f4022b = cn2;
        this.d = qr2;
        this.e = sr2;
        this.f = vr2;
        this.f4023c = str;
        this.g = foVar;
        this.h = random;
        this.i = weakHashMap;
    }

    public static sn a() {
        return j.f4021a;
    }

    public static cn2 b() {
        return j.f4022b;
    }

    public static sr2 c() {
        return j.e;
    }

    public static qr2 d() {
        return j.d;
    }

    public static vr2 e() {
        return j.f;
    }

    public static String f() {
        return j.f4023c;
    }

    public static fo g() {
        return j.g;
    }

    public static Random h() {
        return j.h;
    }

    public static WeakHashMap<b, String> i() {
        return j.i;
    }
}
