package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class qc1 implements zn1<ck0> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ f01 f4311a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ uc1 f4312b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ pc1 f4313c;

    qc1(pc1 pc1, f01 f01, uc1 uc1) {
        this.f4313c = pc1;
        this.f4311a = f01;
        this.f4312b = uc1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zn1
    public final /* synthetic */ void a(ck0 ck0) {
        ck0 ck02 = ck0;
        synchronized (this.f4313c) {
            this.f4311a.a(ck02);
            this.f4313c.d.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        synchronized (this.f4313c) {
            fk0 fk0 = (fk0) this.f4313c.e.a();
            if (fk0 != null) {
                fk0.d().a(gp0.a(th));
            } else {
                this.f4313c.d.a(gp0.a(th));
                this.f4313c.a(this.f4312b).b().a().c().C();
            }
            ie1.a(th, "RewardedAdLoader.onFailure");
            this.f4311a.a();
        }
    }
}
