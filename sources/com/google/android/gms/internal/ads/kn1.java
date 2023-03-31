package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.fn1;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

abstract class kn1<V, C> extends fn1<V, C> {
    private List<el1<V>> q;

    kn1(tl1<? extends lo1<? extends V>> tl1, boolean z) {
        super(tl1, true, true);
        this.q = tl1.isEmpty() ? ul1.k() : dm1.a(tl1.size());
        for (int i = 0; i < tl1.size(); i++) {
            this.q.add(null);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract C a(List<el1<V>> list);

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.fn1
    public final void a(int i, @NullableDecl V v) {
        List<el1<V>> list = this.q;
        if (list != null) {
            list.set(i, el1.a(v));
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.fn1
    public final void a(fn1.a aVar) {
        super.a(aVar);
        this.q = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.kn1<V, C> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.fn1
    public final void l() {
        List<el1<V>> list = this.q;
        if (list != null) {
            a(a((List) list));
        }
    }
}
