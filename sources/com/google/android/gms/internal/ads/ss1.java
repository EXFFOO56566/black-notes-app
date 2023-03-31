package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class ss1 extends rz1<ss1, a> implements e12 {
    private static volatile l12<ss1> zzea;
    private static final ss1 zzhlv;
    private ws1 zzhlt;
    private ku1 zzhlu;

    public static final class a extends rz1.a<ss1, a> implements e12 {
        private a() {
            super(ss1.zzhlv);
        }

        /* synthetic */ a(ts1 ts1) {
            this();
        }
    }

    static {
        ss1 ss1 = new ss1();
        zzhlv = ss1;
        rz1.a(ss1.class, ss1);
    }

    private ss1() {
    }

    public static ss1 a(dy1 dy1, dz1 dz1) {
        return (ss1) rz1.a(zzhlv, dy1, dz1);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (ts1.f4850a[i - 1]) {
            case 1:
                return new ss1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhlv, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzhlt", "zzhlu"});
            case 4:
                return zzhlv;
            case 5:
                l12<ss1> l12 = zzea;
                if (l12 == null) {
                    synchronized (ss1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhlv);
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

    public final ws1 p() {
        ws1 ws1 = this.zzhlt;
        return ws1 == null ? ws1.r() : ws1;
    }

    public final ku1 q() {
        ku1 ku1 = this.zzhlu;
        return ku1 == null ? ku1.r() : ku1;
    }
}
