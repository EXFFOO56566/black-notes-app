package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;

public final class fa0 extends rz1<fa0, a> implements e12 {
    private static volatile l12<fa0> zzea;
    private static final fa0 zzlt;
    private int zzdl;
    private String zzfa = BuildConfig.FLAVOR;

    public static final class a extends rz1.a<fa0, a> implements e12 {
        private a() {
            super(fa0.zzlt);
        }

        /* synthetic */ a(a90 a90) {
            this();
        }
    }

    static {
        fa0 fa0 = new fa0();
        zzlt = fa0;
        rz1.a(fa0.class, fa0);
    }

    private fa0() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (a90.f1723a[i - 1]) {
            case 1:
                return new fa0();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzlt, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"zzdl", "zzfa"});
            case 4:
                return zzlt;
            case 5:
                l12<fa0> l12 = zzea;
                if (l12 == null) {
                    synchronized (fa0.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzlt);
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
