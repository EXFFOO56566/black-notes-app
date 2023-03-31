package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* access modifiers changed from: package-private */
public final class a6 implements ln1<v5, ParcelFileDescriptor> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ p5 f1704a;

    a6(x5 x5Var, p5 p5Var) {
        this.f1704a = p5Var;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.lo1' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.ln1
    public final /* synthetic */ lo1<ParcelFileDescriptor> a(v5 v5Var) {
        ro roVar = new ro();
        v5Var.a(this.f1704a, new z5(this, roVar));
        return roVar;
    }
}
