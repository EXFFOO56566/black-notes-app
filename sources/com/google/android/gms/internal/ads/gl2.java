package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class gl2 extends rz1<gl2, a> implements e12 {
    private static final gl2 zzccj;
    private static volatile l12<gl2> zzea;
    private int zzcch;
    private int zzcci;
    private int zzdl;

    public static final class a extends rz1.a<gl2, a> implements e12 {
        private a() {
            super(gl2.zzccj);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }
    }

    static {
        gl2 gl2 = new gl2();
        zzccj = gl2;
        rz1.a(gl2.class, gl2);
    }

    private gl2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new gl2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzccj, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzdl", "zzcch", "zzcci"});
            case 4:
                return zzccj;
            case 5:
                l12<gl2> l12 = zzea;
                if (l12 == null) {
                    synchronized (gl2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzccj);
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
