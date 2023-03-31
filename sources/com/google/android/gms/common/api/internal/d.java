package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.u;

public abstract class d<R extends k, A extends a.b> extends BasePendingResult<R> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected d(a<?> aVar, f fVar) {
        super(fVar);
        r.a(fVar, "GoogleApiClient must not be null");
        r.a(aVar, "Api must not be null");
        aVar.a();
    }

    private void a(RemoteException remoteException) {
        c(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    /* access modifiers changed from: protected */
    public abstract void a(A a2);

    public final void b(A a2) {
        if (a2 instanceof u) {
            a2 = ((u) a2).B();
        }
        try {
            a(a2);
        } catch (DeadObjectException e) {
            a(e);
            throw e;
        } catch (RemoteException e2) {
            a(e2);
        }
    }

    /* access modifiers changed from: protected */
    public void b(R r) {
    }

    public final void c(Status status) {
        r.a(!status.i(), "Failed result must not be success");
        R a2 = a(status);
        a(a2);
        b(a2);
    }
}
