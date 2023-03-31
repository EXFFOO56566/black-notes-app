package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.e;

final class qy0 implements e {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ro f4415a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ vd1 f4416b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ id1 f4417c;
    private final /* synthetic */ wy0 d;
    private final /* synthetic */ oy0 e;

    qy0(oy0 oy0, ro roVar, vd1 vd1, id1 id1, wy0 wy0) {
        this.e = oy0;
        this.f4415a = roVar;
        this.f4416b = vd1;
        this.f4417c = id1;
        this.d = wy0;
    }

    @Override // com.google.android.gms.ads.internal.e
    public final void a() {
    }

    @Override // com.google.android.gms.ads.internal.e
    public final void a(View view) {
        this.f4415a.b(this.e.d.a(this.f4416b, this.f4417c, view, this.d));
    }

    @Override // com.google.android.gms.ads.internal.e
    public final void b() {
    }
}
