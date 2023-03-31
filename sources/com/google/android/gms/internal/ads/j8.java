package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j8 implements u7 {

    /* renamed from: a  reason: collision with root package name */
    private final f8 f3187a;

    /* renamed from: b  reason: collision with root package name */
    private final w8 f3188b;

    /* renamed from: c  reason: collision with root package name */
    private final r7 f3189c;

    j8(f8 f8Var, w8 w8Var, r7 r7Var) {
        this.f3187a = f8Var;
        this.f3188b = w8Var;
        this.f3189c = r7Var;
    }

    @Override // com.google.android.gms.internal.ads.u7
    public final void a() {
        gl.h.postDelayed(new i8(this.f3187a, this.f3188b, this.f3189c), (long) q8.f4285b);
    }
}
