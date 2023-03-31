package b.c.b.a.e.f;

import android.os.Bundle;
import b.c.b.a.e.f.i0;

/* access modifiers changed from: package-private */
public final class r extends i0.a {
    private final /* synthetic */ Long f;
    private final /* synthetic */ String g;
    private final /* synthetic */ String h;
    private final /* synthetic */ Bundle i;
    private final /* synthetic */ boolean j;
    private final /* synthetic */ boolean k;
    private final /* synthetic */ i0 l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    r(i0 i0Var, Long l2, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(i0Var);
        this.l = i0Var;
        this.f = l2;
        this.g = str;
        this.h = str2;
        this.i = bundle;
        this.j = z;
        this.k = z2;
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.e.f.i0.a
    public final void a() {
        Long l2 = this.f;
        this.l.i.a(this.g, this.h, this.i, this.j, this.k, l2 == null ? this.f1207b : l2.longValue());
    }
}
