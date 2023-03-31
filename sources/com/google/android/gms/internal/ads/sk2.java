package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class sk2 extends rz1<sk2, a> implements e12 {
    private static final sk2 zzbye;
    private static volatile l12<sk2> zzea;
    private int zzbxy;
    private gl2 zzbxz;
    private gl2 zzbya;
    private gl2 zzbyb;
    private yz1<gl2> zzbyc = rz1.o();
    private int zzbyd;
    private int zzdl;

    public static final class a extends rz1.a<sk2, a> implements e12 {
        private a() {
            super(sk2.zzbye);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }
    }

    static {
        sk2 sk2 = new sk2();
        zzbye = sk2;
        rz1.a(sk2.class, sk2);
    }

    private sk2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new sk2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzbye, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\u001b\u0006\u0004\u0004", new Object[]{"zzdl", "zzbxy", "zzbxz", "zzbya", "zzbyb", "zzbyc", gl2.class, "zzbyd"});
            case 4:
                return zzbye;
            case 5:
                l12<sk2> l12 = zzea;
                if (l12 == null) {
                    synchronized (sk2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzbye);
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
