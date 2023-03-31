package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;
import java.util.Collections;

public final class vi0 extends u6 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, j1 {

    /* renamed from: b  reason: collision with root package name */
    private View f5120b;

    /* renamed from: c  reason: collision with root package name */
    private rp2 f5121c;
    private xe0 d;
    private boolean e = false;
    private boolean f = false;

    public vi0(xe0 xe0, if0 if0) {
        this.f5120b = if0.s();
        this.f5121c = if0.n();
        this.d = xe0;
        if (if0.t() != null) {
            if0.t().a(this);
        }
    }

    private static void a(w6 w6Var, int i) {
        try {
            w6Var.e(i);
        } catch (RemoteException e2) {
            co.d("#007 Could not call remote method.", e2);
        }
    }

    private final void c2() {
        View view = this.f5120b;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f5120b);
            }
        }
    }

    private final void d2() {
        View view;
        xe0 xe0 = this.d;
        if (xe0 != null && (view = this.f5120b) != null) {
            xe0.a(view, Collections.emptyMap(), Collections.emptyMap(), xe0.d(this.f5120b));
        }
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void E0() {
        gl.h.post(new ui0(this));
    }

    @Override // com.google.android.gms.internal.ads.s6
    public final void a(a aVar, w6 w6Var) {
        r.a("#008 Must be called on the main UI thread.");
        if (this.e) {
            co.b("Instream ad can not be shown after destroy().");
            a(w6Var, 2);
        } else if (this.f5120b == null || this.f5121c == null) {
            String str = this.f5120b == null ? "can not get video view." : "can not get video controller.";
            co.b(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
            a(w6Var, 0);
        } else if (this.f) {
            co.b("Instream ad should not be used again.");
            a(w6Var, 1);
        } else {
            this.f = true;
            c2();
            ((ViewGroup) b.Q(aVar)).addView(this.f5120b, new ViewGroup.LayoutParams(-1, -1));
            q.z();
            zo.a(this.f5120b, (ViewTreeObserver.OnGlobalLayoutListener) this);
            q.z();
            zo.a(this.f5120b, (ViewTreeObserver.OnScrollChangedListener) this);
            d2();
            try {
                w6Var.W0();
            } catch (RemoteException e2) {
                co.d("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s6
    public final u1 b0() {
        r.a("#008 Must be called on the main UI thread.");
        if (this.e) {
            co.b("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        xe0 xe0 = this.d;
        if (xe0 == null || xe0.l() == null) {
            return null;
        }
        return this.d.l().a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b2() {
        try {
            destroy();
        } catch (RemoteException e2) {
            co.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.s6
    public final void destroy() {
        r.a("#008 Must be called on the main UI thread.");
        c2();
        xe0 xe0 = this.d;
        if (xe0 != null) {
            xe0.a();
        }
        this.d = null;
        this.f5120b = null;
        this.f5121c = null;
        this.e = true;
    }

    @Override // com.google.android.gms.internal.ads.s6
    public final rp2 getVideoController() {
        r.a("#008 Must be called on the main UI thread.");
        if (!this.e) {
            return this.f5121c;
        }
        co.b("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.s6
    public final void o(a aVar) {
        r.a("#008 Must be called on the main UI thread.");
        a(aVar, new xi0(this));
    }

    public final void onGlobalLayout() {
        d2();
    }

    public final void onScrollChanged() {
        d2();
    }
}
