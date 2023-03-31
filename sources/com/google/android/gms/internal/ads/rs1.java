package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class rs1 extends rz1<rs1, a> implements e12 {
    private static volatile l12<rs1> zzea;
    private static final rs1 zzhls;
    private int zzhlh;
    private vs1 zzhlq;
    private ju1 zzhlr;

    public static final class a extends rz1.a<rs1, a> implements e12 {
        private a() {
            super(rs1.zzhls);
        }

        /* synthetic */ a(qs1 qs1) {
            this();
        }

        public final a a(int i) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((rs1) this.f4576c).b(i);
            return this;
        }

        public final a a(ju1 ju1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((rs1) this.f4576c).a((rs1) ju1);
            return this;
        }

        public final a a(vs1 vs1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((rs1) this.f4576c).a((rs1) vs1);
            return this;
        }
    }

    static {
        rs1 rs1 = new rs1();
        zzhls = rs1;
        rz1.a(rs1.class, rs1);
    }

    private rs1() {
    }

    public static rs1 a(dy1 dy1, dz1 dz1) {
        return (rs1) rz1.a(zzhls, dy1, dz1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(ju1 ju1) {
        ju1.getClass();
        this.zzhlr = ju1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(vs1 vs1) {
        vs1.getClass();
        this.zzhlq = vs1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhlh = i;
    }

    public static a s() {
        return (a) zzhls.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (qs1.f4385a[i - 1]) {
            case 1:
                return new rs1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhls, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzhlh", "zzhlq", "zzhlr"});
            case 4:
                return zzhls;
            case 5:
                l12<rs1> l12 = zzea;
                if (l12 == null) {
                    synchronized (rs1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhls);
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

    public final vs1 q() {
        vs1 vs1 = this.zzhlq;
        return vs1 == null ? vs1.t() : vs1;
    }

    public final ju1 r() {
        ju1 ju1 = this.zzhlr;
        return ju1 == null ? ju1.t() : ju1;
    }
}
