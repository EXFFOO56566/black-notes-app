package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;

public final class dv1 extends rz1<dv1, a> implements e12 {
    private static volatile l12<dv1> zzea;
    private static final dv1 zzhpk;
    private String zzhpj = BuildConfig.FLAVOR;

    public static final class a extends rz1.a<dv1, a> implements e12 {
        private a() {
            super(dv1.zzhpk);
        }

        /* synthetic */ a(ev1 ev1) {
            this();
        }
    }

    static {
        dv1 dv1 = new dv1();
        zzhpk = dv1;
        rz1.a(dv1.class, dv1);
    }

    private dv1() {
    }

    public static dv1 a(dy1 dy1, dz1 dz1) {
        return (dv1) rz1.a(zzhpk, dy1, dz1);
    }

    public static dv1 q() {
        return zzhpk;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (ev1.f2486a[i - 1]) {
            case 1:
                return new dv1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhpk, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzhpj"});
            case 4:
                return zzhpk;
            case 5:
                l12<dv1> l12 = zzea;
                if (l12 == null) {
                    synchronized (dv1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhpk);
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
        return this.zzhpj;
    }
}
