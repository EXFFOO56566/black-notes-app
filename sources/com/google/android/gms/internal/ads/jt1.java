package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class jt1 extends rz1<jt1, a> implements e12 {
    private static volatile l12<jt1> zzea;
    private static final jt1 zzhmg;
    private int zzhlh;
    private int zzhlm;

    public static final class a extends rz1.a<jt1, a> implements e12 {
        private a() {
            super(jt1.zzhmg);
        }

        /* synthetic */ a(kt1 kt1) {
            this();
        }
    }

    static {
        jt1 jt1 = new jt1();
        zzhmg = jt1;
        rz1.a(jt1.class, jt1);
    }

    private jt1() {
    }

    public static jt1 a(dy1 dy1, dz1 dz1) {
        return (jt1) rz1.a(zzhmg, dy1, dz1);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (kt1.f3448a[i - 1]) {
            case 1:
                return new jt1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhmg, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzhlm", "zzhlh"});
            case 4:
                return zzhmg;
            case 5:
                l12<jt1> l12 = zzea;
                if (l12 == null) {
                    synchronized (jt1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhmg);
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
}
