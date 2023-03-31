package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.ads.internal.q;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class yg0 implements sf0 {

    /* renamed from: a  reason: collision with root package name */
    private final ab f5590a;

    /* renamed from: b  reason: collision with root package name */
    private final gb f5591b;

    /* renamed from: c  reason: collision with root package name */
    private final hb f5592c;
    private final m60 d;
    private final t50 e;
    private final Context f;
    private final id1 g;
    private final fo h;
    private final zd1 i;
    private boolean j = false;
    private boolean k = false;

    public yg0(ab abVar, gb gbVar, hb hbVar, m60 m60, t50 t50, Context context, id1 id1, fo foVar, zd1 zd1) {
        this.f5590a = abVar;
        this.f5591b = gbVar;
        this.f5592c = hbVar;
        this.d = m60;
        this.e = t50;
        this.f = context;
        this.g = id1;
        this.h = foVar;
        this.i = zd1;
    }

    private static HashMap<String, View> a(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view = entry.getValue().get();
                if (view != null) {
                    hashMap.put(entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    private final void b(View view) {
        try {
            if (this.f5592c != null && !this.f5592c.F()) {
                this.f5592c.b(b.a(view));
                this.e.l();
            } else if (this.f5590a != null && !this.f5590a.F()) {
                this.f5590a.b(b.a(view));
                this.e.l();
            } else if (this.f5591b != null && !this.f5591b.F()) {
                this.f5591b.b(b.a(view));
                this.e.l();
            }
        } catch (RemoteException e2) {
            co.c("Failed to call handleClick", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void X() {
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(View view) {
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.k || !this.g.D) {
            b(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(View view, Map<String, WeakReference<View>> map) {
        try {
            a a2 = b.a(view);
            if (this.f5592c != null) {
                this.f5592c.a(a2);
            } else if (this.f5590a != null) {
                this.f5590a.a(a2);
            } else if (this.f5591b != null) {
                this.f5591b.a(a2);
            }
        } catch (RemoteException e2) {
            co.c("Failed to call untrackView", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            if (!this.j && this.g.z != null) {
                this.j |= q.m().b(this.f, this.h.f2633b, this.g.z.toString(), this.i.f);
            }
            if (this.f5592c != null && !this.f5592c.E()) {
                this.f5592c.i();
                this.d.K();
            } else if (this.f5590a != null && !this.f5590a.E()) {
                this.f5590a.i();
                this.d.K();
            } else if (this.f5591b != null && !this.f5591b.E()) {
                this.f5591b.i();
                this.d.K();
            }
        } catch (RemoteException e2) {
            co.c("Failed to call recordImpression", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        try {
            a a2 = b.a(view);
            HashMap<String, View> a3 = a(map);
            HashMap<String, View> a4 = a(map2);
            if (this.f5592c != null) {
                this.f5592c.a(a2, b.a(a3), b.a(a4));
            } else if (this.f5590a != null) {
                this.f5590a.a(a2, b.a(a3), b.a(a4));
                this.f5590a.d(a2);
            } else if (this.f5591b != null) {
                this.f5591b.a(a2, b.a(a3), b.a(a4));
                this.f5591b.d(a2);
            }
        } catch (RemoteException e2) {
            co.c("Failed to call trackView", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        String str;
        if (!this.k) {
            str = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.";
        } else if (!this.g.D) {
            str = "Custom click reporting for 3p ads failed. Ad unit id not whitelisted.";
        } else {
            b(view);
            return;
        }
        co.d(str);
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(cp2 cp2) {
        co.d("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(v3 v3Var) {
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(yo2 yo2) {
        co.d("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(String str) {
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void b(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void c() {
        co.d("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final boolean c(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void destroy() {
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void i0() {
        this.k = true;
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final boolean n0() {
        return this.g.D;
    }
}
