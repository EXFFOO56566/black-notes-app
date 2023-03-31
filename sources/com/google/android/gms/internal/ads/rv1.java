package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class rv1 extends rz1<rv1, a> implements e12 {
    private static volatile l12<rv1> zzea;
    private static final rv1 zzhqb;

    public static final class a extends rz1.a<rv1, a> implements e12 {
        private a() {
            super(rv1.zzhqb);
        }

        /* synthetic */ a(qv1 qv1) {
            this();
        }
    }

    static {
        rv1 rv1 = new rv1();
        zzhqb = rv1;
        rz1.a(rv1.class, rv1);
    }

    private rv1() {
    }

    public static rv1 a(dy1 dy1, dz1 dz1) {
        return (rv1) rz1.a(zzhqb, dy1, dz1);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (qv1.f4399a[i - 1]) {
            case 1:
                return new rv1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhqb, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzhqb;
            case 5:
                l12<rv1> l12 = zzea;
                if (l12 == null) {
                    synchronized (rv1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhqb);
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
