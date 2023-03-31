package com.google.android.gms.internal.ads;

public enum a72 implements tz1 {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f1712b;

    static {
        new d72();
    }

    private a72(int i) {
        this.f1712b = i;
    }

    @Override // com.google.android.gms.internal.ads.tz1
    public final int a() {
        return this.f1712b;
    }

    public final String toString() {
        return "<" + a72.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f1712b + " name=" + name() + '>';
    }
}
