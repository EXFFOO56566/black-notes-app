package com.google.android.gms.internal.ads;

public final class t42<T> implements l42<T>, e52<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f4752c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile e52<T> f4753a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f4754b = f4752c;

    private t42(e52<T> e52) {
        this.f4753a = e52;
    }

    public static <P extends e52<T>, T> e52<T> a(P p) {
        y42.a(p);
        return p instanceof t42 ? p : new t42(p);
    }

    public static <P extends e52<T>, T> l42<T> b(P p) {
        if (p instanceof l42) {
            return (l42) p;
        }
        y42.a(p);
        return new t42(p);
    }

    @Override // com.google.android.gms.internal.ads.e52, com.google.android.gms.internal.ads.l42
    public final T get() {
        T t = (T) this.f4754b;
        if (t == f4752c) {
            synchronized (this) {
                t = this.f4754b;
                if (t == f4752c) {
                    t = this.f4753a.get();
                    Object obj = this.f4754b;
                    if (obj != f4752c) {
                        if (obj != t) {
                            String valueOf = String.valueOf(obj);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f4754b = t;
                    this.f4753a = null;
                }
            }
        }
        return t;
    }
}
