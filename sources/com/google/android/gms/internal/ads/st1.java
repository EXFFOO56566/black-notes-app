package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class st1 extends rz1<st1, a> implements e12 {
    private static volatile l12<st1> zzea;
    private static final st1 zzhmq;
    private uu1 zzhmp;

    public static final class a extends rz1.a<st1, a> implements e12 {
        private a() {
            super(st1.zzhmq);
        }

        /* synthetic */ a(rt1 rt1) {
            this();
        }
    }

    static {
        st1 st1 = new st1();
        zzhmq = st1;
        rz1.a(st1.class, st1);
    }

    private st1() {
    }

    public static st1 q() {
        return zzhmq;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (rt1.f4545a[i - 1]) {
            case 1:
                return new st1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhmq, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzhmp"});
            case 4:
                return zzhmq;
            case 5:
                l12<st1> l12 = zzea;
                if (l12 == null) {
                    synchronized (st1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhmq);
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

    public final uu1 p() {
        uu1 uu1 = this.zzhmp;
        return uu1 == null ? uu1.r() : uu1;
    }
}
