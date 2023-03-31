package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;
import java.util.List;

@Deprecated
public final class nv1 extends rz1<nv1, a> implements e12 {
    private static volatile l12<nv1> zzea;
    private static final nv1 zzhpz;
    private String zzhpx = BuildConfig.FLAVOR;
    private yz1<vu1> zzhpy = rz1.o();

    public static final class a extends rz1.a<nv1, a> implements e12 {
        private a() {
            super(nv1.zzhpz);
        }

        /* synthetic */ a(mv1 mv1) {
            this();
        }
    }

    static {
        nv1 nv1 = new nv1();
        zzhpz = nv1;
        rz1.a(nv1.class, nv1);
    }

    private nv1() {
    }

    public static nv1 q() {
        return zzhpz;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (mv1.f3759a[i - 1]) {
            case 1:
                return new nv1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhpz, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzhpx", "zzhpy", vu1.class});
            case 4:
                return zzhpz;
            case 5:
                l12<nv1> l12 = zzea;
                if (l12 == null) {
                    synchronized (nv1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhpz);
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

    public final List<vu1> p() {
        return this.zzhpy;
    }
}
