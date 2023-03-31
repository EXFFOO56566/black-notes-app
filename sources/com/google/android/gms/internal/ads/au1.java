package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class au1 extends rz1<au1, a> implements e12 {
    private static volatile l12<au1> zzea;
    private static final au1 zzhnb;
    private int zzhlh;
    private wt1 zzhmr;
    private dy1 zzhmz;
    private dy1 zzhna;

    public static final class a extends rz1.a<au1, a> implements e12 {
        private a() {
            super(au1.zzhnb);
        }

        /* synthetic */ a(zt1 zt1) {
            this();
        }

        public final a a(int i) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((au1) this.f4576c).b((au1) 0);
            return this;
        }

        public final a a(dy1 dy1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((au1) this.f4576c).b((au1) dy1);
            return this;
        }

        public final a a(wt1 wt1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((au1) this.f4576c).a((au1) wt1);
            return this;
        }

        public final a b(dy1 dy1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((au1) this.f4576c).a((au1) dy1);
            return this;
        }
    }

    static {
        au1 au1 = new au1();
        zzhnb = au1;
        rz1.a(au1.class, au1);
    }

    private au1() {
        dy1 dy1 = dy1.f2334c;
        this.zzhmz = dy1;
        this.zzhna = dy1;
    }

    public static au1 a(dy1 dy1, dz1 dz1) {
        return (au1) rz1.a(zzhnb, dy1, dz1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(dy1 dy1) {
        dy1.getClass();
        this.zzhna = dy1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(wt1 wt1) {
        wt1.getClass();
        this.zzhmr = wt1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhlh = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(dy1 dy1) {
        dy1.getClass();
        this.zzhmz = dy1;
    }

    public static a t() {
        return (a) zzhnb.j();
    }

    public static au1 u() {
        return zzhnb;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (zt1.f5812a[i - 1]) {
            case 1:
                return new au1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhnb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzhlh", "zzhmr", "zzhmz", "zzhna"});
            case 4:
                return zzhnb;
            case 5:
                l12<au1> l12 = zzea;
                if (l12 == null) {
                    synchronized (au1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhnb);
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

    public final wt1 q() {
        wt1 wt1 = this.zzhmr;
        return wt1 == null ? wt1.s() : wt1;
    }

    public final dy1 r() {
        return this.zzhmz;
    }

    public final dy1 s() {
        return this.zzhna;
    }
}
