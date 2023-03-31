package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

public class wd {

    /* renamed from: a  reason: collision with root package name */
    private final ws f5253a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5254b;

    public wd(ws wsVar) {
        this(wsVar, BuildConfig.FLAVOR);
    }

    public wd(ws wsVar, String str) {
        this.f5253a = wsVar;
        this.f5254b = str;
    }

    public final void a(int i, int i2, int i3, int i4) {
        try {
            this.f5253a.a("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            co.b("Error occurred while dispatching size change.", e);
        }
    }

    public final void a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f5253a.a("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            co.b("Error occurred while obtaining screen information.", e);
        }
    }

    public final void a(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.f5254b);
            if (this.f5253a != null) {
                this.f5253a.a("onError", put);
            }
        } catch (JSONException e) {
            co.b("Error occurred while dispatching error event.", e);
        }
    }

    public final void b(int i, int i2, int i3, int i4) {
        try {
            this.f5253a.a("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            co.b("Error occurred while dispatching default position.", e);
        }
    }

    public final void b(String str) {
        try {
            this.f5253a.a("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            co.b("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void c(String str) {
        try {
            this.f5253a.a("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            co.b("Error occurred while dispatching state change.", e);
        }
    }
}
