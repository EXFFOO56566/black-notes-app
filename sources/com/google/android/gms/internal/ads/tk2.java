package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;

public final class tk2 extends rz1<tk2, a> implements e12 {
    private static final tk2 zzbyn;
    private static volatile l12<tk2> zzea;
    private String zzbyf = BuildConfig.FLAVOR;
    private gl2 zzbyg;
    private int zzbyh;
    private hl2 zzbyi;
    private int zzbyj;
    private int zzbyk = 1000;
    private int zzbyl = 1000;
    private int zzbym = 1000;
    private int zzdl;

    public static final class a extends rz1.a<tk2, a> implements e12 {
        private a() {
            super(tk2.zzbyn);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }

        public final a a(hl2 hl2) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((tk2) this.f4576c).a((tk2) hl2);
            return this;
        }

        public final a a(String str) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((tk2) this.f4576c).a((tk2) str);
            return this;
        }
    }

    static {
        tk2 tk2 = new tk2();
        zzbyn = tk2;
        rz1.a(tk2.class, tk2);
    }

    private tk2() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(hl2 hl2) {
        hl2.getClass();
        this.zzbyi = hl2;
        this.zzdl |= 8;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        str.getClass();
        this.zzdl |= 1;
        this.zzbyf = str;
    }

    public static tk2 p() {
        return zzbyn;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new tk2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzbyn, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\b\u0000\u0002\t\u0001\u0003\u0004\u0002\u0004\t\u0003\u0005\u0004\u0004\u0006\f\u0005\u0007\f\u0006\b\f\u0007", new Object[]{"zzdl", "zzbyf", "zzbyg", "zzbyh", "zzbyi", "zzbyj", "zzbyk", wl2.b(), "zzbyl", wl2.b(), "zzbym", wl2.b()});
            case 4:
                return zzbyn;
            case 5:
                l12<tk2> l12 = zzea;
                if (l12 == null) {
                    synchronized (tk2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzbyn);
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
