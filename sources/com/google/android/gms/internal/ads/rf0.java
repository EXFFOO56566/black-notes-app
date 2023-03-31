package com.google.android.gms.internal.ads;

import a.e.g;
import java.util.ArrayList;

public final class rf0 {
    public static final rf0 h = new tf0().a();

    /* renamed from: a  reason: collision with root package name */
    private final b3 f4491a;

    /* renamed from: b  reason: collision with root package name */
    private final w2 f4492b;

    /* renamed from: c  reason: collision with root package name */
    private final q3 f4493c;
    private final l3 d;
    private final x6 e;
    private final g<String, i3> f;
    private final g<String, c3> g;

    private rf0(tf0 tf0) {
        this.f4491a = tf0.f4802a;
        this.f4492b = tf0.f4803b;
        this.f4493c = tf0.f4804c;
        this.f = new g<>(tf0.f);
        this.g = new g<>(tf0.g);
        this.d = tf0.d;
        this.e = tf0.e;
    }

    public final b3 a() {
        return this.f4491a;
    }

    public final i3 a(String str) {
        return this.f.get(str);
    }

    public final c3 b(String str) {
        return this.g.get(str);
    }

    public final w2 b() {
        return this.f4492b;
    }

    public final q3 c() {
        return this.f4493c;
    }

    public final l3 d() {
        return this.d;
    }

    public final x6 e() {
        return this.e;
    }

    public final ArrayList<String> f() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f4493c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f4491a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f4492b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.f.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList<String> g() {
        ArrayList<String> arrayList = new ArrayList<>(this.f.size());
        for (int i = 0; i < this.f.size(); i++) {
            arrayList.add(this.f.b(i));
        }
        return arrayList;
    }
}
