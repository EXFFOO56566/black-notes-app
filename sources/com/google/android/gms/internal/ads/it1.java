package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class it1 extends rz1<it1, a> implements e12 {
    private static volatile l12<it1> zzea;
    private static final it1 zzhmf;
    private int zzhlh;
    private dy1 zzhli = dy1.f2334c;

    public static final class a extends rz1.a<it1, a> implements e12 {
        private a() {
            super(it1.zzhmf);
        }

        /* synthetic */ a(gt1 gt1) {
            this();
        }

        public final a a(int i) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((it1) this.f4576c).b(0);
            return this;
        }

        public final a a(dy1 dy1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((it1) this.f4576c).a((it1) dy1);
            return this;
        }
    }

    static {
        it1 it1 = new it1();
        zzhmf = it1;
        rz1.a(it1.class, it1);
    }

    private it1() {
    }

    public static it1 a(dy1 dy1, dz1 dz1) {
        return (it1) rz1.a(zzhmf, dy1, dz1);
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
        return (a) zzhmf.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (gt1.f2810a[i - 1]) {
            case 1:
                return new it1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhmf, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzhlh", "zzhli"});
            case 4:
                return zzhmf;
            case 5:
                l12<it1> l12 = zzea;
                if (l12 == null) {
                    synchronized (it1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhmf);
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
