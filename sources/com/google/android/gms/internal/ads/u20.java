package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;

public final class u20 extends rz1<u20, a> implements e12 {
    private static volatile l12<u20> zzea;
    private static final u20 zzfb;
    private int zzdl;
    private String zzev = BuildConfig.FLAVOR;
    private String zzew = BuildConfig.FLAVOR;
    private String zzex = BuildConfig.FLAVOR;
    private String zzey = BuildConfig.FLAVOR;
    private String zzez = BuildConfig.FLAVOR;
    private String zzfa = BuildConfig.FLAVOR;

    public static final class a extends rz1.a<u20, a> implements e12 {
        private a() {
            super(u20.zzfb);
        }

        /* synthetic */ a(w40 w40) {
            this();
        }
    }

    static {
        u20 u20 = new u20();
        zzfb = u20;
        rz1.a(u20.class, u20);
    }

    private u20() {
    }

    public static u20 q() {
        return zzfb;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (w40.f5208a[i - 1]) {
            case 1:
                return new u20();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzfb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005", new Object[]{"zzdl", "zzev", "zzew", "zzex", "zzey", "zzez", "zzfa"});
            case 4:
                return zzfb;
            case 5:
                l12<u20> l12 = zzea;
                if (l12 == null) {
                    synchronized (u20.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzfb);
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
        return this.zzev;
    }
}
