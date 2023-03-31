package com.google.android.gms.internal.ads;

import android.net.Uri;

final /* synthetic */ class mu0 implements ln1 {

    /* renamed from: a  reason: collision with root package name */
    private final ju0 f3755a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f3756b;

    /* renamed from: c  reason: collision with root package name */
    private final vd1 f3757c;
    private final id1 d;

    mu0(ju0 ju0, Uri uri, vd1 vd1, id1 id1) {
        this.f3755a = ju0;
        this.f3756b = uri;
        this.f3757c = vd1;
        this.d = id1;
    }

    @Override // com.google.android.gms.internal.ads.ln1
    public final lo1 a(Object obj) {
        return this.f3755a.a(this.f3756b, this.f3757c, this.d, obj);
    }
}
