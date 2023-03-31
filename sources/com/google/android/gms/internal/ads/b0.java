package com.google.android.gms.internal.ads;

public class b0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f1837a;

    /* renamed from: b  reason: collision with root package name */
    private final T f1838b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1839c;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;TT;Ljava/lang/Integer;)V */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    protected b0(String str, Object obj, int i) {
        this.f1837a = str;
        this.f1838b = obj;
        this.f1839c = i;
    }

    public static b0<Double> a(String str, double d) {
        return new b0<>(str, Double.valueOf(d), e0.f2349c);
    }

    public static b0<Long> a(String str, long j) {
        return new b0<>(str, Long.valueOf(j), e0.f2348b);
    }

    public static b0<String> a(String str, String str2) {
        return new b0<>(str, str2, e0.d);
    }

    public static b0<Boolean> a(String str, boolean z) {
        return new b0<>(str, Boolean.valueOf(z), e0.f2347a);
    }

    public T a() {
        b1 a2 = f1.a();
        if (a2 != null) {
            int i = a0.f1669a[this.f1839c - 1];
            if (i == 1) {
                return (T) a2.a(this.f1837a, this.f1838b.booleanValue());
            }
            if (i == 2) {
                return (T) a2.a(this.f1837a, this.f1838b.longValue());
            }
            if (i == 3) {
                return (T) a2.a(this.f1837a, this.f1838b.doubleValue());
            }
            if (i == 4) {
                return (T) a2.a(this.f1837a, this.f1838b);
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException("Flag is not initialized.");
    }
}
