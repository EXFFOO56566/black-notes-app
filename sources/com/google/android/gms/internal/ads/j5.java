package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class j5 implements d5<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f3175a = new Object();
    @GuardedBy("lock")

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, l5> f3176b = new HashMap();

    public final <EngineT extends c8> lo1<JSONObject> a(EngineT enginet, String str, JSONObject jSONObject) {
        ro roVar = new ro();
        q.c();
        String b2 = gl.b();
        a(b2, new m5(this, roVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", b2);
            jSONObject2.put("args", jSONObject);
            enginet.b(str, jSONObject2);
        } catch (Exception e) {
            roVar.a(e);
        }
        return roVar;
    }

    @Override // com.google.android.gms.internal.ads.d5
    public final void a(Object obj, Map<String, String> map) {
        String str;
        String str2 = map.get("id");
        String str3 = map.get("fail");
        String str4 = map.get("fail_reason");
        String str5 = map.get("fail_stack");
        String str6 = map.get("result");
        if (TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = BuildConfig.FLAVOR;
        } else {
            String valueOf = String.valueOf(str5);
            str = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.f3175a) {
            l5 remove = this.f3176b.remove(str2);
            if (remove == null) {
                String valueOf2 = String.valueOf(str2);
                co.d(valueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf2) : new String("Received result for unexpected method invocation: "));
            } else if (!TextUtils.isEmpty(str3)) {
                String valueOf3 = String.valueOf(str4);
                String valueOf4 = String.valueOf(str);
                remove.b(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str6 == null) {
                remove.a(null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (wk.a()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        wk.e(valueOf5.length() != 0 ? "Result GMSG: ".concat(valueOf5) : new String("Result GMSG: "));
                    }
                    remove.a(jSONObject);
                } catch (JSONException e) {
                    remove.b(e.getMessage());
                }
            }
        }
    }

    public final void a(String str, l5 l5Var) {
        synchronized (this.f3175a) {
            this.f3176b.put(str, l5Var);
        }
    }
}
