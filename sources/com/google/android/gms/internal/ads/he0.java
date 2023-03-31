package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.d;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class he0 implements sf0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2902a;

    /* renamed from: b  reason: collision with root package name */
    private final rf0 f2903b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f2904c;
    private final jj0 d;
    private final if0 e;
    private final eq1 f;
    private final m60 g;
    private final t50 h;
    private final id1 i;
    private final fo j;
    private final zd1 k;
    private final ez l;
    private final jg0 m;
    private final d n;
    private final za0 o;
    private final ci1 p;
    private boolean q = false;
    private boolean r;
    private boolean s = false;
    private boolean t = false;
    private Point u = new Point();
    private Point v = new Point();
    private long w = 0;
    private long x = 0;
    private yo2 y;

    public he0(Context context, rf0 rf0, JSONObject jSONObject, jj0 jj0, if0 if0, eq1 eq1, m60 m60, t50 t50, id1 id1, fo foVar, zd1 zd1, ez ezVar, jg0 jg0, d dVar, za0 za0, ci1 ci1) {
        this.f2902a = context;
        this.f2903b = rf0;
        this.f2904c = jSONObject;
        this.d = jj0;
        this.e = if0;
        this.f = eq1;
        this.g = m60;
        this.h = t50;
        this.i = id1;
        this.j = foVar;
        this.k = zd1;
        this.l = ezVar;
        this.m = jg0;
        this.n = dVar;
        this.o = za0;
        this.p = ci1;
    }

    private final void a(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        r.a("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f2904c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z3 = false;
            jSONObject7.put("has_custom_click_handler", this.f2903b.b(this.e.e()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.e.o());
            jSONObject8.put("view_aware_api_used", z);
            jSONObject8.put("custom_mute_requested", this.k.i != null && this.k.i.h);
            jSONObject8.put("custom_mute_enabled", !this.e.j().isEmpty() && this.e.r() != null);
            if (this.m.b() != null && this.f2904c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.n.a());
            if (this.t && d()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.f2903b.b(this.e.e()) != null) {
                z3 = true;
            }
            jSONObject8.put("has_custom_click_handler", z3);
            jSONObject8.put("click_signals", b(view));
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long a2 = this.n.a();
            jSONObject9.put("time_from_last_touch_down", a2 - this.w);
            jSONObject9.put("time_from_last_touch", a2 - this.x);
            jSONObject7.put("touch_signal", jSONObject9);
            no.a(this.d.a("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            co.b("Unable to create click JSON.", e2);
        }
    }

    private final boolean a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5) {
        r.a("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f2904c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) on2.e().a(zr2.p1)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            this.d.a("/logScionEvent", new je0(this));
            this.d.a("/nativeImpression", new ie0(this));
            no.a(this.d.a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            boolean z = this.q;
            if (z || this.i.z == null) {
                return true;
            }
            this.q = z | q.m().b(this.f2902a, this.j.f2633b, this.i.z.toString(), this.k.f);
            return true;
        } catch (JSONException e2) {
            co.b("Unable to create impression JSON.", e2);
            return false;
        }
    }

    private final String b(View view) {
        try {
            JSONObject optJSONObject = this.f2904c.optJSONObject("tracking_urls_and_actions");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            return this.f.a().a(this.f2902a, optJSONObject.optString("click_string"), view);
        } catch (Exception e2) {
            co.b("Exception obtaining click signals", e2);
            return null;
        }
    }

    private final String b(View view, Map<String, WeakReference<View>> map) {
        if (!(map == null || view == null)) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                if (view.equals(entry.getValue().get())) {
                    return entry.getKey();
                }
            }
        }
        int o2 = this.e.o();
        if (o2 == 1) {
            return "1099";
        }
        if (o2 == 2) {
            return "2099";
        }
        if (o2 != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean b(String str) {
        JSONObject optJSONObject = this.f2904c.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    private final String c(View view) {
        if (!((Boolean) on2.e().a(zr2.p1)).booleanValue()) {
            return null;
        }
        try {
            return this.f.a().a(this.f2902a, view, (Activity) null);
        } catch (Exception unused) {
            co.b("Exception getting data.");
            return null;
        }
    }

    private final boolean d() {
        return this.f2904c.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void X() {
        if (this.f2904c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.m.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a() {
        r.a("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f2904c);
            no.a(this.d.a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e2) {
            co.b(BuildConfig.FLAVOR, e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(Bundle bundle) {
        if (bundle == null) {
            co.a("Click data is null. No click is reported.");
        } else if (!b("click_reporting")) {
            co.b("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            a(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, q.c().a(bundle, (JSONObject) null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(View view) {
        if (!this.f2904c.optBoolean("custom_one_point_five_click_enabled", false)) {
            co.d("setClickConfirmingView: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            return;
        }
        jg0 jg0 = this.m;
        if (view != null) {
            view.setOnClickListener(jg0);
            view.setClickable(true);
            jg0.h = new WeakReference<>(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(View view, MotionEvent motionEvent, View view2) {
        this.u = gn.a(motionEvent, view2);
        long a2 = this.n.a();
        this.x = a2;
        if (motionEvent.getAction() == 0) {
            this.w = a2;
            this.v = this.u;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.u;
        obtain.setLocation((float) point.x, (float) point.y);
        this.f.a(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        JSONObject a2 = gn.a(this.f2902a, map, map2, view2);
        JSONObject a3 = gn.a(this.f2902a, view2);
        JSONObject a4 = gn.a(view2);
        JSONObject b2 = gn.b(this.f2902a, view2);
        String b3 = b(view, map);
        a(view, a3, a2, a4, b2, b3, gn.a(b3, this.f2902a, this.v, this.u), null, z, false);
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(View view, Map<String, WeakReference<View>> map) {
        this.u = new Point();
        this.v = new Point();
        this.o.b(view);
        this.r = false;
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        a(gn.a(this.f2902a, view), gn.a(this.f2902a, map, map2, view), gn.a(view), gn.b(this.f2902a, view), c(view), null);
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.u = new Point();
        this.v = new Point();
        if (!this.r) {
            this.o.a(view);
            this.r = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.l.a(this);
        boolean a2 = gn.a(this.j.d);
        if (map != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view2 = entry.getValue().get();
                if (view2 != null) {
                    if (a2) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry<String, WeakReference<View>> entry2 : map2.entrySet()) {
                View view3 = entry2.getValue().get();
                if (view3 != null) {
                    if (a2) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.t) {
            co.a("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!d()) {
            co.a("Custom click reporting failed. Ad unit id not whitelisted.");
        } else {
            JSONObject a2 = gn.a(this.f2902a, map, map2, view);
            JSONObject a3 = gn.a(this.f2902a, view);
            JSONObject a4 = gn.a(view);
            JSONObject b2 = gn.b(this.f2902a, view);
            String b3 = b(null, map);
            a(view, a3, a2, a4, b2, b3, gn.a(b3, this.f2902a, this.v, this.u), null, z, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(cp2 cp2) {
        try {
            if (!this.s) {
                if (cp2 != null || this.e.r() == null) {
                    this.s = true;
                    this.p.a(cp2.B1());
                    c();
                    return;
                }
                this.s = true;
                this.p.a(this.e.r().B1());
                c();
            }
        } catch (RemoteException e2) {
            co.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(v3 v3Var) {
        if (!this.f2904c.optBoolean("custom_one_point_five_click_enabled", false)) {
            co.d("setUnconfirmedClickListener: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
        } else {
            this.m.a(v3Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(yo2 yo2) {
        this.y = yo2;
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void a(String str) {
        a(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void b() {
        a(null, null, null, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void b(Bundle bundle) {
        if (bundle == null) {
            co.a("Touch event data is null. No touch event is reported.");
        } else if (!b("touch_reporting")) {
            co.b("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        } else {
            int i2 = bundle.getInt("duration_ms");
            this.f.a().a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void c() {
        try {
            if (this.y != null) {
                this.y.Y0();
            }
        } catch (RemoteException e2) {
            co.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final boolean c(Bundle bundle) {
        if (b("impression_reporting")) {
            return a(null, null, null, null, null, q.c().a(bundle, (JSONObject) null));
        }
        co.b("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void destroy() {
        this.d.a();
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final void i0() {
        this.t = true;
    }

    @Override // com.google.android.gms.internal.ads.sf0
    public final boolean n0() {
        return d();
    }
}
