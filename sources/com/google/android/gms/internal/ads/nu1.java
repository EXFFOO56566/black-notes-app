package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class nu1 extends rz1<nu1, a> implements e12 {
    private static volatile l12<nu1> zzea;
    private static final nu1 zzhny;
    private int zzhlo;
    private int zzhnx;

    public static final class a extends rz1.a<nu1, a> implements e12 {
        private a() {
            super(nu1.zzhny);
        }

        /* synthetic */ a(mu1 mu1) {
            this();
        }
    }

    static {
        nu1 nu1 = new nu1();
        zzhny = nu1;
        rz1.a(nu1.class, nu1);
    }

    private nu1() {
    }

    public static nu1 r() {
        return zzhny;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (mu1.f3758a[i - 1]) {
            case 1:
                return new nu1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhny, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzhnx", "zzhlo"});
            case 4:
                return zzhny;
            case 5:
                l12<nu1> l12 = zzea;
                if (l12 == null) {
                    synchronized (nu1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhny);
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
        return this.zzhlo;
    }

    public final gu1 q() {
        gu1 a2 = gu1.a(this.zzhnx);
        return a2 == null ? gu1.UNRECOGNIZED : a2;
    }
}
