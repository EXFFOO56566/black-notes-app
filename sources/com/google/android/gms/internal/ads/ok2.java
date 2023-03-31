package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class ok2 extends rz1<ok2, c> implements e12 {
    private static final ok2 zzbwl;
    private static volatile l12<ok2> zzea;
    private yz1<a> zzbwk = rz1.o();

    public static final class a extends rz1<a, C0077a> implements e12 {
        private static final a zzbwp;
        private static volatile l12<a> zzea;
        private int zzbwm;
        private d zzbwn;
        private e zzbwo;
        private int zzdl;

        /* renamed from: com.google.android.gms.internal.ads.ok2$a$a  reason: collision with other inner class name */
        public static final class C0077a extends rz1.a<a, C0077a> implements e12 {
            private C0077a() {
                super(a.zzbwp);
            }

            /* synthetic */ C0077a(hk2 hk2) {
                this();
            }

            public final C0077a a(b bVar) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((a) this.f4576c).a((a) bVar);
                return this;
            }

            public final C0077a a(d.a aVar) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((a) this.f4576c).a((a) ((d) ((rz1) aVar.e())));
                return this;
            }

            public final C0077a a(e.a aVar) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((a) this.f4576c).a((a) ((e) ((rz1) aVar.e())));
                return this;
            }
        }

        static {
            a aVar = new a();
            zzbwp = aVar;
            rz1.a(a.class, aVar);
        }

        private a() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(b bVar) {
            this.zzbwm = bVar.a();
            this.zzdl |= 1;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(d dVar) {
            dVar.getClass();
            this.zzbwn = dVar;
            this.zzdl |= 2;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(e eVar) {
            eVar.getClass();
            this.zzbwo = eVar;
            this.zzdl |= 4;
        }

        public static C0077a p() {
            return (C0077a) zzbwp.j();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.rz1
        public final Object a(int i, Object obj, Object obj2) {
            switch (hk2.f2935a[i - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0077a(null);
                case 3:
                    return rz1.a(zzbwp, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzdl", "zzbwm", b.b(), "zzbwn", "zzbwo"});
                case 4:
                    return zzbwp;
                case 5:
                    l12<a> l12 = zzea;
                    if (l12 == null) {
                        synchronized (a.class) {
                            l12 = zzea;
                            if (l12 == null) {
                                l12 = new rz1.c<>(zzbwp);
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

    public enum b implements tz1 {
        UNSPECIFIED(0),
        IN_MEMORY(1);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f4011b;

        static {
            new ql2();
        }

        private b(int i) {
            this.f4011b = i;
        }

        public static b a(int i) {
            if (i == 0) {
                return UNSPECIFIED;
            }
            if (i != 1) {
                return null;
            }
            return IN_MEMORY;
        }

        public static vz1 b() {
            return pl2.f4201a;
        }

        @Override // com.google.android.gms.internal.ads.tz1
        public final int a() {
            return this.f4011b;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4011b + " name=" + name() + '>';
        }
    }

    public static final class c extends rz1.a<ok2, c> implements e12 {
        private c() {
            super(ok2.zzbwl);
        }

        /* synthetic */ c(hk2 hk2) {
            this();
        }

        public final c a(a.C0077a aVar) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((ok2) this.f4576c).a((ok2) ((a) ((rz1) aVar.e())));
            return this;
        }
    }

    public static final class d extends rz1<d, a> implements e12 {
        private static final d zzbwv;
        private static volatile l12<d> zzea;
        private boolean zzbwt;
        private int zzbwu;
        private int zzdl;

        public static final class a extends rz1.a<d, a> implements e12 {
            private a() {
                super(d.zzbwv);
            }

            /* synthetic */ a(hk2 hk2) {
                this();
            }

            public final a a(int i) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((d) this.f4576c).b(i);
                return this;
            }

            public final a a(boolean z) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((d) this.f4576c).a((d) z);
                return this;
            }
        }

        static {
            d dVar = new d();
            zzbwv = dVar;
            rz1.a(d.class, dVar);
        }

        private d() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(boolean z) {
            this.zzdl |= 1;
            this.zzbwt = z;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(int i) {
            this.zzdl |= 2;
            this.zzbwu = i;
        }

        public static a p() {
            return (a) zzbwv.j();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.rz1
        public final Object a(int i, Object obj, Object obj2) {
            switch (hk2.f2935a[i - 1]) {
                case 1:
                    return new d();
                case 2:
                    return new a(null);
                case 3:
                    return rz1.a(zzbwv, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u000b\u0001", new Object[]{"zzdl", "zzbwt", "zzbwu"});
                case 4:
                    return zzbwv;
                case 5:
                    l12<d> l12 = zzea;
                    if (l12 == null) {
                        synchronized (d.class) {
                            l12 = zzea;
                            if (l12 == null) {
                                l12 = new rz1.c<>(zzbwv);
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

    public static final class e extends rz1<e, a> implements e12 {
        private static final e zzbwy;
        private static volatile l12<e> zzea;
        private int zzbwu;
        private boolean zzbww;
        private boolean zzbwx;
        private int zzdl;

        public static final class a extends rz1.a<e, a> implements e12 {
            private a() {
                super(e.zzbwy);
            }

            /* synthetic */ a(hk2 hk2) {
                this();
            }

            public final a a(int i) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((e) this.f4576c).b((e) i);
                return this;
            }

            public final a a(boolean z) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((e) this.f4576c).a((e) z);
                return this;
            }

            public final a b(boolean z) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((e) this.f4576c).b((e) z);
                return this;
            }
        }

        static {
            e eVar = new e();
            zzbwy = eVar;
            rz1.a(e.class, eVar);
        }

        private e() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(boolean z) {
            this.zzdl |= 1;
            this.zzbww = z;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(int i) {
            this.zzdl |= 4;
            this.zzbwu = i;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(boolean z) {
            this.zzdl |= 2;
            this.zzbwx = z;
        }

        public static a p() {
            return (a) zzbwy.j();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.rz1
        public final Object a(int i, Object obj, Object obj2) {
            switch (hk2.f2935a[i - 1]) {
                case 1:
                    return new e();
                case 2:
                    return new a(null);
                case 3:
                    return rz1.a(zzbwy, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u000b\u0002", new Object[]{"zzdl", "zzbww", "zzbwx", "zzbwu"});
                case 4:
                    return zzbwy;
                case 5:
                    l12<e> l12 = zzea;
                    if (l12 == null) {
                        synchronized (e.class) {
                            l12 = zzea;
                            if (l12 == null) {
                                l12 = new rz1.c<>(zzbwy);
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

    static {
        ok2 ok2 = new ok2();
        zzbwl = ok2;
        rz1.a(ok2.class, ok2);
    }

    private ok2() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(a aVar) {
        aVar.getClass();
        if (!this.zzbwk.h()) {
            this.zzbwk = rz1.a(this.zzbwk);
        }
        this.zzbwk.add(aVar);
    }

    public static c p() {
        return (c) zzbwl.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new ok2();
            case 2:
                return new c(null);
            case 3:
                return rz1.a(zzbwl, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbwk", a.class});
            case 4:
                return zzbwl;
            case 5:
                l12<ok2> l12 = zzea;
                if (l12 == null) {
                    synchronized (ok2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzbwl);
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
