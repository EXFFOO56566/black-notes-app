package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class ks1 extends rz1<ks1, a> implements e12 {
    private static volatile l12<ks1> zzea;
    private static final ks1 zzhlk;
    private int zzhlh;
    private dy1 zzhli = dy1.f2334c;
    private os1 zzhlj;

    public static final class a extends rz1.a<ks1, a> implements e12 {
        private a() {
            super(ks1.zzhlk);
        }

        /* synthetic */ a(ls1 ls1) {
            this();
        }

        public final a a(int i) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((ks1) this.f4576c).b(0);
            return this;
        }

        public final a a(dy1 dy1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((ks1) this.f4576c).a((ks1) dy1);
            return this;
        }

        public final a a(os1 os1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((ks1) this.f4576c).a((ks1) os1);
            return this;
        }
    }

    static {
        ks1 ks1 = new ks1();
        zzhlk = ks1;
        rz1.a(ks1.class, ks1);
    }

    private ks1() {
    }

    public static ks1 a(dy1 dy1, dz1 dz1) {
        return (ks1) rz1.a(zzhlk, dy1, dz1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(dy1 dy1) {
        dy1.getClass();
        this.zzhli = dy1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(os1 os1) {
        os1.getClass();
        this.zzhlj = os1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhlh = i;
    }

    public static a s() {
        return (a) zzhlk.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (ls1.f3596a[i - 1]) {
            case 1:
                return new ks1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhlk, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzhlh", "zzhli", "zzhlj"});
            case 4:
                return zzhlk;
            case 5:
                l12<ks1> l12 = zzea;
                if (l12 == null) {
                    synchronized (ks1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhlk);
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

    public final os1 r() {
        os1 os1 = this.zzhlj;
        return os1 == null ? os1.q() : os1;
    }
}
