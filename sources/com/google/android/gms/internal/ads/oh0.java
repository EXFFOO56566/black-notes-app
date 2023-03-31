package com.google.android.gms.internal.ads;

public enum oh0 implements tz1 {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3),
    DG(4);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f3994b;

    static {
        new ng0();
    }

    private oh0(int i) {
        this.f3994b = i;
    }

    public static oh0 a(int i) {
        if (i == 0) {
            return UNKNOWN_ENCRYPTION_METHOD;
        }
        if (i == 1) {
            return BITSLICER;
        }
        if (i == 2) {
            return TINK_HYBRID;
        }
        if (i == 3) {
            return UNENCRYPTED;
        }
        if (i != 4) {
            return null;
        }
        return DG;
    }

    public static vz1 b() {
        return qj0.f4342a;
    }

    @Override // com.google.android.gms.internal.ads.tz1
    public final int a() {
        return this.f3994b;
    }

    public final String toString() {
        return "<" + oh0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f3994b + " name=" + name() + '>';
    }
}
