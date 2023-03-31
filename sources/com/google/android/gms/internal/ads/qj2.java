package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.c;

/* access modifiers changed from: package-private */
public final class qj2 implements c.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ij2 f4345a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ro f4346b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ oj2 f4347c;

    qj2(oj2 oj2, ij2 ij2, ro roVar) {
        this.f4347c = oj2;
        this.f4345a = ij2;
        this.f4346b = roVar;
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void b(int i) {
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void e(Bundle bundle) {
        synchronized (oj2.b(this.f4347c)) {
            if (!oj2.c(this.f4347c)) {
                oj2.a(this.f4347c, true);
                jj2 d = oj2.d(this.f4347c);
                if (d != null) {
                    this.f4346b.a(new sj2(this.f4346b, jo.f3256a.a(new tj2(this, d, this.f4345a, this.f4346b))), jo.f);
                }
            }
        }
    }
}
