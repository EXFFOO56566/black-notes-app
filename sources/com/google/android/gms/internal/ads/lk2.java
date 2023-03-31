package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class lk2 extends rz1<lk2, a> implements e12 {
    private static final lk2 zzcdw;
    private static volatile l12<lk2> zzea;
    private int zzbzu = 1000;
    private kl2 zzcdf;
    private gl2 zzcdg;
    private int zzdl;

    public static final class a extends rz1.a<lk2, a> implements e12 {
        private a() {
            super(lk2.zzcdw);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }
    }

    static {
        lk2 lk2 = new lk2();
        zzcdw = lk2;
        rz1.a(lk2.class, lk2);
    }

    private lk2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new lk2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzcdw, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzdl", "zzbzu", wl2.b(), "zzcdf", "zzcdg"});
            case 4:
                return zzcdw;
            case 5:
                l12<lk2> l12 = zzea;
                if (l12 == null) {
                    synchronized (lk2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzcdw);
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
