package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;

@Deprecated
public final class vu1 extends rz1<vu1, a> implements e12 {
    private static volatile l12<vu1> zzea;
    private static final vu1 zzhow;
    private String zzhnz = BuildConfig.FLAVOR;
    private String zzhos = BuildConfig.FLAVOR;
    private int zzhot;
    private boolean zzhou;
    private String zzhov = BuildConfig.FLAVOR;

    public static final class a extends rz1.a<vu1, a> implements e12 {
        private a() {
            super(vu1.zzhow);
        }

        /* synthetic */ a(wu1 wu1) {
            this();
        }
    }

    static {
        vu1 vu1 = new vu1();
        zzhow = vu1;
        rz1.a(vu1.class, vu1);
    }

    private vu1() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (wu1.f5319a[i - 1]) {
            case 1:
                return new vu1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhow, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzhos", "zzhnz", "zzhot", "zzhou", "zzhov"});
            case 4:
                return zzhow;
            case 5:
                l12<vu1> l12 = zzea;
                if (l12 == null) {
                    synchronized (vu1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhow);
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
        return this.zzhnz;
    }

    public final String q() {
        return this.zzhos;
    }

    public final int r() {
        return this.zzhot;
    }

    public final boolean s() {
        return this.zzhou;
    }

    public final String t() {
        return this.zzhov;
    }
}
