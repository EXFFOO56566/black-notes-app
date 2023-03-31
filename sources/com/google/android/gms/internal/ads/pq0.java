package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

public final class pq0 extends wf {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ qq0 f4219b;

    protected pq0(qq0 qq0) {
        this.f4219b = qq0;
    }

    @Override // com.google.android.gms.internal.ads.tf
    public final void a(ParcelFileDescriptor parcelFileDescriptor) {
        this.f4219b.f4374a.b(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // com.google.android.gms.internal.ads.tf
    public final void a(lm lmVar) {
        this.f4219b.f4374a.a(new km(lmVar.f3575b, lmVar.f3576c));
    }
}
