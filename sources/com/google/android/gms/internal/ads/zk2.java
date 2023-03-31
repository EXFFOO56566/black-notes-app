package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class zk2 extends rz1<zk2, b> implements e12 {
    private static final zk2 zzcaa;
    private static volatile l12<zk2> zzea;
    private int zzbxl;
    private int zzbzz;
    private int zzdl;

    public enum a implements tz1 {
        CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
        TWO_G(1),
        THREE_G(2),
        LTE(4);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f5773b;

        static {
            new zl2();
        }

        private a(int i) {
            this.f5773b = i;
        }

        public static a a(int i) {
            if (i == 0) {
                return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return TWO_G;
            }
            if (i == 2) {
                return THREE_G;
            }
            if (i != 4) {
                return null;
            }
            return LTE;
        }

        public static vz1 b() {
            return yl2.f5614a;
        }

        @Override // com.google.android.gms.internal.ads.tz1
        public final int a() {
            return this.f5773b;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f5773b + " name=" + name() + '>';
        }
    }

    public static final class b extends rz1.a<zk2, b> implements e12 {
        private b() {
            super(zk2.zzcaa);
        }

        /* synthetic */ b(hk2 hk2) {
            this();
        }

        public final b a(a aVar) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((zk2) this.f4576c).a((zk2) aVar);
            return this;
        }

        public final b a(c cVar) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((zk2) this.f4576c).a((zk2) cVar);
            return this;
        }
    }

    public enum c implements tz1 {
        NETWORKTYPE_UNSPECIFIED(0),
        CELL(1),
        WIFI(2);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f5775b;

        static {
            new am2();
        }

        private c(int i) {
            this.f5775b = i;
        }

        public static c a(int i) {
            if (i == 0) {
                return NETWORKTYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return CELL;
            }
            if (i != 2) {
                return null;
            }
            return WIFI;
        }

        public static vz1 b() {
            return bm2.f1976a;
        }

        @Override // com.google.android.gms.internal.ads.tz1
        public final int a() {
            return this.f5775b;
        }

        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f5775b + " name=" + name() + '>';
        }
    }

    static {
        zk2 zk2 = new zk2();
        zzcaa = zk2;
        rz1.a(zk2.class, zk2);
    }

    private zk2() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(a aVar) {
        this.zzbzz = aVar.a();
        this.zzdl |= 2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(c cVar) {
        this.zzbxl = cVar.a();
        this.zzdl |= 1;
    }

    public static b p() {
        return (b) zzcaa.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new zk2();
            case 2:
                return new b(null);
            case 3:
                return rz1.a(zzcaa, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"zzdl", "zzbxl", c.b(), "zzbzz", a.b()});
            case 4:
                return zzcaa;
            case 5:
                l12<zk2> l12 = zzea;
                if (l12 == null) {
                    synchronized (zk2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzcaa);
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
