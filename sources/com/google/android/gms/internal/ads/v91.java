package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class v91 implements zn1<h00> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ f01 f5070a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ u91 f5071b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ p91 f5072c;

    v91(p91 p91, f01 f01, u91 u91) {
        this.f5072c = p91;
        this.f5070a = f01;
        this.f5071b = u91;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zn1
    public final /* synthetic */ void a(h00 h00) {
        h00 h002 = h00;
        synchronized (this.f5072c) {
            this.f5072c.h = null;
            this.f5070a.a(h002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        synchronized (this.f5072c) {
            this.f5072c.h = null;
            b00 b00 = (b00) this.f5072c.e.a();
            if (b00 != null) {
                b00.d().a(gp0.a(th));
            } else {
                this.f5072c.d.a(gp0.a(th));
                this.f5072c.a(this.f5071b).d().a().c().C();
            }
            ie1.a(th, "AppOpenAdLoader.onFailure");
            this.f5070a.a();
        }
    }
}
