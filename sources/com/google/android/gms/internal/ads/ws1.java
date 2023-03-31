package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class ws1 extends rz1<ws1, a> implements e12 {
    private static volatile l12<ws1> zzea;
    private static final ws1 zzhly;
    private int zzhlm;
    private zs1 zzhlw;

    public static final class a extends rz1.a<ws1, a> implements e12 {
        private a() {
            super(ws1.zzhly);
        }

        /* synthetic */ a(xs1 xs1) {
            this();
        }
    }

    static {
        ws1 ws1 = new ws1();
        zzhly = ws1;
        rz1.a(ws1.class, ws1);
    }

    private ws1() {
    }

    public static ws1 a(dy1 dy1, dz1 dz1) {
        return (ws1) rz1.a(zzhly, dy1, dz1);
    }

    public static ws1 r() {
        return zzhly;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (xs1.f5492a[i - 1]) {
            case 1:
                return new ws1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhly, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzhlw", "zzhlm"});
            case 4:
                return zzhly;
            case 5:
                l12<ws1> l12 = zzea;
                if (l12 == null) {
                    synchronized (ws1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhly);
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
        return this.zzhlm;
    }

    public final zs1 q() {
        zs1 zs1 = this.zzhlw;
        return zs1 == null ? zs1.q() : zs1;
    }
}
