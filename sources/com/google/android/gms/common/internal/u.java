package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.a;

public class u<T extends IInterface> extends h<T> {
    private final a.h<T> z;

    public a.h<T> B() {
        return this.z;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public T a(IBinder iBinder) {
        return this.z.a(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public void b(int i, T t) {
        this.z.a(i, t);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public String c() {
        return this.z.c();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public String l() {
        return this.z.l();
    }
}
