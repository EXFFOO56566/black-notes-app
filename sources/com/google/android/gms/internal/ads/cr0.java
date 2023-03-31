package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cr0 implements ln1 {

    /* renamed from: a  reason: collision with root package name */
    static final ln1 f2157a = new cr0();

    private cr0() {
    }

    @Override // com.google.android.gms.internal.ads.ln1
    public final lo1 a(Object obj) {
        return yn1.a(((ExecutionException) obj).getCause());
    }
}
