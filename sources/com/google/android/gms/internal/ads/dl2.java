package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class dl2 extends rz1<dl2, a> implements e12 {
    private static final dl2 zzccc;
    private static volatile l12<dl2> zzea;
    private int zzcca;
    private int zzccb;
    private int zzdl;

    public static final class a extends rz1.a<dl2, a> implements e12 {
        private a() {
            super(dl2.zzccc);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }
    }

    static {
        dl2 dl2 = new dl2();
        zzccc = dl2;
        rz1.a(dl2.class, dl2);
    }

    private dl2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new dl2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzccc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzdl", "zzcca", "zzccb"});
            case 4:
                return zzccc;
            case 5:
                l12<dl2> l12 = zzea;
                if (l12 == null) {
                    synchronized (dl2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzccc);
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
