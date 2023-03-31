package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class tj0<T> implements d5<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<T> f4820a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4821b;

    /* renamed from: c  reason: collision with root package name */
    private final d5<T> f4822c;
    private final /* synthetic */ jj0 d;

    private tj0(jj0 jj0, WeakReference<T> weakReference, String str, d5<T> d5Var) {
        this.d = jj0;
        this.f4820a = weakReference;
        this.f4821b = str;
        this.f4822c = d5Var;
    }

    /* synthetic */ tj0(jj0 jj0, WeakReference weakReference, String str, d5 d5Var, kj0 kj0) {
        this(jj0, weakReference, str, d5Var);
    }

    @Override // com.google.android.gms.internal.ads.d5
    public final void a(Object obj, Map<String, String> map) {
        T t = this.f4820a.get();
        if (t == null) {
            this.d.b(this.f4821b, this);
        } else {
            this.f4822c.a(t, map);
        }
    }
}
