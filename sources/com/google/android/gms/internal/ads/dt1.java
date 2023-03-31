package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class dt1 extends rz1<dt1, a> implements e12 {
    private static volatile l12<dt1> zzea;
    private static final dt1 zzhmd;
    private int zzhlm;
    private et1 zzhmb;

    public static final class a extends rz1.a<dt1, a> implements e12 {
        private a() {
            super(dt1.zzhmd);
        }

        /* synthetic */ a(ct1 ct1) {
            this();
        }
    }

    static {
        dt1 dt1 = new dt1();
        zzhmd = dt1;
        rz1.a(dt1.class, dt1);
    }

    private dt1() {
    }

    public static dt1 a(dy1 dy1, dz1 dz1) {
        return (dt1) rz1.a(zzhmd, dy1, dz1);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (ct1.f2165a[i - 1]) {
            case 1:
                return new dt1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhmd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzhmb", "zzhlm"});
            case 4:
                return zzhmd;
            case 5:
                l12<dt1> l12 = zzea;
                if (l12 == null) {
                    synchronized (dt1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhmd);
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

    public final et1 q() {
        et1 et1 = this.zzhmb;
        return et1 == null ? et1.q() : et1;
    }
}
