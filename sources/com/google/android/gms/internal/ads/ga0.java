package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class ga0 extends rz1<ga0, a> implements e12 {
    private static volatile l12<ga0> zzea;
    private static final ga0 zzlv;
    private int zzdl;
    private int zzhk = 1;
    private int zzhl = 1;
    private dy1 zzkw = dy1.f2334c;
    private yz1<dy1> zzlu = rz1.o();

    public static final class a extends rz1.a<ga0, a> implements e12 {
        private a() {
            super(ga0.zzlv);
        }

        /* synthetic */ a(a90 a90) {
            this();
        }

        public final a a(dy1 dy1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((ga0) this.f4576c).b(dy1);
            return this;
        }

        public final a a(oh0 oh0) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((ga0) this.f4576c).a((ga0) oh0);
            return this;
        }

        public final a b(dy1 dy1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((ga0) this.f4576c).a((ga0) dy1);
            return this;
        }
    }

    static {
        ga0 ga0 = new ga0();
        zzlv = ga0;
        rz1.a(ga0.class, ga0);
    }

    private ga0() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(dy1 dy1) {
        dy1.getClass();
        this.zzdl |= 1;
        this.zzkw = dy1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(oh0 oh0) {
        this.zzhk = oh0.a();
        this.zzdl |= 4;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(dy1 dy1) {
        dy1.getClass();
        if (!this.zzlu.h()) {
            this.zzlu = rz1.a(this.zzlu);
        }
        this.zzlu.add(dy1);
    }

    public static a p() {
        return (a) zzlv.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (a90.f1723a[i - 1]) {
            case 1:
                return new ga0();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzlv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002\n\u0000\u0003\f\u0001\u0004\f\u0002", new Object[]{"zzdl", "zzlu", "zzkw", "zzhl", un0.b(), "zzhk", oh0.b()});
            case 4:
                return zzlv;
            case 5:
                l12<ga0> l12 = zzea;
                if (l12 == null) {
                    synchronized (ga0.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzlv);
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
}
