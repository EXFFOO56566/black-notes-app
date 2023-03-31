package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public final class nz implements fh2 {

    /* renamed from: b  reason: collision with root package name */
    private ws f3913b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f3914c;
    private final cz d;
    private final d e;
    private boolean f = false;
    private boolean g = false;
    private gz h = new gz();

    public nz(Executor executor, cz czVar, d dVar) {
        this.f3914c = executor;
        this.d = czVar;
        this.e = dVar;
    }

    private final void p() {
        try {
            JSONObject a2 = this.d.a(this.h);
            if (this.f3913b != null) {
                this.f3914c.execute(new rz(this, a2));
            }
        } catch (JSONException e2) {
            wk.e("Failed to call video active view js", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.fh2
    public final void a(hh2 hh2) {
        this.h.f2830a = this.g ? false : hh2.j;
        this.h.f2832c = this.e.b();
        this.h.e = hh2;
        if (this.f) {
            p();
        }
    }

    public final void a(ws wsVar) {
        this.f3913b = wsVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(JSONObject jSONObject) {
        this.f3913b.b("AFMA_updateActiveView", jSONObject);
    }

    public final void a(boolean z) {
        this.g = z;
    }

    public final void j() {
        this.f = false;
    }

    public final void l() {
        this.f = true;
        p();
    }
}
