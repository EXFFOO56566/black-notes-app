package com.google.android.gms.internal.ads;

final class bd1 implements f01<ck0> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ cd1 f1924a;

    bd1(cd1 cd1) {
        this.f1924a = cd1;
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final void a() {
        synchronized (this.f1924a) {
            this.f1924a.e = null;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.f01
    public final /* synthetic */ void a(ck0 ck0) {
        ck0 ck02 = ck0;
        synchronized (this.f1924a) {
            this.f1924a.e = ck02;
            this.f1924a.e.b();
        }
    }
}
