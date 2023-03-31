package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;

public final class rk2 extends rz1<rk2, a> implements e12 {
    private static final rk2 zzbxx;
    private static volatile l12<rk2> zzea;
    private String zzbxs = BuildConfig.FLAVOR;
    private yz1<pk2> zzbxt = rz1.o();
    private int zzbxu = 1000;
    private int zzbxv = 1000;
    private int zzbxw = 1000;
    private int zzdl;

    public static final class a extends rz1.a<rk2, a> implements e12 {
        private a() {
            super(rk2.zzbxx);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }

        public final a a(String str) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((rk2) this.f4576c).a((rk2) str);
            return this;
        }
    }

    static {
        rk2 rk2 = new rk2();
        zzbxx = rk2;
        rz1.a(rk2.class, rk2);
    }

    private rk2() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        str.getClass();
        this.zzdl |= 1;
        this.zzbxs = str;
    }

    public static rk2 p() {
        return zzbxx;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new rk2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzbxx, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b\u0003\f\u0001\u0004\f\u0002\u0005\f\u0003", new Object[]{"zzdl", "zzbxs", "zzbxt", pk2.class, "zzbxu", wl2.b(), "zzbxv", wl2.b(), "zzbxw", wl2.b()});
            case 4:
                return zzbxx;
            case 5:
                l12<rk2> l12 = zzea;
                if (l12 == null) {
                    synchronized (rk2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzbxx);
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
