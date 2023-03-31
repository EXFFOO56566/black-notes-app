package com.google.android.gms.internal.ads;

import java.util.Map;

public final class ym extends gh2<ef2> {
    private final ro<ef2> o;
    private final wn p;

    public ym(String str, ro<ef2> roVar) {
        this(str, null, roVar);
    }

    private ym(String str, Map<String, String> map, ro<ef2> roVar) {
        super(0, str, new xm(roVar));
        this.o = roVar;
        wn wnVar = new wn();
        this.p = wnVar;
        wnVar.a(str, "GET", null, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gh2
    public final ar2<ef2> a(ef2 ef2) {
        return ar2.a(ef2, qg.a(ef2));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gh2
    public final /* synthetic */ void a(ef2 ef2) {
        ef2 ef22 = ef2;
        this.p.a(ef22.f2419c, ef22.f2417a);
        wn wnVar = this.p;
        byte[] bArr = ef22.f2418b;
        if (wn.a() && bArr != null) {
            wnVar.a(bArr);
        }
        this.o.b(ef22);
    }
}
