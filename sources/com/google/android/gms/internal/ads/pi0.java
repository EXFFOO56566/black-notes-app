package com.google.android.gms.internal.ads;

public enum pi0 implements tz1 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(1000);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f4183b;

    static {
        new sl0();
    }

    private pi0(int i) {
        this.f4183b = i;
    }

    public static pi0 a(int i) {
        if (i == 0) {
            return ENUM_FALSE;
        }
        if (i == 1) {
            return ENUM_TRUE;
        }
        if (i == 2) {
            return ENUM_FAILURE;
        }
        if (i != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static vz1 b() {
        return rk0.f4513a;
    }

    @Override // com.google.android.gms.internal.ads.tz1
    public final int a() {
        return this.f4183b;
    }

    public final String toString() {
        return "<" + pi0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4183b + " name=" + name() + '>';
    }
}
