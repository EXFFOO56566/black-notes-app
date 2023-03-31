package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class ku1 extends rz1<ku1, a> implements e12 {
    private static volatile l12<ku1> zzea;
    private static final ku1 zzhnw;
    private int zzhlh;
    private int zzhlm;
    private nu1 zzhnu;

    public static final class a extends rz1.a<ku1, a> implements e12 {
        private a() {
            super(ku1.zzhnw);
        }

        /* synthetic */ a(lu1 lu1) {
            this();
        }
    }

    static {
        ku1 ku1 = new ku1();
        zzhnw = ku1;
        rz1.a(ku1.class, ku1);
    }

    private ku1() {
    }

    public static ku1 a(dy1 dy1, dz1 dz1) {
        return (ku1) rz1.a(zzhnw, dy1, dz1);
    }

    public static ku1 r() {
        return zzhnw;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (lu1.f3607a[i - 1]) {
            case 1:
                return new ku1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhnw, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzhnu", "zzhlm", "zzhlh"});
            case 4:
                return zzhnw;
            case 5:
                l12<ku1> l12 = zzea;
                if (l12 == null) {
                    synchronized (ku1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhnw);
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

    public final int p() {
        return this.zzhlm;
    }

    public final nu1 q() {
        nu1 nu1 = this.zzhnu;
        return nu1 == null ? nu1.r() : nu1;
    }
}
