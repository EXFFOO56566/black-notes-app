package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class el2 extends rz1<el2, a> implements e12 {
    private static final el2 zzccf;
    private static volatile l12<el2> zzea;
    private int zzccd;
    private int zzcce;
    private int zzdl;

    public static final class a extends rz1.a<el2, a> implements e12 {
        private a() {
            super(el2.zzccf);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }
    }

    static {
        el2 el2 = new el2();
        zzccf = el2;
        rz1.a(el2.class, el2);
    }

    private el2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new el2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzccf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzdl", "zzccd", "zzcce"});
            case 4:
                return zzccf;
            case 5:
                l12<el2> l12 = zzea;
                if (l12 == null) {
                    synchronized (el2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzccf);
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
