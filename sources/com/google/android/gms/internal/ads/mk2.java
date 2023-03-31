package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class mk2 extends rz1<mk2, a> implements e12 {
    private static final mk2 zzcdx;
    private static volatile l12<mk2> zzea;
    private int zzbzu = 1000;
    private kl2 zzcdf;
    private int zzdl;

    public static final class a extends rz1.a<mk2, a> implements e12 {
        private a() {
            super(mk2.zzcdx);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }
    }

    static {
        mk2 mk2 = new mk2();
        zzcdx = mk2;
        rz1.a(mk2.class, mk2);
    }

    private mk2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new mk2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzcdx, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"zzdl", "zzbzu", wl2.b(), "zzcdf"});
            case 4:
                return zzcdx;
            case 5:
                l12<mk2> l12 = zzea;
                if (l12 == null) {
                    synchronized (mk2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzcdx);
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
