package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;

public final class fl2 extends rz1<fl2, a> implements e12 {
    private static final fl2 zzccg;
    private static volatile l12<fl2> zzea;
    private String zzbzp = BuildConfig.FLAVOR;
    private int zzbzq;
    private gl2 zzbzs;
    private int zzdl;

    public static final class a extends rz1.a<fl2, a> implements e12 {
        private a() {
            super(fl2.zzccg);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }
    }

    static {
        fl2 fl2 = new fl2();
        zzccg = fl2;
        rz1.a(fl2.class, fl2);
    }

    private fl2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new fl2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzccg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0003\t\u0002", new Object[]{"zzdl", "zzbzp", "zzbzq", wl2.b(), "zzbzs"});
            case 4:
                return zzccg;
            case 5:
                l12<fl2> l12 = zzea;
                if (l12 == null) {
                    synchronized (fl2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzccg);
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
