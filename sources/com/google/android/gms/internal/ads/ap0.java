package com.google.android.gms.internal.ads;

import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ap0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final uo0 f1800b;

    /* renamed from: c  reason: collision with root package name */
    private final le1 f1801c;
    private final g6 d;
    private final List e;
    private final String f;

    ap0(uo0 uo0, le1 le1, g6 g6Var, List list, String str) {
        this.f1800b = uo0;
        this.f1801c = le1;
        this.d = g6Var;
        this.e = list;
        this.f = str;
    }

    public final void run() {
        this.f1800b.a(this.f1801c, this.d, this.e, this.f);
    }
}
