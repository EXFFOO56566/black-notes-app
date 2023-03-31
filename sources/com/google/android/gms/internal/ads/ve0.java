package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import b.c.b.a.d.a;
import b.c.b.a.d.b;

public final class ve0 extends t1 {

    /* renamed from: b  reason: collision with root package name */
    private final if0 f5099b;

    /* renamed from: c  reason: collision with root package name */
    private a f5100c;

    public ve0(if0 if0) {
        this.f5099b = if0;
    }

    private static float Q(a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) b.Q(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
    }

    private final float b2() {
        try {
            return this.f5099b.n().Q();
        } catch (RemoteException e) {
            co.b("Remote exception getting video controller aspect ratio.", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final float H() {
        if (((Boolean) on2.e().a(zr2.d3)).booleanValue() && this.f5099b.n() != null) {
            return this.f5099b.n().H();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final float N() {
        if (((Boolean) on2.e().a(zr2.d3)).booleanValue() && this.f5099b.n() != null) {
            return this.f5099b.n().N();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final float Q() {
        if (!((Boolean) on2.e().a(zr2.c3)).booleanValue()) {
            return 0.0f;
        }
        if (this.f5099b.i() != 0.0f) {
            return this.f5099b.i();
        }
        if (this.f5099b.n() != null) {
            return b2();
        }
        a aVar = this.f5100c;
        if (aVar != null) {
            return Q(aVar);
        }
        v1 q = this.f5099b.q();
        if (q == null) {
            return 0.0f;
        }
        float width = (q == null || q.getWidth() == -1 || q.getHeight() == -1) ? 0.0f : ((float) q.getWidth()) / ((float) q.getHeight());
        return width != 0.0f ? width : Q(q.l1());
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void a(j3 j3Var) {
        if (((Boolean) on2.e().a(zr2.d3)).booleanValue() && (this.f5099b.n() instanceof rt)) {
            ((rt) this.f5099b.n()).a(j3Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final boolean c1() {
        return ((Boolean) on2.e().a(zr2.d3)).booleanValue() && this.f5099b.n() != null;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final rp2 getVideoController() {
        if (!((Boolean) on2.e().a(zr2.d3)).booleanValue()) {
            return null;
        }
        return this.f5099b.n();
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void n(a aVar) {
        if (((Boolean) on2.e().a(zr2.w1)).booleanValue()) {
            this.f5100c = aVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final a x1() {
        a aVar = this.f5100c;
        if (aVar != null) {
            return aVar;
        }
        v1 q = this.f5099b.q();
        if (q == null) {
            return null;
        }
        return q.l1();
    }
}
