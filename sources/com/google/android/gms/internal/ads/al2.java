package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class al2 extends rz1<al2, a> implements e12 {
    private static final al2 zzcam;
    private static volatile l12<al2> zzea;
    private int zzcak;
    private gl2 zzcal;
    private int zzdl;

    public static final class a extends rz1.a<al2, a> implements e12 {
        private a() {
            super(al2.zzcam);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }
    }

    static {
        al2 al2 = new al2();
        zzcam = al2;
        rz1.a(al2.class, al2);
    }

    private al2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new al2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzcam, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"zzdl", "zzcak", wl2.b(), "zzcal"});
            case 4:
                return zzcam;
            case 5:
                l12<al2> l12 = zzea;
                if (l12 == null) {
                    synchronized (al2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzcam);
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
