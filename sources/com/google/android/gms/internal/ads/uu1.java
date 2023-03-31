package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;

public final class uu1 extends rz1<uu1, a> implements e12 {
    private static volatile l12<uu1> zzea;
    private static final uu1 zzhor;
    private String zzhnz = BuildConfig.FLAVOR;
    private dy1 zzhoa = dy1.f2334c;
    private int zzhoq;

    public static final class a extends rz1.a<uu1, a> implements e12 {
        private a() {
            super(uu1.zzhor);
        }

        /* synthetic */ a(tu1 tu1) {
            this();
        }
    }

    static {
        uu1 uu1 = new uu1();
        zzhor = uu1;
        rz1.a(uu1.class, uu1);
    }

    private uu1() {
    }

    public static uu1 r() {
        return zzhor;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (tu1.f4860a[i - 1]) {
            case 1:
                return new uu1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhor, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzhnz", "zzhoa", "zzhoq"});
            case 4:
                return zzhor;
            case 5:
                l12<uu1> l12 = zzea;
                if (l12 == null) {
                    synchronized (uu1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhor);
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

    public final dy1 q() {
        return this.zzhoa;
    }
}
