package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rk2;
import com.google.android.gms.internal.ads.rz1;

public final class ik2 extends rz1<ik2, b> implements e12 {
    private static final ik2 zzbwj;
    private static volatile l12<ik2> zzea;
    private int zzbvy;
    private int zzbvz = 1000;
    private qk2 zzbwa;
    private rk2 zzbwb;
    private yz1<pk2> zzbwc = rz1.o();
    private sk2 zzbwd;
    private cl2 zzbwe;
    private al2 zzbwf;
    private xk2 zzbwg;
    private yk2 zzbwh;
    private yz1<il2> zzbwi = rz1.o();
    private int zzdl;

    public enum a implements tz1 {
        AD_INITIATER_UNSPECIFIED(0),
        BANNER(1),
        DFP_BANNER(2),
        INTERSTITIAL(3),
        DFP_INTERSTITIAL(4),
        NATIVE_EXPRESS(5),
        AD_LOADER(6),
        REWARD_BASED_VIDEO_AD(7),
        BANNER_SEARCH_ADS(8),
        GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
        APP_OPEN(10);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f3106b;

        static {
            new ol2();
        }

        private a(int i) {
            this.f3106b = i;
        }

        public static a a(int i) {
            switch (i) {
                case 0:
                    return AD_INITIATER_UNSPECIFIED;
                case 1:
                    return BANNER;
                case 2:
                    return DFP_BANNER;
                case 3:
                    return INTERSTITIAL;
                case 4:
                    return DFP_INTERSTITIAL;
                case 5:
                    return NATIVE_EXPRESS;
                case 6:
                    return AD_LOADER;
                case 7:
                    return REWARD_BASED_VIDEO_AD;
                case 8:
                    return BANNER_SEARCH_ADS;
                case 9:
                    return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                case 10:
                    return APP_OPEN;
                default:
                    return null;
            }
        }

        public static vz1 b() {
            return nl2.f3866a;
        }

        @Override // com.google.android.gms.internal.ads.tz1
        public final int a() {
            return this.f3106b;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f3106b + " name=" + name() + '>';
        }
    }

    public static final class b extends rz1.a<ik2, b> implements e12 {
        private b() {
            super(ik2.zzbwj);
        }

        /* synthetic */ b(hk2 hk2) {
            this();
        }

        public final b a(a aVar) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((ik2) this.f4576c).a((ik2) aVar);
            return this;
        }

        public final b a(rk2.a aVar) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((ik2) this.f4576c).a((ik2) ((rk2) ((rz1) aVar.e())));
            return this;
        }
    }

    static {
        ik2 ik2 = new ik2();
        zzbwj = ik2;
        rz1.a(ik2.class, ik2);
    }

    private ik2() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(a aVar) {
        this.zzbvy = aVar.a();
        this.zzdl |= 1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(rk2 rk2) {
        rk2.getClass();
        this.zzbwb = rk2;
        this.zzdl |= 8;
    }

    public static ik2 q() {
        return zzbwj;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new ik2();
            case 2:
                return new b(null);
            case 3:
                return rz1.a(zzbwj, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007\f\u0000\b\f\u0001\t\t\u0002\n\t\u0003\u000b\u001b\f\t\u0004\r\t\u0005\u000e\t\u0006\u000f\t\u0007\u0010\t\b\u0011\u001b", new Object[]{"zzdl", "zzbvy", a.b(), "zzbvz", wl2.b(), "zzbwa", "zzbwb", "zzbwc", pk2.class, "zzbwd", "zzbwe", "zzbwf", "zzbwg", "zzbwh", "zzbwi", il2.class});
            case 4:
                return zzbwj;
            case 5:
                l12<ik2> l12 = zzea;
                if (l12 == null) {
                    synchronized (ik2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzbwj);
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

    public final rk2 p() {
        rk2 rk2 = this.zzbwb;
        return rk2 == null ? rk2.p() : rk2;
    }
}
