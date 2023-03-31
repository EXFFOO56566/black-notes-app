package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class zs1 extends rz1<zs1, a> implements e12 {
    private static volatile l12<zs1> zzea;
    private static final zs1 zzhma;
    private int zzhlz;

    public static final class a extends rz1.a<zs1, a> implements e12 {
        private a() {
            super(zs1.zzhma);
        }

        /* synthetic */ a(ys1 ys1) {
            this();
        }
    }

    static {
        zs1 zs1 = new zs1();
        zzhma = zs1;
        rz1.a(zs1.class, zs1);
    }

    private zs1() {
    }

    public static zs1 q() {
        return zzhma;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (ys1.f5649a[i - 1]) {
            case 1:
                return new zs1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhma, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhlz"});
            case 4:
                return zzhma;
            case 5:
                l12<zs1> l12 = zzea;
                if (l12 == null) {
                    synchronized (zs1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhma);
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
