package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class pr0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final lo1 f4222a;

    /* renamed from: b  reason: collision with root package name */
    private final lo1 f4223b;

    pr0(lo1 lo1, lo1 lo12) {
        this.f4222a = lo1;
        this.f4223b = lo12;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new fs0((JSONObject) this.f4222a.get(), (fg) this.f4223b.get());
    }
}
