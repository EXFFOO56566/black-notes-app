package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* access modifiers changed from: package-private */
public final class ta1<R> implements gg1 {

    /* renamed from: a  reason: collision with root package name */
    public final ob1<R> f4773a;

    /* renamed from: b  reason: collision with root package name */
    public final nb1 f4774b;

    /* renamed from: c  reason: collision with root package name */
    public final rm2 f4775c;
    public final String d;
    public final Executor e;
    public final bn2 f;
    @Nullable
    private final uf1 g;

    public ta1(ob1<R> ob1, nb1 nb1, rm2 rm2, String str, Executor executor, bn2 bn2, @Nullable uf1 uf1) {
        this.f4773a = ob1;
        this.f4774b = nb1;
        this.f4775c = rm2;
        this.d = str;
        this.e = executor;
        this.f = bn2;
        this.g = uf1;
    }

    @Override // com.google.android.gms.internal.ads.gg1
    @Nullable
    public final uf1 a() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.gg1
    public final Executor b() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.gg1
    public final gg1 c() {
        return new ta1(this.f4773a, this.f4774b, this.f4775c, this.d, this.e, this.f, this.g);
    }
}
