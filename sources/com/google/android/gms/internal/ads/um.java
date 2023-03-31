package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
public final class um extends fl {
    private final /* synthetic */ byte[] q;
    private final /* synthetic */ Map r;
    private final /* synthetic */ wn s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    um(tm tmVar, int i, String str, c0 c0Var, gq2 gq2, byte[] bArr, Map map, wn wnVar) {
        super(i, str, c0Var, gq2);
        this.q = bArr;
        this.r = map;
        this.s = wnVar;
    }

    @Override // com.google.android.gms.internal.ads.gh2
    public final Map<String, String> b() {
        Map<String, String> map = this.r;
        return map == null ? super.b() : map;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.fl
    /* renamed from: c */
    public final void a(String str) {
        this.s.a(str);
        super.c(str);
    }

    @Override // com.google.android.gms.internal.ads.gh2
    public final byte[] m() {
        byte[] bArr = this.q;
        return bArr == null ? super.m() : bArr;
    }
}
