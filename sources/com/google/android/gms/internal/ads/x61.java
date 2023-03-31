package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

public final class x61<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<y61<? extends v61<T>>> f5371a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f5372b;

    public x61(Executor executor, Set<y61<? extends v61<T>>> set) {
        this.f5372b = executor;
        this.f5371a = set;
    }

    public final lo1<T> a(T t) {
        ArrayList arrayList = new ArrayList(this.f5371a.size());
        for (y61<? extends v61<T>> y61 : this.f5371a) {
            lo1<? extends v61<T>> a2 = y61.a();
            if (q0.f4253a.a().booleanValue()) {
                a2.a(new a71(y61, q.j().b()), jo.f);
            }
            arrayList.add(a2);
        }
        return yn1.c(arrayList).a(new z61(arrayList, t), this.f5372b);
    }
}
