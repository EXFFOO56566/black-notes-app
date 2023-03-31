package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;

/* access modifiers changed from: package-private */
public final class hg0 implements k1 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ xg0 f2914a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ViewGroup f2915b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ gg0 f2916c;

    hg0(gg0 gg0, xg0 xg0, ViewGroup viewGroup) {
        this.f2916c = gg0;
        this.f2914a = xg0;
        this.f2915b = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void a() {
        gg0 gg0 = this.f2916c;
        if (gg0.a(this.f2914a, eg0.o)) {
            this.f2914a.onClick(this.f2915b);
        }
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void a(MotionEvent motionEvent) {
        this.f2914a.onTouch(null, motionEvent);
    }
}
