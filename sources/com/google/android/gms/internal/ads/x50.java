package com.google.android.gms.internal.ads;

public enum x50 implements tz1 {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f5366b;

    static {
        new z70();
    }

    private x50(int i) {
        this.f5366b = i;
    }

    public static x50 a(int i) {
        if (i == 0) {
            return ENUM_SIGNAL_SOURCE_UNKNOWN;
        }
        if (i == 1) {
            return ENUM_SIGNAL_SOURCE_DISABLE;
        }
        if (i == 2) {
            return ENUM_SIGNAL_SOURCE_ADSHIELD;
        }
        if (i == 3) {
            return ENUM_SIGNAL_SOURCE_GASS;
        }
        if (i != 4) {
            return null;
        }
        return ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
    }

    public static vz1 b() {
        return y60.f5541a;
    }

    @Override // com.google.android.gms.internal.ads.tz1
    public final int a() {
        return this.f5366b;
    }

    public final String toString() {
        return "<" + x50.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f5366b + " name=" + name() + '>';
    }
}
