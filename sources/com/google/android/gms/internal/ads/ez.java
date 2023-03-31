package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.o;
import com.google.android.gms.common.util.d;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

public final class ez implements o, n60, q60, fh2 {

    /* renamed from: b  reason: collision with root package name */
    private final vy f2504b;

    /* renamed from: c  reason: collision with root package name */
    private final cz f2505c;
    private final Set<ws> d = new HashSet();
    private final da<JSONObject, JSONObject> e;
    private final Executor f;
    private final d g;
    private final AtomicBoolean h = new AtomicBoolean(false);
    @GuardedBy("this")
    private final gz i = new gz();
    private boolean j = false;
    private WeakReference<?> k = new WeakReference<>(this);

    public ez(v9 v9Var, cz czVar, Executor executor, vy vyVar, d dVar) {
        this.f2504b = vyVar;
        m9<JSONObject> m9Var = l9.f3510b;
        this.e = v9Var.a("google.afma.activeView.handleUpdate", m9Var, m9Var);
        this.f2505c = czVar;
        this.f = executor;
        this.g = dVar;
    }

    private final void s() {
        for (ws wsVar : this.d) {
            this.f2504b.b(wsVar);
        }
        this.f2504b.a();
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void I() {
    }

    @Override // com.google.android.gms.internal.ads.n60
    public final synchronized void K() {
        if (this.h.compareAndSet(false, true)) {
            this.f2504b.a(this);
            j();
        }
    }

    @Override // com.google.android.gms.internal.ads.q60
    public final synchronized void a(Context context) {
        this.i.d = "u";
        j();
        s();
        this.j = true;
    }

    @Override // com.google.android.gms.internal.ads.fh2
    public final synchronized void a(hh2 hh2) {
        this.i.f2830a = hh2.j;
        this.i.e = hh2;
        j();
    }

    public final synchronized void a(ws wsVar) {
        this.d.add(wsVar);
        this.f2504b.a(wsVar);
    }

    public final void a(Object obj) {
        this.k = new WeakReference<>(obj);
    }

    @Override // com.google.android.gms.internal.ads.q60
    public final synchronized void b(Context context) {
        this.i.f2831b = false;
        j();
    }

    @Override // com.google.android.gms.internal.ads.q60
    public final synchronized void d(Context context) {
        this.i.f2831b = true;
        j();
    }

    public final synchronized void j() {
        if (!(this.k.get() != null)) {
            l();
            return;
        }
        if (!this.j && this.h.get()) {
            try {
                this.i.f2832c = this.g.b();
                JSONObject a2 = this.f2505c.a(this.i);
                for (ws wsVar : this.d) {
                    this.f.execute(new dz(wsVar, a2));
                }
                no.b(this.e.a(a2), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e2) {
                wk.e("Failed to call ActiveViewJS", e2);
            }
        }
    }

    public final synchronized void l() {
        s();
        this.j = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final synchronized void onPause() {
        this.i.f2831b = true;
        j();
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final synchronized void onResume() {
        this.i.f2831b = false;
        j();
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void p() {
    }
}
