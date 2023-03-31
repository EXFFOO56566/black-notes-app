package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class cl2 extends rz1<cl2, a> implements e12 {
    private static final cl2 zzcbz;
    private static volatile l12<cl2> zzea;
    private int zzcbo = 1000;
    private int zzcbp = 1000;
    private int zzcbq;
    private int zzcbr;
    private int zzcbs;
    private int zzcbt;
    private int zzcbu;
    private int zzcbv;
    private int zzcbw;
    private int zzcbx;
    private dl2 zzcby;
    private int zzdl;

    public static final class a extends rz1.a<cl2, a> implements e12 {
        private a() {
            super(cl2.zzcbz);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }
    }

    static {
        cl2 cl2 = new cl2();
        zzcbz = cl2;
        rz1.a(cl2.class, cl2);
    }

    private cl2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new cl2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzcbz, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007\t\u0004\b\n\u0004\t\u000b\t\n", new Object[]{"zzdl", "zzcbo", wl2.b(), "zzcbp", wl2.b(), "zzcbq", "zzcbr", "zzcbs", "zzcbt", "zzcbu", "zzcbv", "zzcbw", "zzcbx", "zzcby"});
            case 4:
                return zzcbz;
            case 5:
                l12<cl2> l12 = zzea;
                if (l12 == null) {
                    synchronized (cl2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzcbz);
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
