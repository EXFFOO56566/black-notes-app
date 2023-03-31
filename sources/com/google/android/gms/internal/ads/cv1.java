package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class cv1 extends rz1<cv1, a> implements e12 {
    private static volatile l12<cv1> zzea;
    private static final cv1 zzhpi;
    private int zzhlh;
    private dv1 zzhph;

    public static final class a extends rz1.a<cv1, a> implements e12 {
        private a() {
            super(cv1.zzhpi);
        }

        /* synthetic */ a(bv1 bv1) {
            this();
        }

        public final a a(int i) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((cv1) this.f4576c).b(0);
            return this;
        }

        public final a a(dv1 dv1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((cv1) this.f4576c).a((cv1) dv1);
            return this;
        }
    }

    static {
        cv1 cv1 = new cv1();
        zzhpi = cv1;
        rz1.a(cv1.class, cv1);
    }

    private cv1() {
    }

    public static cv1 a(dy1 dy1, dz1 dz1) {
        return (cv1) rz1.a(zzhpi, dy1, dz1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(dv1 dv1) {
        dv1.getClass();
        this.zzhph = dv1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhlh = i;
    }

    public static a r() {
        return (a) zzhpi.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (bv1.f2018a[i - 1]) {
            case 1:
                return new cv1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhpi, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhlh", "zzhph"});
            case 4:
                return zzhpi;
            case 5:
                l12<cv1> l12 = zzea;
                if (l12 == null) {
                    synchronized (cv1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhpi);
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

    public final dv1 q() {
        dv1 dv1 = this.zzhph;
        return dv1 == null ? dv1.q() : dv1;
    }
}
