package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;

public final class q00 extends rz1<q00, a> implements e12 {
    private static final q00 zzdz;
    private static volatile l12<q00> zzea;
    private int zzdl;
    private String zzdm = BuildConfig.FLAVOR;
    private long zzdn;
    private String zzdo = BuildConfig.FLAVOR;
    private String zzdp = BuildConfig.FLAVOR;
    private String zzdq = BuildConfig.FLAVOR;
    private long zzdr;
    private long zzds;
    private String zzdt = BuildConfig.FLAVOR;
    private long zzdu;
    private String zzdv = BuildConfig.FLAVOR;
    private String zzdw = BuildConfig.FLAVOR;
    private yz1<b> zzdx = rz1.o();
    private int zzdy;

    public static final class a extends rz1.a<q00, a> implements e12 {
        private a() {
            super(q00.zzdz);
        }

        /* synthetic */ a(pz pzVar) {
            this();
        }

        public final a a(long j) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((q00) this.f4576c).a((q00) j);
            return this;
        }

        public final a a(c cVar) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((q00) this.f4576c).a((q00) cVar);
            return this;
        }

        public final a a(String str) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((q00) this.f4576c).a((q00) str);
            return this;
        }

        public final a b(String str) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((q00) this.f4576c).b(str);
            return this;
        }

        public final a c(String str) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((q00) this.f4576c).c(str);
            return this;
        }

        public final a d(String str) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((q00) this.f4576c).d(str);
            return this;
        }

        public final a e(String str) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((q00) this.f4576c).e(str);
            return this;
        }
    }

    public static final class b extends rz1<b, a> implements e12 {
        private static volatile l12<b> zzea;
        private static final b zzed;
        private int zzdl;
        private String zzeb = BuildConfig.FLAVOR;
        private String zzec = BuildConfig.FLAVOR;

        public static final class a extends rz1.a<b, a> implements e12 {
            private a() {
                super(b.zzed);
            }

            /* synthetic */ a(pz pzVar) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzed = bVar;
            rz1.a(b.class, bVar);
        }

        private b() {
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.rz1
        public final Object a(int i, Object obj, Object obj2) {
            switch (pz.f4250a[i - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(null);
                case 3:
                    return rz1.a(zzed, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zzdl", "zzeb", "zzec"});
                case 4:
                    return zzed;
                case 5:
                    l12<b> l12 = zzea;
                    if (l12 == null) {
                        synchronized (b.class) {
                            l12 = zzea;
                            if (l12 == null) {
                                l12 = new rz1.c<>(zzed);
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

    public enum c implements tz1 {
        UNKNOWN(0),
        ENABLED(1),
        DISABLED(2);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f4255b;

        static {
            new r10();
        }

        private c(int i) {
            this.f4255b = i;
        }

        public static c a(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ENABLED;
            }
            if (i != 2) {
                return null;
            }
            return DISABLED;
        }

        public static vz1 b() {
            return v30.f5045a;
        }

        @Override // com.google.android.gms.internal.ads.tz1
        public final int a() {
            return this.f4255b;
        }

        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4255b + " name=" + name() + '>';
        }
    }

    static {
        q00 q00 = new q00();
        zzdz = q00;
        rz1.a(q00.class, q00);
    }

    private q00() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(long j) {
        this.zzdl |= 2;
        this.zzdn = j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(c cVar) {
        this.zzdy = cVar.a();
        this.zzdl |= 2048;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        str.getClass();
        this.zzdl |= 1;
        this.zzdm = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(String str) {
        str.getClass();
        this.zzdl |= 4;
        this.zzdo = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void c(String str) {
        str.getClass();
        this.zzdl |= 8;
        this.zzdp = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void d(String str) {
        str.getClass();
        this.zzdl |= 16;
        this.zzdq = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void e(String str) {
        str.getClass();
        this.zzdl |= 1024;
        this.zzdw = str;
    }

    public static a p() {
        return (a) zzdz.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (pz.f4250a[i - 1]) {
            case 1:
                return new q00();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzdz, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\b\u0007\t\u0002\b\n\b\t\u000b\b\n\f\u001b\r\f\u000b", new Object[]{"zzdl", "zzdm", "zzdn", "zzdo", "zzdp", "zzdq", "zzdr", "zzds", "zzdt", "zzdu", "zzdv", "zzdw", "zzdx", b.class, "zzdy", c.b()});
            case 4:
                return zzdz;
            case 5:
                l12<q00> l12 = zzea;
                if (l12 == null) {
                    synchronized (q00.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzdz);
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
