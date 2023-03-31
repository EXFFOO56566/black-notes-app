package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class ll2 extends rz1<ll2, a> implements e12 {
    private static final ll2 zzcdq;
    private static volatile l12<ll2> zzea;
    private int zzbzu = 1000;
    private kl2 zzcdf;
    private gl2 zzcdg;
    private hl2 zzcdp;
    private int zzdl;

    public static final class a extends rz1.a<ll2, a> implements e12 {
        private a() {
            super(ll2.zzcdq);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }
    }

    static {
        ll2 ll2 = new ll2();
        zzcdq = ll2;
        rz1.a(ll2.class, ll2);
    }

    private ll2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new ll2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzcdq, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\t\u0002\u0004\t\u0003", new Object[]{"zzdl", "zzcdp", "zzbzu", wl2.b(), "zzcdf", "zzcdg"});
            case 4:
                return zzcdq;
            case 5:
                l12<ll2> l12 = zzea;
                if (l12 == null) {
                    synchronized (ll2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzcdq);
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
