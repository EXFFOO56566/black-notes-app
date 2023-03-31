package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class jk2 extends rz1<jk2, a> implements e12 {
    private static final jk2 zzcdt;
    private static volatile l12<jk2> zzea;
    private int zzbzu = 1000;
    private kl2 zzcdf;
    private gl2 zzcdg;
    private int zzdl;

    public static final class a extends rz1.a<jk2, a> implements e12 {
        private a() {
            super(jk2.zzcdt);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }
    }

    static {
        jk2 jk2 = new jk2();
        zzcdt = jk2;
        rz1.a(jk2.class, jk2);
    }

    private jk2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new jk2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzcdt, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzdl", "zzbzu", wl2.b(), "zzcdf", "zzcdg"});
            case 4:
                return zzcdt;
            case 5:
                l12<jk2> l12 = zzea;
                if (l12 == null) {
                    synchronized (jk2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzcdt);
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
