package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class c72 extends rz1<c72, a> implements e12 {
    private static final c72 zzabm;
    private static volatile l12<c72> zzea;
    private g72 zzabj;
    private dy1 zzabk;
    private dy1 zzabl;
    private int zzdl;

    public static final class a extends rz1.a<c72, a> implements e12 {
        private a() {
            super(c72.zzabm);
        }

        /* synthetic */ a(e72 e72) {
            this();
        }
    }

    static {
        c72 c72 = new c72();
        zzabm = c72;
        rz1.a(c72.class, c72);
    }

    private c72() {
        dy1 dy1 = dy1.f2334c;
        this.zzabk = dy1;
        this.zzabl = dy1;
    }

    public static c72 a(dy1 dy1, dz1 dz1) {
        return (c72) rz1.a(zzabm, dy1, dz1);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (e72.f2379a[i - 1]) {
            case 1:
                return new c72();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzabm, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\n\u0001\u0003\n\u0002", new Object[]{"zzdl", "zzabj", "zzabk", "zzabl"});
            case 4:
                return zzabm;
            case 5:
                l12<c72> l12 = zzea;
                if (l12 == null) {
                    synchronized (c72.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzabm);
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

    public final g72 p() {
        g72 g72 = this.zzabj;
        return g72 == null ? g72.v() : g72;
    }

    public final dy1 q() {
        return this.zzabk;
    }

    public final dy1 r() {
        return this.zzabl;
    }
}
