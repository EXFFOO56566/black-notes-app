package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class at1 extends rz1<at1, a> implements e12 {
    private static volatile l12<at1> zzea;
    private static final at1 zzhmc;
    private int zzhlh;
    private dy1 zzhli = dy1.f2334c;
    private et1 zzhmb;

    public static final class a extends rz1.a<at1, a> implements e12 {
        private a() {
            super(at1.zzhmc);
        }

        /* synthetic */ a(bt1 bt1) {
            this();
        }

        public final a a(int i) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((at1) this.f4576c).b(0);
            return this;
        }

        public final a a(dy1 dy1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((at1) this.f4576c).a((at1) dy1);
            return this;
        }

        public final a a(et1 et1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((at1) this.f4576c).a((at1) et1);
            return this;
        }
    }

    static {
        at1 at1 = new at1();
        zzhmc = at1;
        rz1.a(at1.class, at1);
    }

    private at1() {
    }

    public static at1 a(dy1 dy1, dz1 dz1) {
        return (at1) rz1.a(zzhmc, dy1, dz1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(dy1 dy1) {
        dy1.getClass();
        this.zzhli = dy1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(et1 et1) {
        et1.getClass();
        this.zzhmb = et1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhlh = i;
    }

    public static a s() {
        return (a) zzhmc.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (bt1.f2011a[i - 1]) {
            case 1:
                return new at1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhmc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhlh", "zzhmb", "zzhli"});
            case 4:
                return zzhmc;
            case 5:
                l12<at1> l12 = zzea;
                if (l12 == null) {
                    synchronized (at1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhmc);
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

    public final et1 r() {
        et1 et1 = this.zzhmb;
        return et1 == null ? et1.q() : et1;
    }
}
