package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class mt1 extends rz1<mt1, a> implements e12 {
    private static volatile l12<mt1> zzea;
    private static final mt1 zzhmh;
    private int zzhlh;
    private dy1 zzhli = dy1.f2334c;

    public static final class a extends rz1.a<mt1, a> implements e12 {
        private a() {
            super(mt1.zzhmh);
        }

        /* synthetic */ a(lt1 lt1) {
            this();
        }

        public final a a(int i) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((mt1) this.f4576c).b(0);
            return this;
        }

        public final a a(dy1 dy1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((mt1) this.f4576c).a((mt1) dy1);
            return this;
        }
    }

    static {
        mt1 mt1 = new mt1();
        zzhmh = mt1;
        rz1.a(mt1.class, mt1);
    }

    private mt1() {
    }

    public static mt1 a(dy1 dy1, dz1 dz1) {
        return (mt1) rz1.a(zzhmh, dy1, dz1);
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
        return (a) zzhmh.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (lt1.f3602a[i - 1]) {
            case 1:
                return new mt1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhmh, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzhlh", "zzhli"});
            case 4:
                return zzhmh;
            case 5:
                l12<mt1> l12 = zzea;
                if (l12 == null) {
                    synchronized (mt1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhmh);
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
