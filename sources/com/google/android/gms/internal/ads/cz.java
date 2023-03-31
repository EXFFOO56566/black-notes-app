package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.q;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class cz implements j9<gz> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2188a;

    /* renamed from: b  reason: collision with root package name */
    private final ah2 f2189b;

    /* renamed from: c  reason: collision with root package name */
    private final PowerManager f2190c;

    public cz(Context context, ah2 ah2) {
        this.f2188a = context;
        this.f2189b = ah2;
        this.f2190c = (PowerManager) context.getSystemService("power");
    }

    public final JSONObject a(gz gzVar) {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        hh2 hh2 = gzVar.e;
        if (hh2 == null) {
            jSONObject = new JSONObject();
        } else if (this.f2189b.d() != null) {
            boolean z = hh2.f2919a;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.f2189b.c()).put("activeViewJSON", this.f2189b.d()).put("timestamp", gzVar.f2832c).put("adFormat", this.f2189b.b()).put("hashCode", this.f2189b.e()).put("isMraid", false).put("isStopped", false).put("isPaused", gzVar.f2831b).put("isNative", this.f2189b.a()).put("isScreenOn", Build.VERSION.SDK_INT >= 20 ? this.f2190c.isInteractive() : this.f2190c.isScreenOn()).put("appMuted", q.h().b()).put("appVolume", (double) q.h().a()).put("deviceVolume", (double) yl.a(this.f2188a.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f2188a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", hh2.f2920b).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", hh2.f2921c.top).put("bottom", hh2.f2921c.bottom).put("left", hh2.f2921c.left).put("right", hh2.f2921c.right)).put("adBox", new JSONObject().put("top", hh2.d.top).put("bottom", hh2.d.bottom).put("left", hh2.d.left).put("right", hh2.d.right)).put("globalVisibleBox", new JSONObject().put("top", hh2.e.top).put("bottom", hh2.e.bottom).put("left", hh2.e.left).put("right", hh2.e.right)).put("globalVisibleBoxVisible", hh2.f).put("localVisibleBox", new JSONObject().put("top", hh2.g.top).put("bottom", hh2.g.bottom).put("left", hh2.g.left).put("right", hh2.g.right)).put("localVisibleBoxVisible", hh2.h).put("hitBox", new JSONObject().put("top", hh2.i.top).put("bottom", hh2.i.bottom).put("left", hh2.i.left).put("right", hh2.i.right)).put("screenDensity", (double) this.f2188a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", gzVar.f2830a);
            if (((Boolean) on2.e().a(zr2.F0)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = hh2.k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(gzVar.d)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
