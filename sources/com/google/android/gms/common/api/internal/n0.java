package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import b.c.b.a.h.g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.f;

/* access modifiers changed from: package-private */
public abstract class n0<T> extends u {

    /* renamed from: a  reason: collision with root package name */
    protected final g<T> f1582a;

    public n0(int i, g<T> gVar) {
        super(i);
        this.f1582a = gVar;
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public void a(Status status) {
        this.f1582a.b(new b(status));
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void a(f.a<?> aVar) {
        try {
            d(aVar);
        } catch (DeadObjectException e) {
            a(e0.a(e));
            throw e;
        } catch (RemoteException e2) {
            a(e0.a(e2));
        } catch (RuntimeException e3) {
            a(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public void a(RuntimeException runtimeException) {
        this.f1582a.b(runtimeException);
    }

    /* access modifiers changed from: protected */
    public abstract void d(f.a<?> aVar);
}
