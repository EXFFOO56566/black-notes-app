package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;

public final class ea0 extends rz1<ea0, a> implements e12 {
    private static volatile l12<ea0> zzea;
    private static final ea0 zzls;
    private int zzdl;
    private long zzkp;
    private String zzlq = BuildConfig.FLAVOR;
    private dy1 zzlr = dy1.f2334c;

    public static final class a extends rz1.a<ea0, a> implements e12 {
        private a() {
            super(ea0.zzls);
        }

        /* synthetic */ a(a90 a90) {
            this();
        }
    }

    static {
        ea0 ea0 = new ea0();
        zzls = ea0;
        rz1.a(ea0.class, ea0);
    }

    private ea0() {
    }

    public static ea0 r() {
        return zzls;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (a90.f1723a[i - 1]) {
            case 1:
                return new ea0();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzls, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0002\u0000\u0003\b\u0001\u0004\n\u0002", new Object[]{"zzdl", "zzkp", "zzlq", "zzlr"});
            case 4:
                return zzls;
            case 5:
                l12<ea0> l12 = zzea;
                if (l12 == null) {
                    synchronized (ea0.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzls);
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

    public final boolean p() {
        return (this.zzdl & 1) != 0;
    }

    public final long q() {
        return this.zzkp;
    }
}
