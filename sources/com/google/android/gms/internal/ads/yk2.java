package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class yk2 extends rz1<yk2, a> implements e12 {
    private static final yk2 zzbzy;
    private static volatile l12<yk2> zzea;
    private gl2 zzbzs;
    private int zzbzu;
    private wk2 zzbzw;
    private yz1<fl2> zzbzx = rz1.o();
    private int zzdl;

    public static final class a extends rz1.a<yk2, a> implements e12 {
        private a() {
            super(yk2.zzbzy);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }
    }

    static {
        yk2 yk2 = new yk2();
        zzbzy = yk2;
        rz1.a(yk2.class, yk2);
    }

    private yk2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new yk2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzbzy, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b\u0003\f\u0001\u0004\t\u0002", new Object[]{"zzdl", "zzbzw", "zzbzx", fl2.class, "zzbzu", wl2.b(), "zzbzs"});
            case 4:
                return zzbzy;
            case 5:
                l12<yk2> l12 = zzea;
                if (l12 == null) {
                    synchronized (yk2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzbzy);
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
