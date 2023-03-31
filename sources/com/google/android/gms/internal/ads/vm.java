package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class vm implements gq2 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f5131a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ wm f5132b;

    vm(tm tmVar, String str, wm wmVar) {
        this.f5131a = str;
        this.f5132b = wmVar;
    }

    @Override // com.google.android.gms.internal.ads.gq2
    public final void a(e3 e3Var) {
        String str = this.f5131a;
        String exc = e3Var.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(exc).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(exc);
        co.d(sb.toString());
        this.f5132b.a((Object) null);
    }
}
