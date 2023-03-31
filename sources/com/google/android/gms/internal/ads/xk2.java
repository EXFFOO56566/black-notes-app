package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class xk2 extends rz1<xk2, a> implements e12 {
    private static final xk2 zzbzv;
    private static volatile l12<xk2> zzea;
    private xz1 zzbzr = rz1.m();
    private int zzbzu;
    private int zzdl;

    public static final class a extends rz1.a<xk2, a> implements e12 {
        private a() {
            super(xk2.zzbzv);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }
    }

    static {
        xk2 xk2 = new xk2();
        zzbzv = xk2;
        rz1.a(xk2.class, xk2);
    }

    private xk2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new xk2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzbzv, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u0016", new Object[]{"zzdl", "zzbzu", wl2.b(), "zzbzr"});
            case 4:
                return zzbzv;
            case 5:
                l12<xk2> l12 = zzea;
                if (l12 == null) {
                    synchronized (xk2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzbzv);
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
