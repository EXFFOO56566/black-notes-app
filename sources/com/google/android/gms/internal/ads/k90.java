package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

public class k90 {

    /* renamed from: a  reason: collision with root package name */
    private final Set<ab0<jm2>> f3345a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<ab0<u50>> f3346b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<ab0<n60>> f3347c;
    private final Set<ab0<q70>> d;
    private final Set<ab0<l70>> e;
    private final Set<ab0<a60>> f;
    private final Set<ab0<j60>> g;
    private final Set<ab0<com.google.android.gms.ads.x.a>> h;
    private final Set<ab0<com.google.android.gms.ads.r.a>> i;
    private final Set<ab0<b80>> j;
    private final jb1 k;
    private y50 l;
    private lw0 m;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Set<ab0<jm2>> f3348a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        private Set<ab0<u50>> f3349b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private Set<ab0<n60>> f3350c = new HashSet();
        private Set<ab0<q70>> d = new HashSet();
        private Set<ab0<l70>> e = new HashSet();
        private Set<ab0<a60>> f = new HashSet();
        private Set<ab0<com.google.android.gms.ads.x.a>> g = new HashSet();
        private Set<ab0<com.google.android.gms.ads.r.a>> h = new HashSet();
        private Set<ab0<j60>> i = new HashSet();
        private Set<ab0<b80>> j = new HashSet();
        private jb1 k;

        public final a a(com.google.android.gms.ads.r.a aVar, Executor executor) {
            this.h.add(new ab0<>(aVar, executor));
            return this;
        }

        public final a a(com.google.android.gms.ads.x.a aVar, Executor executor) {
            this.g.add(new ab0<>(aVar, executor));
            return this;
        }

        public final a a(a60 a60, Executor executor) {
            this.f.add(new ab0<>(a60, executor));
            return this;
        }

        public final a a(b80 b80, Executor executor) {
            this.j.add(new ab0<>(b80, executor));
            return this;
        }

        public final a a(j60 j60, Executor executor) {
            this.i.add(new ab0<>(j60, executor));
            return this;
        }

        public final a a(jb1 jb1) {
            this.k = jb1;
            return this;
        }

        public final a a(jm2 jm2, Executor executor) {
            this.f3348a.add(new ab0<>(jm2, executor));
            return this;
        }

        public final a a(l70 l70, Executor executor) {
            this.e.add(new ab0<>(l70, executor));
            return this;
        }

        public final a a(n60 n60, Executor executor) {
            this.f3350c.add(new ab0<>(n60, executor));
            return this;
        }

        public final a a(no2 no2, Executor executor) {
            if (this.h != null) {
                uz0 uz0 = new uz0();
                uz0.a(no2);
                this.h.add(new ab0<>(uz0, executor));
            }
            return this;
        }

        public final a a(q70 q70, Executor executor) {
            this.d.add(new ab0<>(q70, executor));
            return this;
        }

        public final a a(u50 u50, Executor executor) {
            this.f3349b.add(new ab0<>(u50, executor));
            return this;
        }

        public final k90 a() {
            return new k90(this);
        }
    }

    private k90(a aVar) {
        this.f3345a = aVar.f3348a;
        this.f3347c = aVar.f3350c;
        this.d = aVar.d;
        this.f3346b = aVar.f3349b;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.i;
        this.h = aVar.g;
        this.i = aVar.h;
        this.j = aVar.j;
        this.k = aVar.k;
    }

    public final lw0 a(d dVar, nw0 nw0) {
        if (this.m == null) {
            this.m = new lw0(dVar, nw0);
        }
        return this.m;
    }

    public final y50 a(Set<ab0<a60>> set) {
        if (this.l == null) {
            this.l = new y50(set);
        }
        return this.l;
    }

    public final Set<ab0<u50>> a() {
        return this.f3346b;
    }

    public final Set<ab0<l70>> b() {
        return this.e;
    }

    public final Set<ab0<a60>> c() {
        return this.f;
    }

    public final Set<ab0<j60>> d() {
        return this.g;
    }

    public final Set<ab0<com.google.android.gms.ads.x.a>> e() {
        return this.h;
    }

    public final Set<ab0<com.google.android.gms.ads.r.a>> f() {
        return this.i;
    }

    public final Set<ab0<jm2>> g() {
        return this.f3345a;
    }

    public final Set<ab0<n60>> h() {
        return this.f3347c;
    }

    public final Set<ab0<q70>> i() {
        return this.d;
    }

    public final Set<ab0<b80>> j() {
        return this.j;
    }

    public final jb1 k() {
        return this.k;
    }
}
