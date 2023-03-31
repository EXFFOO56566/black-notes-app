package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

public final class li0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f3557a;

    /* renamed from: b  reason: collision with root package name */
    private final nz f3558b;

    /* renamed from: c  reason: collision with root package name */
    private final za0 f3559c;

    li0(Executor executor, nz nzVar, za0 za0) {
        this.f3557a = executor;
        this.f3559c = za0;
        this.f3558b = nzVar;
    }

    public final void a(ws wsVar) {
        if (wsVar != null) {
            this.f3559c.a(wsVar.getView());
            this.f3559c.a(new oi0(wsVar), this.f3557a);
            this.f3559c.a(new ni0(wsVar), this.f3557a);
            this.f3559c.a(this.f3558b, this.f3557a);
            this.f3558b.a(wsVar);
            wsVar.b("/trackActiveViewUnit", new ri0(this));
            wsVar.b("/untrackActiveViewUnit", new qi0(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(ws wsVar, Map map) {
        this.f3558b.j();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(ws wsVar, Map map) {
        this.f3558b.l();
    }
}
