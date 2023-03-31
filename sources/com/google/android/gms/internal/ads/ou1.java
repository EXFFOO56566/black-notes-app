package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;

public final class ou1 extends rz1<ou1, a> implements e12 {
    private static volatile l12<ou1> zzea;
    private static final ou1 zzhoc;
    private String zzhnz = BuildConfig.FLAVOR;
    private dy1 zzhoa = dy1.f2334c;
    private int zzhob;

    public static final class a extends rz1.a<ou1, a> implements e12 {
        private a() {
            super(ou1.zzhoc);
        }

        /* synthetic */ a(pu1 pu1) {
            this();
        }

        public final a a(dy1 dy1) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((ou1) this.f4576c).a((ou1) dy1);
            return this;
        }

        public final a a(b bVar) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((ou1) this.f4576c).a((ou1) bVar);
            return this;
        }

        public final a a(String str) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((ou1) this.f4576c).a((ou1) str);
            return this;
        }
    }

    public enum b implements tz1 {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f4049b;

        static {
            new qu1();
        }

        private b(int i2) {
            this.f4049b = i2;
        }

        public static b a(int i2) {
            if (i2 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i2 == 1) {
                return SYMMETRIC;
            }
            if (i2 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i2 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i2 != 4) {
                return null;
            }
            return REMOTE;
        }

        @Override // com.google.android.gms.internal.ads.tz1
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f4049b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(b.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=");
                sb.append(a());
            }
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }
    }

    static {
        ou1 ou1 = new ou1();
        zzhoc = ou1;
        rz1.a(ou1.class, ou1);
    }

    private ou1() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(dy1 dy1) {
        dy1.getClass();
        this.zzhoa = dy1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(b bVar) {
        this.zzhob = bVar.a();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        str.getClass();
        this.zzhnz = str;
    }

    public static a s() {
        return (a) zzhoc.j();
    }

    public static ou1 t() {
        return zzhoc;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (pu1.f4234a[i - 1]) {
            case 1:
                return new ou1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhoc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzhnz", "zzhoa", "zzhob"});
            case 4:
                return zzhoc;
            case 5:
                l12<ou1> l12 = zzea;
                if (l12 == null) {
                    synchronized (ou1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhoc);
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

    public final String p() {
        return this.zzhnz;
    }

    public final dy1 q() {
        return this.zzhoa;
    }

    public final b r() {
        b a2 = b.a(this.zzhob);
        return a2 == null ? b.UNRECOGNIZED : a2;
    }
}
