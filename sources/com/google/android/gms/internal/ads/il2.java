package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class il2 extends rz1<il2, a> implements e12 {
    private static final il2 zzcde;
    private static volatile l12<il2> zzea;
    private ml2 zzcco;
    private kk2 zzccp;
    private lk2 zzccq;
    private mk2 zzccr;
    private jl2 zzccs;
    private jk2 zzcct;
    private ll2 zzccu;
    private int zzccv;
    private int zzccw;
    private gl2 zzccx;
    private int zzccy;
    private int zzccz;
    private int zzcda;
    private int zzcdb;
    private int zzcdc;
    private long zzcdd;
    private int zzdl;

    public static final class a extends rz1.a<il2, a> implements e12 {
        private a() {
            super(il2.zzcde);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }
    }

    static {
        il2 il2 = new il2();
        zzcde = il2;
        rz1.a(il2.class, il2);
    }

    private il2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new il2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzcde, "\u0001\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005\t\u0000\u0006\t\u0001\u0007\t\u0002\b\t\u0003\t\t\u0004\n\t\u0005\u000b\t\u0006\f\u0004\u0007\r\u0004\b\u000e\t\t\u000f\u0004\n\u0010\u0004\u000b\u0011\u0004\f\u0012\u0004\r\u0013\u0004\u000e\u0014\u0003\u000f", new Object[]{"zzdl", "zzcco", "zzccp", "zzccq", "zzccr", "zzccs", "zzcct", "zzccu", "zzccv", "zzccw", "zzccx", "zzccy", "zzccz", "zzcda", "zzcdb", "zzcdc", "zzcdd"});
            case 4:
                return zzcde;
            case 5:
                l12<il2> l12 = zzea;
                if (l12 == null) {
                    synchronized (il2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzcde);
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
