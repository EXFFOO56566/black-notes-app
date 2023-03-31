package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

public final class kl2 extends rz1<kl2, b> implements e12 {
    private static final kl2 zzcdj;
    private static volatile l12<kl2> zzea;
    private int zzcdi;
    private int zzdl;

    public enum a implements tz1 {
        VIDEO_ERROR_CODE_UNSPECIFIED(0),
        OPENGL_RENDERING_FAILED(1),
        CACHE_LOAD_FAILED(2),
        ANDROID_TARGET_API_TOO_LOW(3);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f3418b;

        static {
            new gm2();
        }

        private a(int i) {
            this.f3418b = i;
        }

        public static a a(int i) {
            if (i == 0) {
                return VIDEO_ERROR_CODE_UNSPECIFIED;
            }
            if (i == 1) {
                return OPENGL_RENDERING_FAILED;
            }
            if (i == 2) {
                return CACHE_LOAD_FAILED;
            }
            if (i != 3) {
                return null;
            }
            return ANDROID_TARGET_API_TOO_LOW;
        }

        public static vz1 b() {
            return fm2.f2623a;
        }

        @Override // com.google.android.gms.internal.ads.tz1
        public final int a() {
            return this.f3418b;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f3418b + " name=" + name() + '>';
        }
    }

    public static final class b extends rz1.a<kl2, b> implements e12 {
        private b() {
            super(kl2.zzcdj);
        }

        /* synthetic */ b(hk2 hk2) {
            this();
        }
    }

    static {
        kl2 kl2 = new kl2();
        zzcdj = kl2;
        rz1.a(kl2.class, kl2);
    }

    private kl2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new kl2();
            case 2:
                return new b(null);
            case 3:
                return rz1.a(zzcdj, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"zzdl", "zzcdi", a.b()});
            case 4:
                return zzcdj;
            case 5:
                l12<kl2> l12 = zzea;
                if (l12 == null) {
                    synchronized (kl2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzcdj);
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
