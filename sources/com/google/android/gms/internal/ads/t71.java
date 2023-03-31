package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

public final class t71 implements y61<q71> {

    /* renamed from: a  reason: collision with root package name */
    private final dk f4763a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f4764b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4765c;
    private final PackageInfo d;

    public t71(dk dkVar, Executor executor, String str, PackageInfo packageInfo) {
        this.f4763a = dkVar;
        this.f4764b = executor;
        this.f4765c = str;
        this.d = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<q71> a() {
        return yn1.a(yn1.a(this.f4763a.a(this.f4765c, this.d), s71.f4608a, this.f4764b), Throwable.class, new v71(this), this.f4764b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(Throwable th) {
        return yn1.a(new q71(this.f4765c));
    }
}
