package com.google.android.gms.internal.ads;

public final class d0<T> extends b0<T> {
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;TT;Ljava/lang/Integer;)V */
    protected d0(String str, Object obj, int i) {
        super(str, obj, i);
    }

    public static b0<Boolean> a(String str, boolean z) {
        return new d0(str, true, e0.f2347a);
    }

    @Override // com.google.android.gms.internal.ads.b0
    public final T a() {
        if (f1.f2515b.get()) {
            return (T) super.a();
        }
        throw new IllegalStateException("Striped code is accessed: 54c42518-856a-44fb-aae0-cd6676d514e5");
    }
}
