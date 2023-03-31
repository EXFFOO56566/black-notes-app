package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class l7 {
    public static void a(m7 m7Var, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        m7Var.a(sb.toString());
    }

    public static void a(m7 m7Var, String str, Map map) {
        try {
            m7Var.a(str, q.c().a(map));
        } catch (JSONException unused) {
            co.d("Could not convert parameters to JSON.");
        }
    }

    public static void a(m7 m7Var, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        m7Var.a(str, jSONObject.toString());
    }

    public static void b(m7 m7Var, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        co.a(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        m7Var.a(sb.toString());
    }
}
