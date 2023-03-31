package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class s20 extends rz1<s20, a> implements e12 {
    private static volatile l12<s20> zzea;
    private static final s20 zzem;
    private int zzdl;
    private t20 zzek;
    private u20 zzel;

    public static final class a extends rz1.a<s20, a> implements e12 {
        private a() {
            super(s20.zzem);
        }

        /* synthetic */ a(w40 w40) {
            this();
        }
    }

    static {
        s20 s20 = new s20();
        zzem = s20;
        rz1.a(s20.class, s20);
    }

    private s20() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (w40.f5208a[i - 1]) {
            case 1:
                return new s20();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzem, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{"zzdl", "zzek", "zzel"});
            case 4:
                return zzem;
            case 5:
                l12<s20> l12 = zzea;
                if (l12 == null) {
                    synchronized (s20.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzem);
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
        return (this.zzdl & 2) != 0;
    }

    public final u20 q() {
        u20 u20 = this.zzel;
        return u20 == null ? u20.q() : u20;
    }

    public final boolean r() {
        return (this.zzdl & 1) != 0;
    }

    public final t20 s() {
        t20 t20 = this.zzek;
        return t20 == null ? t20.q() : t20;
    }
}
