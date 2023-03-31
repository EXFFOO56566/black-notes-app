package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class xt1 extends rz1<xt1, a> implements e12 {
    private static volatile l12<xt1> zzea;
    private static final xt1 zzhmy;
    private int zzhlh;
    private dy1 zzhli = dy1.f2334c;
    private au1 zzhmx;

    public static final class a extends rz1.a<xt1, a> implements e12 {
        private a() {
            super(xt1.zzhmy);
        }

        /* synthetic */ a(yt1 yt1) {
            this();
        }

        public final a a(int i) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((xt1) this.f4576c).b(0);
            return this;
        }

        public final a a(au1 au1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((xt1) this.f4576c).a((xt1) au1);
            return this;
        }

        public final a a(dy1 dy1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((xt1) this.f4576c).a((xt1) dy1);
            return this;
        }
    }

    static {
        xt1 xt1 = new xt1();
        zzhmy = xt1;
        rz1.a(xt1.class, xt1);
    }

    private xt1() {
    }

    public static xt1 a(dy1 dy1, dz1 dz1) {
        return (xt1) rz1.a(zzhmy, dy1, dz1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(au1 au1) {
        au1.getClass();
        this.zzhmx = au1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(dy1 dy1) {
        dy1.getClass();
        this.zzhli = dy1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhlh = i;
    }

    public static a s() {
        return (a) zzhmy.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (yt1.f5651a[i - 1]) {
            case 1:
                return new xt1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhmy, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhlh", "zzhmx", "zzhli"});
            case 4:
                return zzhmy;
            case 5:
                l12<xt1> l12 = zzea;
                if (l12 == null) {
                    synchronized (xt1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhmy);
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

    public final au1 r() {
        au1 au1 = this.zzhmx;
        return au1 == null ? au1.u() : au1;
    }
}
