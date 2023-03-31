package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final /* synthetic */ class wh0 implements ln1 {

    /* renamed from: a  reason: collision with root package name */
    private final lo1 f5271a;

    wh0(lo1 lo1) {
        this.f5271a = lo1;
    }

    @Override // com.google.android.gms.internal.ads.ln1
    public final lo1 a(Object obj) {
        lo1 lo1 = this.f5271a;
        ws wsVar = (ws) obj;
        if (wsVar != null && wsVar.i() != null) {
            return lo1;
        }
        throw new pw0("Retrieve video view in instream ad response failed.", 0);
    }
}
