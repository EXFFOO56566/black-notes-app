package com.google.android.gms.ads.s;

import com.google.android.gms.ads.q;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f1464a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1465b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1466c;
    private final boolean d;
    private final int e;
    private final q f;
    private final boolean g;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1467a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f1468b = -1;

        /* renamed from: c  reason: collision with root package name */
        private int f1469c = 0;
        private boolean d = false;
        private q e;
        private int f = 1;
        private boolean g = false;

        public final a a(int i) {
            this.f = i;
            return this;
        }

        public final a a(q qVar) {
            this.e = qVar;
            return this;
        }

        public final a a(boolean z) {
            this.d = z;
            return this;
        }

        public final d a() {
            return new d(this);
        }

        @Deprecated
        public final a b(int i) {
            this.f1468b = i;
            return this;
        }

        public final a b(boolean z) {
            this.f1467a = z;
            return this;
        }
    }

    private d(a aVar) {
        this.f1464a = aVar.f1467a;
        this.f1465b = aVar.f1468b;
        this.f1466c = aVar.f1469c;
        this.d = aVar.d;
        this.e = aVar.f;
        this.f = aVar.e;
        this.g = aVar.g;
    }

    public final int a() {
        return this.e;
    }

    @Deprecated
    public final int b() {
        return this.f1465b;
    }

    public final int c() {
        return this.f1466c;
    }

    public final q d() {
        return this.f;
    }

    public final boolean e() {
        return this.d;
    }

    public final boolean f() {
        return this.f1464a;
    }

    public final boolean g() {
        return this.g;
    }
}
