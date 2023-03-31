package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class ns1 extends rz1<ns1, a> implements e12 {
    private static volatile l12<ns1> zzea;
    private static final ns1 zzhln;
    private os1 zzhlj;
    private int zzhlm;

    public static final class a extends rz1.a<ns1, a> implements e12 {
        private a() {
            super(ns1.zzhln);
        }

        /* synthetic */ a(ms1 ms1) {
            this();
        }
    }

    static {
        ns1 ns1 = new ns1();
        zzhln = ns1;
        rz1.a(ns1.class, ns1);
    }

    private ns1() {
    }

    public static ns1 a(dy1 dy1, dz1 dz1) {
        return (ns1) rz1.a(zzhln, dy1, dz1);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (ms1.f3754a[i - 1]) {
            case 1:
                return new ns1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhln, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhlm", "zzhlj"});
            case 4:
                return zzhln;
            case 5:
                l12<ns1> l12 = zzea;
                if (l12 == null) {
                    synchronized (ns1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhln);
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

    public final os1 q() {
        os1 os1 = this.zzhlj;
        return os1 == null ? os1.q() : os1;
    }
}
