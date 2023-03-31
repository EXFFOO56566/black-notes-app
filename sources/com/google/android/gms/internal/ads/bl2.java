package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.pk2;
import com.google.android.gms.internal.ads.rz1;

public final class bl2 extends rz1<bl2, b> implements e12 {
    private static final bl2 zzcas;
    private static volatile l12<bl2> zzea;
    private yz1<a> zzbwk = rz1.o();
    private int zzcan;
    private int zzcao;
    private long zzcap;
    private String zzcaq = BuildConfig.FLAVOR;
    private long zzcar;
    private int zzdl;
    private String zzdm = BuildConfig.FLAVOR;

    public static final class a extends rz1<a, C0076a> implements e12 {
        private static final wz1<Integer, pk2.a> zzcay = new cm2();
        private static final a zzcbg;
        private static volatile l12<a> zzea;
        private long zzcat;
        private int zzcau;
        private long zzcav;
        private long zzcaw;
        private xz1 zzcax = rz1.m();
        private zk2 zzcaz;
        private int zzcba;
        private int zzcbb;
        private int zzcbc;
        private int zzcbd;
        private int zzcbe;
        private int zzcbf;
        private int zzdl;

        /* renamed from: com.google.android.gms.internal.ads.bl2$a$a  reason: collision with other inner class name */
        public static final class C0076a extends rz1.a<a, C0076a> implements e12 {
            private C0076a() {
                super(a.zzcbg);
            }

            /* synthetic */ C0076a(hk2 hk2) {
                this();
            }

            public final C0076a a(int i) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((a) this.f4576c).b((a) i);
                return this;
            }

            public final C0076a a(long j) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((a) this.f4576c).a((a) j);
                return this;
            }

            public final C0076a a(c cVar) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((a) this.f4576c).a((a) cVar);
                return this;
            }

            public final C0076a a(wl2 wl2) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((a) this.f4576c).a((a) wl2);
                return this;
            }

            public final C0076a a(zk2 zk2) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((a) this.f4576c).a((a) zk2);
                return this;
            }

            public final C0076a a(Iterable<? extends pk2.a> iterable) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((a) this.f4576c).a((a) iterable);
                return this;
            }

            public final C0076a b(long j) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((a) this.f4576c).b((a) j);
                return this;
            }

            public final C0076a b(wl2 wl2) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((a) this.f4576c).b((a) wl2);
                return this;
            }

            public final C0076a c(long j) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((a) this.f4576c).c((a) j);
                return this;
            }

            public final C0076a c(wl2 wl2) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((a) this.f4576c).c((a) wl2);
                return this;
            }

            public final C0076a d(wl2 wl2) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((a) this.f4576c).d(wl2);
                return this;
            }

            public final C0076a e(wl2 wl2) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((a) this.f4576c).e(wl2);
                return this;
            }
        }

        static {
            a aVar = new a();
            zzcbg = aVar;
            rz1.a(a.class, aVar);
        }

        private a() {
        }

        public static a a(byte[] bArr) {
            return (a) rz1.a(zzcbg, bArr);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(long j) {
            this.zzdl |= 1;
            this.zzcat = j;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(c cVar) {
            this.zzcbf = cVar.a();
            this.zzdl |= 1024;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(wl2 wl2) {
            this.zzcau = wl2.a();
            this.zzdl |= 2;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(zk2 zk2) {
            zk2.getClass();
            this.zzcaz = zk2;
            this.zzdl |= 16;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(Iterable<? extends pk2.a> iterable) {
            if (!this.zzcax.h()) {
                this.zzcax = rz1.a(this.zzcax);
            }
            for (pk2.a aVar : iterable) {
                this.zzcax.a(aVar.a());
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(int i) {
            this.zzdl |= 256;
            this.zzcbd = i;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(long j) {
            this.zzdl |= 4;
            this.zzcav = j;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(wl2 wl2) {
            this.zzcba = wl2.a();
            this.zzdl |= 32;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void c(long j) {
            this.zzdl |= 8;
            this.zzcaw = j;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void c(wl2 wl2) {
            this.zzcbb = wl2.a();
            this.zzdl |= 64;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void d(wl2 wl2) {
            this.zzcbc = wl2.a();
            this.zzdl |= 128;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void e(wl2 wl2) {
            this.zzcbe = wl2.a();
            this.zzdl |= 512;
        }

        public static C0076a r() {
            return (C0076a) zzcbg.j();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.rz1
        public final Object a(int i, Object obj, Object obj2) {
            switch (hk2.f2935a[i - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0076a(null);
                case 3:
                    return rz1.a(zzcbg, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001\u0002\u0000\u0002\f\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u001e\u0006\t\u0004\u0007\f\u0005\b\f\u0006\t\f\u0007\n\u0004\b\u000b\f\t\f\f\n", new Object[]{"zzdl", "zzcat", "zzcau", wl2.b(), "zzcav", "zzcaw", "zzcax", pk2.a.b(), "zzcaz", "zzcba", wl2.b(), "zzcbb", wl2.b(), "zzcbc", wl2.b(), "zzcbd", "zzcbe", wl2.b(), "zzcbf", c.b()});
                case 4:
                    return zzcbg;
                case 5:
                    l12<a> l12 = zzea;
                    if (l12 == null) {
                        synchronized (a.class) {
                            l12 = zzea;
                            if (l12 == null) {
                                l12 = new rz1.c<>(zzcbg);
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

        public final long p() {
            return this.zzcat;
        }

        public final wl2 q() {
            wl2 a2 = wl2.a(this.zzcau);
            return a2 == null ? wl2.ENUM_FALSE : a2;
        }
    }

    public static final class b extends rz1.a<bl2, b> implements e12 {
        private b() {
            super(bl2.zzcas);
        }

        /* synthetic */ b(hk2 hk2) {
            this();
        }

        public final b a(int i) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((bl2) this.f4576c).b((bl2) i);
            return this;
        }

        public final b a(long j) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((bl2) this.f4576c).a((bl2) j);
            return this;
        }

        public final b a(Iterable<? extends a> iterable) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((bl2) this.f4576c).a((bl2) iterable);
            return this;
        }

        public final b a(String str) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((bl2) this.f4576c).b((bl2) str);
            return this;
        }

        public final b b(int i) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((bl2) this.f4576c).c(i);
            return this;
        }

        public final b b(long j) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((bl2) this.f4576c).b((bl2) j);
            return this;
        }

        public final b b(String str) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((bl2) this.f4576c).a((bl2) str);
            return this;
        }
    }

    public enum c implements tz1 {
        UNSPECIFIED(0),
        CONNECTING(1),
        CONNECTED(2),
        DISCONNECTING(3),
        DISCONNECTED(4),
        SUSPENDED(5);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f1972b;

        static {
            new dm2();
        }

        private c(int i2) {
            this.f1972b = i2;
        }

        public static c a(int i2) {
            if (i2 == 0) {
                return UNSPECIFIED;
            }
            if (i2 == 1) {
                return CONNECTING;
            }
            if (i2 == 2) {
                return CONNECTED;
            }
            if (i2 == 3) {
                return DISCONNECTING;
            }
            if (i2 == 4) {
                return DISCONNECTED;
            }
            if (i2 != 5) {
                return null;
            }
            return SUSPENDED;
        }

        public static vz1 b() {
            return em2.f2450a;
        }

        @Override // com.google.android.gms.internal.ads.tz1
        public final int a() {
            return this.f1972b;
        }

        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f1972b + " name=" + name() + '>';
        }
    }

    static {
        bl2 bl2 = new bl2();
        zzcas = bl2;
        rz1.a(bl2.class, bl2);
    }

    private bl2() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(long j) {
        this.zzdl |= 4;
        this.zzcap = j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Iterable<? extends a> iterable) {
        if (!this.zzbwk.h()) {
            this.zzbwk = rz1.a(this.zzbwk);
        }
        tx1.a(iterable, this.zzbwk);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        str.getClass();
        this.zzdl |= 16;
        this.zzcaq = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzdl |= 1;
        this.zzcan = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(long j) {
        this.zzdl |= 32;
        this.zzcar = j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(String str) {
        str.getClass();
        this.zzdl |= 8;
        this.zzdm = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void c(int i) {
        this.zzdl |= 2;
        this.zzcao = i;
    }

    public static b p() {
        return (b) zzcas.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new bl2();
            case 2:
                return new b(null);
            case 3:
                return rz1.a(zzcas, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002\u0004\u0000\u0003\u0004\u0001\u0004\u0002\u0002\u0005\b\u0003\u0006\b\u0004\u0007\u0002\u0005", new Object[]{"zzdl", "zzbwk", a.class, "zzcan", "zzcao", "zzcap", "zzdm", "zzcaq", "zzcar"});
            case 4:
                return zzcas;
            case 5:
                l12<bl2> l12 = zzea;
                if (l12 == null) {
                    synchronized (bl2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzcas);
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
}
