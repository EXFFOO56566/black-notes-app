package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;

public final class wk2 extends rz1<wk2, a> implements e12 {
    private static final wk2 zzbzt;
    private static volatile l12<wk2> zzea;
    private String zzbzp = BuildConfig.FLAVOR;
    private int zzbzq;
    private xz1 zzbzr = rz1.m();
    private gl2 zzbzs;
    private int zzdl;

    public static final class a extends rz1.a<wk2, a> implements e12 {
        private a() {
            super(wk2.zzbzt);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }
    }

    static {
        wk2 wk2 = new wk2();
        zzbzt = wk2;
        rz1.a(wk2.class, wk2);
    }

    private wk2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new wk2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzbzt, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\b\u0000\u0002\f\u0001\u0003\u0016\u0004\t\u0002", new Object[]{"zzdl", "zzbzp", "zzbzq", wl2.b(), "zzbzr", "zzbzs"});
            case 4:
                return zzbzt;
            case 5:
                l12<wk2> l12 = zzea;
                if (l12 == null) {
                    synchronized (wk2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzbzt);
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
