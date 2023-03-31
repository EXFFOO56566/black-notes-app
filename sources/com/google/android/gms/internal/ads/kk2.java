package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class kk2 extends rz1<kk2, a> implements e12 {
    private static final kk2 zzcdv;
    private static volatile l12<kk2> zzea;
    private int zzbzu = 1000;
    private int zzccv;
    private int zzccw;
    private kl2 zzcdf;
    private int zzcdr;
    private long zzcdu;
    private int zzdl;

    public static final class a extends rz1.a<kk2, a> implements e12 {
        private a() {
            super(kk2.zzcdv);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }
    }

    static {
        kk2 kk2 = new kk2();
        zzcdv = kk2;
        rz1.a(kk2.class, kk2);
    }

    private kk2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new kk2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzcdv, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0003\u0005", new Object[]{"zzdl", "zzbzu", wl2.b(), "zzcdf", "zzccv", "zzccw", "zzcdr", "zzcdu"});
            case 4:
                return zzcdv;
            case 5:
                l12<kk2> l12 = zzea;
                if (l12 == null) {
                    synchronized (kk2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzcdv);
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
