package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class hl2 extends rz1<hl2, a> implements e12 {
    private static final hl2 zzccn;
    private static volatile l12<hl2> zzea;
    private int zzcck;
    private int zzccl;
    private int zzccm;
    private int zzdl;

    public static final class a extends rz1.a<hl2, a> implements e12 {
        private a() {
            super(hl2.zzccn);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }

        public final a a(int i) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((hl2) this.f4576c).b(i);
            return this;
        }

        public final a b(int i) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((hl2) this.f4576c).c(i);
            return this;
        }

        public final a c(int i) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((hl2) this.f4576c).d(i);
            return this;
        }
    }

    static {
        hl2 hl2 = new hl2();
        zzccn = hl2;
        rz1.a(hl2.class, hl2);
    }

    private hl2() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzdl |= 1;
        this.zzcck = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void c(int i) {
        this.zzdl |= 2;
        this.zzccl = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void d(int i) {
        this.zzdl |= 4;
        this.zzccm = i;
    }

    public static a p() {
        return (a) zzccn.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new hl2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzccn, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002", new Object[]{"zzdl", "zzcck", "zzccl", "zzccm"});
            case 4:
                return zzccn;
            case 5:
                l12<hl2> l12 = zzea;
                if (l12 == null) {
                    synchronized (hl2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzccn);
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
