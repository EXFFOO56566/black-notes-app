package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class nt1 extends rz1<nt1, a> implements e12 {
    private static volatile l12<nt1> zzea;
    private static final nt1 zzhmi;

    public static final class a extends rz1.a<nt1, a> implements e12 {
        private a() {
            super(nt1.zzhmi);
        }

        /* synthetic */ a(ot1 ot1) {
            this();
        }
    }

    static {
        nt1 nt1 = new nt1();
        zzhmi = nt1;
        rz1.a(nt1.class, nt1);
    }

    private nt1() {
    }

    public static nt1 a(dy1 dy1, dz1 dz1) {
        return (nt1) rz1.a(zzhmi, dy1, dz1);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (ot1.f4043a[i - 1]) {
            case 1:
                return new nt1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhmi, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzhmi;
            case 5:
                l12<nt1> l12 = zzea;
                if (l12 == null) {
                    synchronized (nt1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhmi);
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
