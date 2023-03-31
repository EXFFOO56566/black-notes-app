package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class hq {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2962a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2963b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2964c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final int j;

    public hq(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f2962a = a(jSONObject, "aggressive_media_codec_release", zr2.y);
        this.f2963b = b(jSONObject, "byte_buffer_precache_limit", zr2.h);
        this.f2964c = b(jSONObject, "exo_cache_buffer_size", zr2.n);
        this.d = b(jSONObject, "exo_connect_timeout_millis", zr2.d);
        c(jSONObject, "exo_player_version", zr2.f5804c);
        this.e = b(jSONObject, "exo_read_timeout_millis", zr2.e);
        this.f = b(jSONObject, "load_check_interval_bytes", zr2.f);
        this.g = b(jSONObject, "player_precache_limit", zr2.g);
        this.h = b(jSONObject, "socket_receive_buffer_size", zr2.i);
        this.i = a(jSONObject, "use_cache_data_source", zr2.M1);
        this.j = b(jSONObject, "min_retry_count", zr2.k);
    }

    private static boolean a(JSONObject jSONObject, String str, kr2<Boolean> kr2) {
        return a(jSONObject, str, ((Boolean) on2.e().a(kr2)).booleanValue());
    }

    private static boolean a(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return z;
    }

    private static int b(JSONObject jSONObject, String str, kr2<Integer> kr2) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) on2.e().a(kr2)).intValue();
    }

    private static String c(JSONObject jSONObject, String str, kr2<String> kr2) {
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return (String) on2.e().a(kr2);
    }
}
