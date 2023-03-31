package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

public final class p60 extends j90<q60> {
    public p60(Set<ab0<q60>> set) {
        super(set);
    }

    public final void a(Context context) {
        a(new s60(context));
    }

    public final void a(rb0 rb0, Executor executor) {
        a(ab0.a(new t60(this, rb0), executor));
    }

    public final void b(Context context) {
        a(new r60(context));
    }

    public final void d(Context context) {
        a(new u60(context));
    }
}
