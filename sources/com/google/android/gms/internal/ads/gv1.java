package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class gv1 extends rz1<gv1, a> implements e12 {
    private static volatile l12<gv1> zzea;
    private static final gv1 zzhpm;
    private int zzhlh;
    private hv1 zzhpl;

    public static final class a extends rz1.a<gv1, a> implements e12 {
        private a() {
            super(gv1.zzhpm);
        }

        /* synthetic */ a(fv1 fv1) {
            this();
        }

        public final a a(int i) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((gv1) this.f4576c).b(0);
            return this;
        }

        public final a a(hv1 hv1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((gv1) this.f4576c).a((gv1) hv1);
            return this;
        }
    }

    static {
        gv1 gv1 = new gv1();
        zzhpm = gv1;
        rz1.a(gv1.class, gv1);
    }

    private gv1() {
    }

    public static gv1 a(dy1 dy1, dz1 dz1) {
        return (gv1) rz1.a(zzhpm, dy1, dz1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(hv1 hv1) {
        hv1.getClass();
        this.zzhpl = hv1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhlh = i;
    }

    public static a r() {
        return (a) zzhpm.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (fv1.f2663a[i - 1]) {
            case 1:
                return new gv1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhpm, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhlh", "zzhpl"});
            case 4:
                return zzhpm;
            case 5:
                l12<gv1> l12 = zzea;
                if (l12 == null) {
                    synchronized (gv1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhpm);
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

    public final int p() {
        return this.zzhlh;
    }

    public final hv1 q() {
        hv1 hv1 = this.zzhpl;
        return hv1 == null ? hv1.r() : hv1;
    }
}
