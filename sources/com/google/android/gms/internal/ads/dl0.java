package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final /* synthetic */ class dl0 implements iu {

    /* renamed from: a  reason: collision with root package name */
    private final ro f2273a;

    dl0(ro roVar) {
        this.f2273a = roVar;
    }

    @Override // com.google.android.gms.internal.ads.iu
    public final void a(boolean z) {
        ro roVar = this.f2273a;
        if (z) {
            roVar.b(null);
        } else {
            roVar.a(new Exception("Ad Web View failed to load."));
        }
    }
}
