package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class nk2 extends rz1<nk2, a> implements e12 {
    private static final nk2 zzcea;
    private static volatile l12<nk2> zzea;
    private boolean zzcdy;
    private int zzcdz;
    private int zzdl;

    public static final class a extends rz1.a<nk2, a> implements e12 {
        private a() {
            super(nk2.zzcea);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }

        public final a a(int i) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((nk2) this.f4576c).b(i);
            return this;
        }

        public final a a(boolean z) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((nk2) this.f4576c).a((nk2) z);
            return this;
        }

        public final boolean m() {
            return ((nk2) this.f4576c).p();
        }
    }

    static {
        nk2 nk2 = new nk2();
        zzcea = nk2;
        rz1.a(nk2.class, nk2);
    }

    private nk2() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(boolean z) {
        this.zzdl |= 1;
        this.zzcdy = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzdl |= 2;
        this.zzcdz = i;
    }

    public static a q() {
        return (a) zzcea.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new nk2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzcea, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0004\u0001", new Object[]{"zzdl", "zzcdy", "zzcdz"});
            case 4:
                return zzcea;
            case 5:
                l12<nk2> l12 = zzea;
                if (l12 == null) {
                    synchronized (nk2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzcea);
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

    public final boolean p() {
        return this.zzcdy;
    }
}
