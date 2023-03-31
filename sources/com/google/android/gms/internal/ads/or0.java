package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class or0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final lo1 f4033a;

    /* renamed from: b  reason: collision with root package name */
    private final lo1 f4034b;

    /* renamed from: c  reason: collision with root package name */
    private final lo1 f4035c;

    or0(lo1 lo1, lo1 lo12, lo1 lo13) {
        this.f4033a = lo1;
        this.f4034b = lo12;
        this.f4035c = lo13;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new bs0((is0) this.f4033a.get(), (JSONObject) this.f4034b.get(), (fg) this.f4035c.get());
    }
}
