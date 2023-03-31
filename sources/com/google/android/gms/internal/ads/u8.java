package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class u8 implements vo<e9> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ s8 f4911a;

    u8(s8 s8Var) {
        this.f4911a = s8Var;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.vo
    public final /* synthetic */ void a(e9 e9Var) {
        wk.e("Releasing engine reference.");
        this.f4911a.d.d();
    }
}
