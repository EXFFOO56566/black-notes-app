package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.c;

/* access modifiers changed from: package-private */
public final class v implements c.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ f f1593a;

    v(f fVar) {
        this.f1593a = fVar;
    }

    @Override // com.google.android.gms.common.api.internal.c.a
    public final void a(boolean z) {
        this.f1593a.n.sendMessage(this.f1593a.n.obtainMessage(1, Boolean.valueOf(z)));
    }
}
