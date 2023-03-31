package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class os1 extends rz1<os1, a> implements e12 {
    private static volatile l12<os1> zzea;
    private static final os1 zzhlp;
    private int zzhlo;

    public static final class a extends rz1.a<os1, a> implements e12 {
        private a() {
            super(os1.zzhlp);
        }

        /* synthetic */ a(ps1 ps1) {
            this();
        }
    }

    static {
        os1 os1 = new os1();
        zzhlp = os1;
        rz1.a(os1.class, os1);
    }

    private os1() {
    }

    public static os1 q() {
        return zzhlp;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (ps1.f4227a[i - 1]) {
            case 1:
                return new os1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhlp, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhlo"});
            case 4:
                return zzhlp;
            case 5:
                l12<os1> l12 = zzea;
                if (l12 == null) {
                    synchronized (os1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhlp);
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
        return this.zzhlo;
    }
}
