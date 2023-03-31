package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ph0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4174a;

    /* renamed from: b  reason: collision with root package name */
    private final jh0 f4175b;

    /* renamed from: c  reason: collision with root package name */
    private final eq1 f4176c;
    private final fo d;
    private final a e;
    private final wj2 f;
    private final Executor g;
    private final m1 h;
    private final gi0 i;
    private final ScheduledExecutorService j;

    public ph0(Context context, jh0 jh0, eq1 eq1, fo foVar, a aVar, wj2 wj2, Executor executor, zd1 zd1, gi0 gi0, ScheduledExecutorService scheduledExecutorService) {
        this.f4174a = context;
        this.f4175b = jh0;
        this.f4176c = eq1;
        this.d = foVar;
        this.e = aVar;
        this.f = wj2;
        this.g = executor;
        this.h = zd1.i;
        this.i = gi0;
        this.j = scheduledExecutorService;
    }

    private static <T> lo1<T> a(lo1<T> lo1, T t) {
        return yn1.a(lo1, Exception.class, new vh0(null), jo.f);
    }

    private final lo1<List<i1>> a(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return yn1.a((Object) Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(a(jSONArray.optJSONObject(i2), z));
        }
        return yn1.a(yn1.a((Iterable) arrayList), sh0.f4656a, this.g);
    }

    private final lo1<i1> a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return yn1.a((Object) null);
        }
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return yn1.a((Object) null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return yn1.a(new i1(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return a(jSONObject.optBoolean("require"), yn1.a(this.f4175b.a(optString, optDouble, optBoolean), new rh0(optString, optDouble, optInt, optInt2), this.g), (Object) null);
    }

    private static <T> lo1<T> a(boolean z, lo1<T> lo1, T t) {
        return z ? yn1.a(lo1, new yh0(lo1), jo.f) : a(lo1, (Object) null);
    }

    public static List<lq2> b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return Collections.emptyList();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            lq2 d2 = d(optJSONArray.optJSONObject(i2));
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        return arrayList;
    }

    public static lq2 c(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return d(optJSONObject);
    }

    private static lq2 d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new lq2(optString, optString2);
    }

    private static Integer d(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h1 a(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer d2 = d(jSONObject, "bg_color");
        Integer d3 = d(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new h1(optString, list, d2, d3, num, optInt3 + optInt2, this.h.f, optBoolean);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(String str, Object obj) {
        q.d();
        ws a2 = et.a(this.f4174a, lu.f(), "native-omid", false, false, this.f4176c, this.d, null, null, this.e, this.f, null, false);
        so c2 = so.c(a2);
        a2.P().a(new xh0(c2));
        a2.loadData(str, "text/html", "UTF-8");
        return c2;
    }

    public final lo1<ws> a(JSONObject jSONObject) {
        JSONObject a2 = an.a(jSONObject, "html_containers", "instream");
        if (a2 == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return yn1.a((Object) null);
            }
            if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
                co.d("Required field 'vast_xml' is missing");
                return yn1.a((Object) null);
            }
            return a(yn1.a(this.i.a(optJSONObject), (long) ((Integer) on2.e().a(zr2.u1)).intValue(), TimeUnit.SECONDS, this.j), (Object) null);
        }
        lo1<ws> a3 = this.i.a(a2.optString("base_url"), a2.optString("html"));
        return yn1.a(a3, new wh0(a3), jo.f);
    }

    public final lo1<i1> a(JSONObject jSONObject, String str) {
        return a(jSONObject.optJSONObject(str), this.h.f3639c);
    }

    public final lo1<List<i1>> b(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        m1 m1Var = this.h;
        return a(optJSONArray, m1Var.f3639c, m1Var.e);
    }

    public final lo1<h1> c(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return yn1.a((Object) null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return a(optJSONObject.optBoolean("require"), yn1.a(a(optJSONArray, false, true), new uh0(this, optJSONObject), this.g), (Object) null);
    }
}
