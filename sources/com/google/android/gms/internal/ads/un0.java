package com.google.android.gms.internal.ads;

public enum un0 implements tz1 {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f4980b;

    static {
        new tm0();
    }

    private un0(int i) {
        this.f4980b = i;
    }

    public static un0 a(int i) {
        if (i == 0) {
            return UNKNOWN_PROTO;
        }
        if (i == 1) {
            return AFMA_SIGNALS;
        }
        if (i == 2) {
            return UNITY_SIGNALS;
        }
        if (i != 3) {
            return null;
        }
        return PARTNER_SIGNALS;
    }

    public static vz1 b() {
        return vo0.f5140a;
    }

    @Override // com.google.android.gms.internal.ads.tz1
    public final int a() {
        return this.f4980b;
    }

    public final String toString() {
        return "<" + un0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4980b + " name=" + name() + '>';
    }
}
