package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class r02 implements z02 {

    /* renamed from: a  reason: collision with root package name */
    private z02[] f4428a;

    r02(z02... z02Arr) {
        this.f4428a = z02Arr;
    }

    @Override // com.google.android.gms.internal.ads.z02
    public final a12 a(Class<?> cls) {
        z02[] z02Arr = this.f4428a;
        for (z02 z02 : z02Arr) {
            if (z02.b(cls)) {
                return z02.a(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.ads.z02
    public final boolean b(Class<?> cls) {
        for (z02 z02 : this.f4428a) {
            if (z02.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
