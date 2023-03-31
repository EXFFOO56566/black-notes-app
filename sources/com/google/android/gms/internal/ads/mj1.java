package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.fj1;
import com.google.android.gms.internal.ads.rz1;

public final class mj1 extends rz1<mj1, b> implements e12 {
    private static volatile l12<mj1> zzea;
    private static final mj1 zzhch;
    private int zzdl;
    private String zzdm = BuildConfig.FLAVOR;
    private int zzhce;
    private String zzhcf = BuildConfig.FLAVOR;
    private fj1 zzhcg;

    public enum a implements tz1 {
        EVENT_TYPE_UNKNOWN(0),
        BLOCKED_IMPRESSION(1);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f3722b;

        static {
            new oj1();
        }

        private a(int i) {
            this.f3722b = i;
        }

        public static a a(int i) {
            if (i == 0) {
                return EVENT_TYPE_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return BLOCKED_IMPRESSION;
        }

        public static vz1 b() {
            return nj1.f3858a;
        }

        @Override // com.google.android.gms.internal.ads.tz1
        public final int a() {
            return this.f3722b;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f3722b + " name=" + name() + '>';
        }
    }

    public static final class b extends rz1.a<mj1, b> implements e12 {
        private b() {
            super(mj1.zzhch);
        }

        /* synthetic */ b(lj1 lj1) {
            this();
        }

        public final b a(fj1.b bVar) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((mj1) this.f4576c).a((mj1) ((fj1) ((rz1) bVar.e())));
            return this;
        }

        public final b a(a aVar) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((mj1) this.f4576c).a((mj1) aVar);
            return this;
        }

        public final b a(String str) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((mj1) this.f4576c).a((mj1) str);
            return this;
        }
    }

    static {
        mj1 mj1 = new mj1();
        zzhch = mj1;
        rz1.a(mj1.class, mj1);
    }

    private mj1() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(fj1 fj1) {
        fj1.getClass();
        this.zzhcg = fj1;
        this.zzdl |= 8;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(a aVar) {
        this.zzhce = aVar.a();
        this.zzdl |= 1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        str.getClass();
        this.zzdl |= 2;
        this.zzdm = str;
    }

    public static b p() {
        return (b) zzhch.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (lj1.f3569a[i - 1]) {
            case 1:
                return new mj1();
            case 2:
                return new b(null);
            case 3:
                return rz1.a(zzhch, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\b\u0002\u0004\t\u0003", new Object[]{"zzdl", "zzhce", a.b(), "zzdm", "zzhcf", "zzhcg"});
            case 4:
                return zzhch;
            case 5:
                l12<mj1> l12 = zzea;
                if (l12 == null) {
                    synchronized (mj1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhch);
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
