package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class wt1 extends rz1<wt1, a> implements e12 {
    private static volatile l12<wt1> zzea;
    private static final wt1 zzhmw;
    private bu1 zzhmt;
    private st1 zzhmu;
    private int zzhmv;

    public static final class a extends rz1.a<wt1, a> implements e12 {
        private a() {
            super(wt1.zzhmw);
        }

        /* synthetic */ a(vt1 vt1) {
            this();
        }
    }

    static {
        wt1 wt1 = new wt1();
        zzhmw = wt1;
        rz1.a(wt1.class, wt1);
    }

    private wt1() {
    }

    public static wt1 s() {
        return zzhmw;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (vt1.f5160a[i - 1]) {
            case 1:
                return new wt1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhmw, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzhmt", "zzhmu", "zzhmv"});
            case 4:
                return zzhmw;
            case 5:
                l12<wt1> l12 = zzea;
                if (l12 == null) {
                    synchronized (wt1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhmw);
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

    public final bu1 p() {
        bu1 bu1 = this.zzhmt;
        return bu1 == null ? bu1.s() : bu1;
    }

    public final st1 q() {
        st1 st1 = this.zzhmu;
        return st1 == null ? st1.q() : st1;
    }

    public final qt1 r() {
        qt1 a2 = qt1.a(this.zzhmv);
        return a2 == null ? qt1.UNRECOGNIZED : a2;
    }
}
