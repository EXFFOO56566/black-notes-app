package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;

public final class g72 extends rz1<g72, a> implements e12 {
    private static final g72 zzabs;
    private static volatile l12<g72> zzea;
    private String zzabn = BuildConfig.FLAVOR;
    private String zzabo = BuildConfig.FLAVOR;
    private long zzabp;
    private long zzabq;
    private long zzabr;
    private int zzdl;

    public static final class a extends rz1.a<g72, a> implements e12 {
        private a() {
            super(g72.zzabs);
        }

        /* synthetic */ a(f72 f72) {
            this();
        }

        public final a a(long j) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((g72) this.f4576c).a((g72) j);
            return this;
        }

        public final a a(String str) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((g72) this.f4576c).a((g72) str);
            return this;
        }

        public final a b(long j) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((g72) this.f4576c).b((g72) j);
            return this;
        }

        public final a b(String str) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((g72) this.f4576c).b((g72) str);
            return this;
        }

        public final a c(long j) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((g72) this.f4576c).c(j);
            return this;
        }
    }

    static {
        g72 g72 = new g72();
        zzabs = g72;
        rz1.a(g72.class, g72);
    }

    private g72() {
    }

    public static g72 a(dy1 dy1) {
        return (g72) rz1.a(zzabs, dy1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(long j) {
        this.zzdl |= 4;
        this.zzabp = j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        str.getClass();
        this.zzdl |= 1;
        this.zzabn = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(long j) {
        this.zzdl |= 8;
        this.zzabq = j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(String str) {
        str.getClass();
        this.zzdl |= 2;
        this.zzabo = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void c(long j) {
        this.zzdl |= 16;
        this.zzabr = j;
    }

    public static a u() {
        return (a) zzabs.j();
    }

    public static g72 v() {
        return zzabs;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (f72.f2550a[i - 1]) {
            case 1:
                return new g72();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzabs, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0003\u0002\u0004\u0003\u0003\u0005\u0003\u0004", new Object[]{"zzdl", "zzabn", "zzabo", "zzabp", "zzabq", "zzabr"});
            case 4:
                return zzabs;
            case 5:
                l12<g72> l12 = zzea;
                if (l12 == null) {
                    synchronized (g72.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzabs);
                            zzea = l12;
                        }
                    }
                }
                return l12;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final String p() {
        return this.zzabn;
    }

    public final String q() {
        return this.zzabo;
    }

    public final long r() {
        return this.zzabp;
    }

    public final long s() {
        return this.zzabq;
    }

    public final long t() {
        return this.zzabr;
    }
}
