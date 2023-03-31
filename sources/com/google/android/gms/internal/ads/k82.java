package com.google.android.gms.internal.ads;

public final class k82 {
    public static final k82 d = new k82(1.0f, 1.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f3342a;

    /* renamed from: b  reason: collision with root package name */
    public final float f3343b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3344c;

    public k82(float f, float f2) {
        this.f3342a = f;
        this.f3343b = f2;
        this.f3344c = Math.round(f * 1000.0f);
    }

    public final long a(long j) {
        return j * ((long) this.f3344c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k82.class == obj.getClass()) {
            k82 k82 = (k82) obj;
            return this.f3342a == k82.f3342a && this.f3343b == k82.f3343b;
        }
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f3342a) + 527) * 31) + Float.floatToRawIntBits(this.f3343b);
    }
}
