package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final /* synthetic */ class z51 implements xk1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f5699a;

    z51(String str) {
        this.f5699a = str;
    }

    @Override // com.google.android.gms.internal.ads.xk1
    public final Object a(Object obj) {
        Throwable th = (Throwable) obj;
        String valueOf = String.valueOf(this.f5699a);
        co.b(valueOf.length() != 0 ? "Error calling adapter: ".concat(valueOf) : new String("Error calling adapter: "));
        return null;
    }
}
