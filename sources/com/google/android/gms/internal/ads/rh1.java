package com.google.android.gms.internal.ads;

import java.util.Set;

final class rh1 extends j90<zh1> implements qh1<ph1> {
    rh1(Set<ab0<zh1>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final void a(bh1<ph1, ?> bh1) {
        a(new uh1(bh1));
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final void a(bh1<ph1, ?> bh1, Throwable th) {
        a(new wh1(bh1, th));
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final void b(bh1<ph1, ?> bh1) {
        a(new vh1(bh1));
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final void c(bh1<ph1, ?> bh1) {
        a(new th1(bh1));
    }
}
