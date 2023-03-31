package com.google.android.gms.internal.ads;

import android.content.Context;

public final class jl0 implements q60 {

    /* renamed from: b  reason: collision with root package name */
    private final ws f3247b;

    jl0(ws wsVar) {
        this.f3247b = !((Boolean) on2.e().a(zr2.k0)).booleanValue() ? null : wsVar;
    }

    @Override // com.google.android.gms.internal.ads.q60
    public final void a(Context context) {
        ws wsVar = this.f3247b;
        if (wsVar != null) {
            wsVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.q60
    public final void b(Context context) {
        ws wsVar = this.f3247b;
        if (wsVar != null) {
            wsVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.q60
    public final void d(Context context) {
        ws wsVar = this.f3247b;
        if (wsVar != null) {
            wsVar.onPause();
        }
    }
}
