package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class pk2 extends rz1<pk2, b> implements e12 {
    private static final pk2 zzbxn;
    private static volatile l12<pk2> zzea;
    private int zzbxl;
    private el2 zzbxm;
    private int zzdl;

    public enum a implements tz1 {
        AD_FORMAT_TYPE_UNSPECIFIED(0),
        BANNER(1),
        INTERSTITIAL(2),
        NATIVE_EXPRESS(3),
        NATIVE_CONTENT(4),
        NATIVE_APP_INSTALL(5),
        NATIVE_CUSTOM_TEMPLATE(6),
        DFP_BANNER(7),
        DFP_INTERSTITIAL(8),
        REWARD_BASED_VIDEO_AD(9),
        BANNER_SEARCH_ADS(10);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f4198b;

        static {
            new sl2();
        }

        private a(int i) {
            this.f4198b = i;
        }

        public static a a(int i) {
            switch (i) {
                case 0:
                    return AD_FORMAT_TYPE_UNSPECIFIED;
                case 1:
                    return BANNER;
                case 2:
                    return INTERSTITIAL;
                case 3:
                    return NATIVE_EXPRESS;
                case 4:
                    return NATIVE_CONTENT;
                case 5:
                    return NATIVE_APP_INSTALL;
                case 6:
                    return NATIVE_CUSTOM_TEMPLATE;
                case 7:
                    return DFP_BANNER;
                case 8:
                    return DFP_INTERSTITIAL;
                case 9:
                    return REWARD_BASED_VIDEO_AD;
                case 10:
                    return BANNER_SEARCH_ADS;
                default:
                    return null;
            }
        }

        public static vz1 b() {
            return rl2.f4516a;
        }

        @Override // com.google.android.gms.internal.ads.tz1
        public final int a() {
            return this.f4198b;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4198b + " name=" + name() + '>';
        }
    }

    public static final class b extends rz1.a<pk2, b> implements e12 {
        private b() {
            super(pk2.zzbxn);
        }

        /* synthetic */ b(hk2 hk2) {
            this();
        }
    }

    static {
        pk2 pk2 = new pk2();
        zzbxn = pk2;
        rz1.a(pk2.class, pk2);
    }

    private pk2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new pk2();
            case 2:
                return new b(null);
            case 3:
                return rz1.a(zzbxn, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"zzdl", "zzbxl", a.b(), "zzbxm"});
            case 4:
                return zzbxn;
            case 5:
                l12<pk2> l12 = zzea;
                if (l12 == null) {
                    synchronized (pk2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzbxn);
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
