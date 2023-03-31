package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class da0 extends rz1<da0, a> implements e12 {
    private static volatile l12<da0> zzea;
    private static final da0 zzkz;
    private int zzdl;
    private dy1 zzkv;
    private dy1 zzkw;
    private dy1 zzkx;
    private dy1 zzky;

    public static final class a extends rz1.a<da0, a> implements e12 {
        private a() {
            super(da0.zzkz);
        }

        /* synthetic */ a(a90 a90) {
            this();
        }

        public final a a(dy1 dy1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((da0) this.f4576c).a((da0) dy1);
            return this;
        }

        public final a b(dy1 dy1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((da0) this.f4576c).b(dy1);
            return this;
        }

        public final a c(dy1 dy1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((da0) this.f4576c).c(dy1);
            return this;
        }

        public final a d(dy1 dy1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((da0) this.f4576c).d(dy1);
            return this;
        }
    }

    static {
        da0 da0 = new da0();
        zzkz = da0;
        rz1.a(da0.class, da0);
    }

    private da0() {
        dy1 dy1 = dy1.f2334c;
        this.zzkv = dy1;
        this.zzkw = dy1;
        this.zzkx = dy1;
        this.zzky = dy1;
    }

    public static da0 a(byte[] bArr, dz1 dz1) {
        return (da0) rz1.a(zzkz, bArr, dz1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(dy1 dy1) {
        dy1.getClass();
        this.zzdl |= 1;
        this.zzkv = dy1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(dy1 dy1) {
        dy1.getClass();
        this.zzdl |= 2;
        this.zzkw = dy1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void c(dy1 dy1) {
        dy1.getClass();
        this.zzdl |= 4;
        this.zzkx = dy1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void d(dy1 dy1) {
        dy1.getClass();
        this.zzdl |= 8;
        this.zzky = dy1;
    }

    public static a t() {
        return (a) zzkz.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (a90.f1723a[i - 1]) {
            case 1:
                return new da0();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzkz, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001\u0003\n\u0002\u0004\n\u0003", new Object[]{"zzdl", "zzkv", "zzkw", "zzkx", "zzky"});
            case 4:
                return zzkz;
            case 5:
                l12<da0> l12 = zzea;
                if (l12 == null) {
                    synchronized (da0.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzkz);
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

    public final dy1 p() {
        return this.zzkv;
    }

    public final dy1 q() {
        return this.zzkw;
    }

    public final dy1 r() {
        return this.zzkx;
    }

    public final dy1 s() {
        return this.zzky;
    }
}
