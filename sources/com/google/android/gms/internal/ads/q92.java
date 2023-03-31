package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class q92 implements l92 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ o92 f4296a;

    private q92(o92 o92) {
        this.f4296a = o92;
    }

    @Override // com.google.android.gms.internal.ads.l92
    public final void a() {
        o92.o();
        this.f4296a.d0 = true;
    }

    @Override // com.google.android.gms.internal.ads.l92
    public final void a(int i) {
        this.f4296a.V.a(i);
        o92.b(i);
    }

    @Override // com.google.android.gms.internal.ads.l92
    public final void a(int i, long j, long j2) {
        this.f4296a.V.a(i, j, j2);
        o92.a(i, j, j2);
    }
}
