package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class ju1 extends rz1<ju1, a> implements e12 {
    private static volatile l12<ju1> zzea;
    private static final ju1 zzhnv;
    private int zzhlh;
    private dy1 zzhli = dy1.f2334c;
    private nu1 zzhnu;

    public static final class a extends rz1.a<ju1, a> implements e12 {
        private a() {
            super(ju1.zzhnv);
        }

        /* synthetic */ a(hu1 hu1) {
            this();
        }

        public final a a(int i) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((ju1) this.f4576c).b(0);
            return this;
        }

        public final a a(dy1 dy1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((ju1) this.f4576c).a((ju1) dy1);
            return this;
        }

        public final a a(nu1 nu1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((ju1) this.f4576c).a((ju1) nu1);
            return this;
        }
    }

    static {
        ju1 ju1 = new ju1();
        zzhnv = ju1;
        rz1.a(ju1.class, ju1);
    }

    private ju1() {
    }

    public static ju1 a(dy1 dy1, dz1 dz1) {
        return (ju1) rz1.a(zzhnv, dy1, dz1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(dy1 dy1) {
        dy1.getClass();
        this.zzhli = dy1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(nu1 nu1) {
        nu1.getClass();
        this.zzhnu = nu1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhlh = i;
    }

    public static a s() {
        return (a) zzhnv.j();
    }

    public static ju1 t() {
        return zzhnv;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hu1.f2978a[i - 1]) {
            case 1:
                return new ju1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhnv, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhlh", "zzhnu", "zzhli"});
            case 4:
                return zzhnv;
            case 5:
                l12<ju1> l12 = zzea;
                if (l12 == null) {
                    synchronized (ju1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhnv);
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

    public final nu1 r() {
        nu1 nu1 = this.zzhnu;
        return nu1 == null ? nu1.r() : nu1;
    }
}
