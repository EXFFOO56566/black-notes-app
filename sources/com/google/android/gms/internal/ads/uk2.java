package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;

public final class uk2 extends rz1<uk2, b> implements e12 {
    private static final uk2 zzbys;
    private static volatile l12<uk2> zzea;
    private int zzbyo;
    private hl2 zzbyp;
    private String zzbyq = BuildConfig.FLAVOR;
    private String zzbyr = BuildConfig.FLAVOR;
    private int zzdl;

    public enum a implements tz1 {
        PLATFORM_UNSPECIFIED(0),
        IOS(1),
        ANDROID(2);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f4971b;

        static {
            new ul2();
        }

        private a(int i) {
            this.f4971b = i;
        }

        public static a a(int i) {
            if (i == 0) {
                return PLATFORM_UNSPECIFIED;
            }
            if (i == 1) {
                return IOS;
            }
            if (i != 2) {
                return null;
            }
            return ANDROID;
        }

        public static vz1 b() {
            return tl2.f4831a;
        }

        @Override // com.google.android.gms.internal.ads.tz1
        public final int a() {
            return this.f4971b;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4971b + " name=" + name() + '>';
        }
    }

    public static final class b extends rz1.a<uk2, b> implements e12 {
        private b() {
            super(uk2.zzbys);
        }

        /* synthetic */ b(hk2 hk2) {
            this();
        }
    }

    static {
        uk2 uk2 = new uk2();
        zzbys = uk2;
        rz1.a(uk2.class, uk2);
    }

    private uk2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new uk2();
            case 2:
                return new b(null);
            case 3:
                return rz1.a(zzbys, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005\f\u0000\u0006\t\u0001\u0007\b\u0002\b\b\u0003", new Object[]{"zzdl", "zzbyo", a.b(), "zzbyp", "zzbyq", "zzbyr"});
            case 4:
                return zzbys;
            case 5:
                l12<uk2> l12 = zzea;
                if (l12 == null) {
                    synchronized (uk2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzbys);
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
