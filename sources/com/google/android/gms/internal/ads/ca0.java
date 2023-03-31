package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class ca0 extends rz1<ca0, a> implements e12 {
    private static volatile l12<ca0> zzea;
    private static final ca0 zzku;
    private int zzdl;
    private long zzkp;
    private int zzkq;
    private boolean zzkr;
    private xz1 zzks = rz1.m();
    private long zzkt;

    public static final class a extends rz1.a<ca0, a> implements e12 {
        private a() {
            super(ca0.zzku);
        }

        /* synthetic */ a(a90 a90) {
            this();
        }
    }

    static {
        ca0 ca0 = new ca0();
        zzku = ca0;
        rz1.a(ca0.class, ca0);
    }

    private ca0() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (a90.f1723a[i - 1]) {
            case 1:
                return new ca0();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzku, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u0004\u0001\u0003\u0007\u0002\u0004\u0016\u0005\u0003\u0003", new Object[]{"zzdl", "zzkp", "zzkq", "zzkr", "zzks", "zzkt"});
            case 4:
                return zzku;
            case 5:
                l12<ca0> l12 = zzea;
                if (l12 == null) {
                    synchronized (ca0.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzku);
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
