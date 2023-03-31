package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class aa2 implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f1733a;

    public aa2(Handler handler) {
        this.f1733a = new z82(this, handler);
    }

    @Override // com.google.android.gms.internal.ads.b
    public final void a(gh2<?> gh2, ar2<?> ar2) {
        a(gh2, ar2, null);
    }

    @Override // com.google.android.gms.internal.ads.b
    public final void a(gh2<?> gh2, ar2<?> ar2, Runnable runnable) {
        gh2.q();
        gh2.a("post-response");
        this.f1733a.execute(new cc2(gh2, ar2, runnable));
    }

    @Override // com.google.android.gms.internal.ads.b
    public final void a(gh2<?> gh2, e3 e3Var) {
        gh2.a("post-error");
        this.f1733a.execute(new cc2(gh2, ar2.a(e3Var), null));
    }
}
