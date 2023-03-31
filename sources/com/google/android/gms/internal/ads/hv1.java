package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;

public final class hv1 extends rz1<hv1, a> implements e12 {
    private static volatile l12<hv1> zzea;
    private static final hv1 zzhpp;
    private String zzhpn = BuildConfig.FLAVOR;
    private uu1 zzhpo;

    public static final class a extends rz1.a<hv1, a> implements e12 {
        private a() {
            super(hv1.zzhpp);
        }

        /* synthetic */ a(iv1 iv1) {
            this();
        }
    }

    static {
        hv1 hv1 = new hv1();
        zzhpp = hv1;
        rz1.a(hv1.class, hv1);
    }

    private hv1() {
    }

    public static hv1 a(dy1 dy1, dz1 dz1) {
        return (hv1) rz1.a(zzhpp, dy1, dz1);
    }

    public static hv1 r() {
        return zzhpp;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (iv1.f3138a[i - 1]) {
            case 1:
                return new hv1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhpp, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzhpn", "zzhpo"});
            case 4:
                return zzhpp;
            case 5:
                l12<hv1> l12 = zzea;
                if (l12 == null) {
                    synchronized (hv1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhpp);
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

    public final String p() {
        return this.zzhpn;
    }

    public final uu1 q() {
        uu1 uu1 = this.zzhpo;
        return uu1 == null ? uu1.r() : uu1;
    }
}
