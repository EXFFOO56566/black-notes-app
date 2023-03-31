package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;
import java.util.List;

public final class yu1 extends rz1<yu1, b> implements e12 {
    private static volatile l12<yu1> zzea;
    private static final yu1 zzhoz;
    private int zzhox;
    private yz1<a> zzhoy = rz1.o();

    public static final class a extends rz1<a, C0081a> implements e12 {
        private static volatile l12<a> zzea;
        private static final a zzhpd;
        private int zzhoq;
        private ou1 zzhpa;
        private int zzhpb;
        private int zzhpc;

        /* renamed from: com.google.android.gms.internal.ads.yu1$a$a  reason: collision with other inner class name */
        public static final class C0081a extends rz1.a<a, C0081a> implements e12 {
            private C0081a() {
                super(a.zzhpd);
            }

            /* synthetic */ C0081a(xu1 xu1) {
                this();
            }
        }

        static {
            a aVar = new a();
            zzhpd = aVar;
            rz1.a(a.class, aVar);
        }

        private a() {
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.rz1
        public final Object a(int i, Object obj, Object obj2) {
            switch (xu1.f5497a[i - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0081a(null);
                case 3:
                    return rz1.a(zzhpd, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzhpa", "zzhpb", "zzhpc", "zzhoq"});
                case 4:
                    return zzhpd;
                case 5:
                    l12<a> l12 = zzea;
                    if (l12 == null) {
                        synchronized (a.class) {
                            l12 = zzea;
                            if (l12 == null) {
                                l12 = new rz1.c<>(zzhpd);
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

        public final su1 p() {
            su1 a2 = su1.a(this.zzhpb);
            return a2 == null ? su1.UNRECOGNIZED : a2;
        }

        public final lv1 q() {
            lv1 a2 = lv1.a(this.zzhoq);
            return a2 == null ? lv1.UNRECOGNIZED : a2;
        }

        public final boolean r() {
            return this.zzhpa != null;
        }

        public final ou1 s() {
            ou1 ou1 = this.zzhpa;
            return ou1 == null ? ou1.t() : ou1;
        }

        public final int t() {
            return this.zzhpc;
        }
    }

    public static final class b extends rz1.a<yu1, b> implements e12 {
        private b() {
            super(yu1.zzhoz);
        }

        /* synthetic */ b(xu1 xu1) {
            this();
        }
    }

    static {
        yu1 yu1 = new yu1();
        zzhoz = yu1;
        rz1.a(yu1.class, yu1);
    }

    private yu1() {
    }

    public static yu1 a(byte[] bArr, dz1 dz1) {
        return (yu1) rz1.a(zzhoz, bArr, dz1);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (xu1.f5497a[i - 1]) {
            case 1:
                return new yu1();
            case 2:
                return new b(null);
            case 3:
                return rz1.a(zzhoz, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzhox", "zzhoy", a.class});
            case 4:
                return zzhoz;
            case 5:
                l12<yu1> l12 = zzea;
                if (l12 == null) {
                    synchronized (yu1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhoz);
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
        return this.zzhox;
    }

    public final List<a> q() {
        return this.zzhoy;
    }

    public final int r() {
        return this.zzhoy.size();
    }
}
