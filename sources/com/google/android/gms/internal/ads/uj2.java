package com.google.android.gms.internal.ads;

import b.c.b.a.c.b;
import com.google.android.gms.common.internal.c;

/* access modifiers changed from: package-private */
public final class uj2 implements c.b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ro f4967a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ oj2 f4968b;

    uj2(oj2 oj2, ro roVar) {
        this.f4968b = oj2;
        this.f4967a = roVar;
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void a(b bVar) {
        synchronized (oj2.b(this.f4968b)) {
            this.f4967a.a(new RuntimeException("Connection failed."));
        }
    }
}
