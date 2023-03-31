package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;

public final class qk2 extends rz1<qk2, a> implements e12 {
    private static final qk2 zzbxr;
    private static volatile l12<qk2> zzea;
    private String zzbxo = BuildConfig.FLAVOR;
    private yz1<pk2> zzbxp = rz1.o();
    private int zzbxq;
    private int zzdl;

    public static final class a extends rz1.a<qk2, a> implements e12 {
        private a() {
            super(qk2.zzbxr);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }
    }

    static {
        qk2 qk2 = new qk2();
        zzbxr = qk2;
        rz1.a(qk2.class, qk2);
    }

    private qk2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new qk2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzbxr, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b\u0003\f\u0001", new Object[]{"zzdl", "zzbxo", "zzbxp", pk2.class, "zzbxq", wl2.b()});
            case 4:
                return zzbxr;
            case 5:
                l12<qk2> l12 = zzea;
                if (l12 == null) {
                    synchronized (qk2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzbxr);
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
