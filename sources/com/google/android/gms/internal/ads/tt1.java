package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class tt1 extends rz1<tt1, a> implements e12 {
    private static volatile l12<tt1> zzea;
    private static final tt1 zzhms;
    private wt1 zzhmr;

    public static final class a extends rz1.a<tt1, a> implements e12 {
        private a() {
            super(tt1.zzhms);
        }

        /* synthetic */ a(ut1 ut1) {
            this();
        }
    }

    static {
        tt1 tt1 = new tt1();
        zzhms = tt1;
        rz1.a(tt1.class, tt1);
    }

    private tt1() {
    }

    public static tt1 a(dy1 dy1, dz1 dz1) {
        return (tt1) rz1.a(zzhms, dy1, dz1);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (ut1.f5004a[i - 1]) {
            case 1:
                return new tt1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhms, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzhmr"});
            case 4:
                return zzhms;
            case 5:
                l12<tt1> l12 = zzea;
                if (l12 == null) {
                    synchronized (tt1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhms);
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

    public final wt1 p() {
        wt1 wt1 = this.zzhmr;
        return wt1 == null ? wt1.s() : wt1;
    }
}
