package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class bu1 extends rz1<bu1, a> implements e12 {
    private static volatile l12<bu1> zzea;
    private static final bu1 zzhnf;
    private int zzhnc;
    private int zzhnd;
    private dy1 zzhne = dy1.f2334c;

    public static final class a extends rz1.a<bu1, a> implements e12 {
        private a() {
            super(bu1.zzhnf);
        }

        /* synthetic */ a(cu1 cu1) {
            this();
        }
    }

    static {
        bu1 bu1 = new bu1();
        zzhnf = bu1;
        rz1.a(bu1.class, bu1);
    }

    private bu1() {
    }

    public static bu1 s() {
        return zzhnf;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (cu1.f2171a[i - 1]) {
            case 1:
                return new bu1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhnf, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzhnc", "zzhnd", "zzhne"});
            case 4:
                return zzhnf;
            case 5:
                l12<bu1> l12 = zzea;
                if (l12 == null) {
                    synchronized (bu1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhnf);
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

    public final eu1 p() {
        eu1 a2 = eu1.a(this.zzhnc);
        return a2 == null ? eu1.UNRECOGNIZED : a2;
    }

    public final gu1 q() {
        gu1 a2 = gu1.a(this.zzhnd);
        return a2 == null ? gu1.UNRECOGNIZED : a2;
    }

    public final dy1 r() {
        return this.zzhne;
    }
}
