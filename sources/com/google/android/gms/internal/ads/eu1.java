package com.google.android.gms.internal.ads;

public enum eu1 implements tz1 {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f2482b;

    static {
        new du1();
    }

    private eu1(int i2) {
        this.f2482b = i2;
    }

    public static eu1 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_CURVE;
        }
        if (i2 == 2) {
            return NIST_P256;
        }
        if (i2 == 3) {
            return NIST_P384;
        }
        if (i2 == 4) {
            return NIST_P521;
        }
        if (i2 != 5) {
            return null;
        }
        return CURVE25519;
    }

    @Override // com.google.android.gms.internal.ads.tz1
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f2482b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(eu1.class.getName());
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
