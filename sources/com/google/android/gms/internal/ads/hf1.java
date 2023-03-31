package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.LinkedList;

final class hf1 {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedList<rf1<?>> f2906a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    private final int f2907b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2908c;
    private final jg1 d;

    public hf1(int i, int i2) {
        this.f2907b = i;
        this.f2908c = i2;
        this.d = new jg1();
    }

    private final void h() {
        while (!this.f2906a.isEmpty()) {
            if (q.j().a() - this.f2906a.getFirst().d >= ((long) this.f2908c)) {
                this.d.g();
                this.f2906a.remove();
            } else {
                return;
            }
        }
    }

    public final long a() {
        return this.d.a();
    }

    public final boolean a(rf1<?> rf1) {
        this.d.e();
        h();
        if (this.f2906a.size() == this.f2907b) {
            return false;
        }
        this.f2906a.add(rf1);
        return true;
    }

    public final int b() {
        h();
        return this.f2906a.size();
    }

    public final rf1<?> c() {
        this.d.e();
        h();
        if (this.f2906a.isEmpty()) {
            return null;
        }
        rf1<?> remove = this.f2906a.remove();
        if (remove != null) {
            this.d.f();
        }
        return remove;
    }

    public final long d() {
        return this.d.b();
    }

    public final int e() {
        return this.d.c();
    }

    public final String f() {
        return this.d.d();
    }

    public final ig1 g() {
        return this.d.h();
    }
}
