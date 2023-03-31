package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.k;

/* access modifiers changed from: package-private */
public final class n extends p<Status> {
    n(f fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ k a(Status status) {
        return status;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.d
    public final /* synthetic */ void a(j jVar) {
        j jVar2 = jVar;
        ((v) jVar2.w()).a(new m(this), jVar2.B());
    }
}
