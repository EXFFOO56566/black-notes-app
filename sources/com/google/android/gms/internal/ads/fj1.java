package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;

public final class fj1 extends rz1<fj1, b> implements e12 {
    private static volatile l12<fj1> zzea;
    private static final wz1<Integer, a> zzhbw = new ij1();
    private static final fj1 zzhca;
    private int zzdl;
    private xz1 zzhbv = rz1.m();
    private String zzhbx = BuildConfig.FLAVOR;
    private String zzhby = BuildConfig.FLAVOR;
    private String zzhbz = BuildConfig.FLAVOR;

    public enum a implements tz1 {
        BLOCKED_REASON_UNKNOWN(1),
        BLOCKED_REASON_BACKGROUND(2);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f2607b;

        static {
            new jj1();
        }

        private a(int i) {
            this.f2607b = i;
        }

        public static a a(int i) {
            if (i == 1) {
                return BLOCKED_REASON_UNKNOWN;
            }
            if (i != 2) {
                return null;
            }
            return BLOCKED_REASON_BACKGROUND;
        }

        public static vz1 b() {
            return kj1.f3406a;
        }

        @Override // com.google.android.gms.internal.ads.tz1
        public final int a() {
            return this.f2607b;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f2607b + " name=" + name() + '>';
        }
    }

    public static final class b extends rz1.a<fj1, b> implements e12 {
        private b() {
            super(fj1.zzhca);
        }

        /* synthetic */ b(ij1 ij1) {
            this();
        }

        public final b a(a aVar) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((fj1) this.f4576c).a((fj1) aVar);
            return this;
        }

        public final b a(String str) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((fj1) this.f4576c).a((fj1) str);
            return this;
        }
    }

    static {
        fj1 fj1 = new fj1();
        zzhca = fj1;
        rz1.a(fj1.class, fj1);
    }

    private fj1() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(a aVar) {
        aVar.getClass();
        if (!this.zzhbv.h()) {
            this.zzhbv = rz1.a(this.zzhbv);
        }
        this.zzhbv.a(aVar.a());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        str.getClass();
        this.zzdl |= 1;
        this.zzhbx = str;
    }

    public static b p() {
        return (b) zzhca.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hj1.f2927a[i - 1]) {
            case 1:
                return new fj1();
            case 2:
                return new b(null);
            case 3:
                return rz1.a(zzhca, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002\b\u0000\u0003\b\u0001\u0004\b\u0002", new Object[]{"zzdl", "zzhbv", a.b(), "zzhbx", "zzhby", "zzhbz"});
            case 4:
                return zzhca;
            case 5:
                l12<fj1> l12 = zzea;
                if (l12 == null) {
                    synchronized (fj1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhca);
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
