package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class t20 extends rz1<t20, a> implements e12 {
    private static volatile l12<t20> zzea;
    private static final t20 zzeo;
    private int zzdl;
    private int zzen = 2;

    public static final class a extends rz1.a<t20, a> implements e12 {
        private a() {
            super(t20.zzeo);
        }

        /* synthetic */ a(w40 w40) {
            this();
        }
    }

    static {
        t20 t20 = new t20();
        zzeo = t20;
        rz1.a(t20.class, t20);
    }

    private t20() {
    }

    public static t20 q() {
        return zzeo;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (w40.f5208a[i - 1]) {
            case 1:
                return new t20();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzeo, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b\f\u0000", new Object[]{"zzdl", "zzen", x50.b()});
            case 4:
                return zzeo;
            case 5:
                l12<t20> l12 = zzea;
                if (l12 == null) {
                    synchronized (t20.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzeo);
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

    public final x50 p() {
        x50 a2 = x50.a(this.zzen);
        return a2 == null ? x50.ENUM_SIGNAL_SOURCE_ADSHIELD : a2;
    }
}
