package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class et1 extends rz1<et1, a> implements e12 {
    private static volatile l12<et1> zzea;
    private static final et1 zzhme;
    private int zzhlz;

    public static final class a extends rz1.a<et1, a> implements e12 {
        private a() {
            super(et1.zzhme);
        }

        /* synthetic */ a(ft1 ft1) {
            this();
        }
    }

    static {
        et1 et1 = new et1();
        zzhme = et1;
        rz1.a(et1.class, et1);
    }

    private et1() {
    }

    public static et1 q() {
        return zzhme;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (ft1.f2658a[i - 1]) {
            case 1:
                return new et1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhme, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhlz"});
            case 4:
                return zzhme;
            case 5:
                l12<et1> l12 = zzea;
                if (l12 == null) {
                    synchronized (et1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhme);
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
        return this.zzhlz;
    }
}
