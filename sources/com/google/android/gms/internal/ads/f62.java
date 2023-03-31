package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ba0;
import java.util.concurrent.Callable;

public final class f62 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final l52 f2542a;

    /* renamed from: b  reason: collision with root package name */
    private final ba0.a f2543b;

    public f62(l52 l52, ba0.a aVar) {
        this.f2542a = l52;
        this.f2543b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void call() {
        if (this.f2542a.n() != null) {
            this.f2542a.n().get();
        }
        ba0 m = this.f2542a.m();
        if (m == null) {
            return null;
        }
        try {
            synchronized (this.f2543b) {
                ba0.a aVar = this.f2543b;
                byte[] f = m.f();
                aVar.a(f, 0, f.length, dz1.b());
            }
            return null;
        } catch (b02 unused) {
            return null;
        }
    }
}
