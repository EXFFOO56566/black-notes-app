package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class ov1 extends rz1<ov1, a> implements e12 {
    private static volatile l12<ov1> zzea;
    private static final ov1 zzhqa;
    private int zzhlh;
    private dy1 zzhli = dy1.f2334c;

    public static final class a extends rz1.a<ov1, a> implements e12 {
        private a() {
            super(ov1.zzhqa);
        }

        /* synthetic */ a(pv1 pv1) {
            this();
        }

        public final a a(int i) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((ov1) this.f4576c).b(0);
            return this;
        }

        public final a a(dy1 dy1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((ov1) this.f4576c).a((ov1) dy1);
            return this;
        }
    }

    static {
        ov1 ov1 = new ov1();
        zzhqa = ov1;
        rz1.a(ov1.class, ov1);
    }

    private ov1() {
    }

    public static ov1 a(dy1 dy1, dz1 dz1) {
        return (ov1) rz1.a(zzhqa, dy1, dz1);
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

    public static a r() {
        return (a) zzhqa.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (pv1.f4239a[i - 1]) {
            case 1:
                return new ov1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhqa, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzhlh", "zzhli"});
            case 4:
                return zzhqa;
            case 5:
                l12<ov1> l12 = zzea;
                if (l12 == null) {
                    synchronized (ov1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhqa);
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
}
