package com.google.android.gms.internal.ads;

public enum o32 implements tz1 {
    SAFE(0),
    DANGEROUS(1),
    UNKNOWN(2),
    POTENTIALLY_UNWANTED(3),
    DANGEROUS_HOST(4);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f3940b;

    static {
        new q32();
    }

    private o32(int i) {
        this.f3940b = i;
    }

    public static o32 a(int i) {
        if (i == 0) {
            return SAFE;
        }
        if (i == 1) {
            return DANGEROUS;
        }
        if (i == 2) {
            return UNKNOWN;
        }
        if (i == 3) {
            return POTENTIALLY_UNWANTED;
        }
        if (i != 4) {
            return null;
        }
        return DANGEROUS_HOST;
    }

    public static vz1 b() {
        return s32.f4595a;
    }

    @Override // com.google.android.gms.internal.ads.tz1
    public final int a() {
        return this.f3940b;
    }

    public final String toString() {
        return "<" + o32.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f3940b + " name=" + name() + '>';
    }
}
