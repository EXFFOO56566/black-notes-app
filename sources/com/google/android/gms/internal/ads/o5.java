package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class o5 implements d5<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final n5 f3945a;

    private o5(n5 n5Var) {
        this.f3945a = n5Var;
    }

    public static void a(ws wsVar, n5 n5Var) {
        wsVar.b("/reward", new o5(n5Var));
    }

    @Override // com.google.android.gms.internal.ads.d5
    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if ("grant".equals(str)) {
            uh uhVar = null;
            try {
                int parseInt = Integer.parseInt(map.get("amount"));
                String str2 = map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    uhVar = new uh(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                co.c("Unable to parse reward amount.", e);
            }
            this.f3945a.a(uhVar);
        } else if ("video_start".equals(str)) {
            this.f3945a.j();
        } else if ("video_complete".equals(str)) {
            this.f3945a.z();
        }
    }
}
