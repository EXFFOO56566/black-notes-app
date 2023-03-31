package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class vs1 extends rz1<vs1, a> implements e12 {
    private static volatile l12<vs1> zzea;
    private static final vs1 zzhlx;
    private int zzhlh;
    private dy1 zzhli = dy1.f2334c;
    private zs1 zzhlw;

    public static final class a extends rz1.a<vs1, a> implements e12 {
        private a() {
            super(vs1.zzhlx);
        }

        /* synthetic */ a(us1 us1) {
            this();
        }

        public final a a(int i) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((vs1) this.f4576c).b(0);
            return this;
        }

        public final a a(dy1 dy1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((vs1) this.f4576c).a((vs1) dy1);
            return this;
        }

        public final a a(zs1 zs1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((vs1) this.f4576c).a((vs1) zs1);
            return this;
        }
    }

    static {
        vs1 vs1 = new vs1();
        zzhlx = vs1;
        rz1.a(vs1.class, vs1);
    }

    private vs1() {
    }

    public static vs1 a(dy1 dy1, dz1 dz1) {
        return (vs1) rz1.a(zzhlx, dy1, dz1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(dy1 dy1) {
        dy1.getClass();
        this.zzhli = dy1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(zs1 zs1) {
        zs1.getClass();
        this.zzhlw = zs1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhlh = i;
    }

    public static a s() {
        return (a) zzhlx.j();
    }

    public static vs1 t() {
        return zzhlx;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (us1.f5000a[i - 1]) {
            case 1:
                return new vs1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhlx, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhlh", "zzhlw", "zzhli"});
            case 4:
                return zzhlx;
            case 5:
                l12<vs1> l12 = zzea;
                if (l12 == null) {
                    synchronized (vs1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhlx);
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

    public final dy1 q() {
        return this.zzhli;
    }

    public final zs1 r() {
        zs1 zs1 = this.zzhlw;
        return zs1 == null ? zs1.q() : zs1;
    }
}
