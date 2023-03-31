package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import java.util.Map;

public final class f5 implements d5<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2533a;

    public f5(Context context) {
        this.f2533a = context;
    }

    @Override // com.google.android.gms.internal.ads.d5
    public final void a(Object obj, Map<String, String> map) {
        if (q.A().a(this.f2533a)) {
            String str = map.get("eventName");
            String str2 = map.get("eventId");
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 94399) {
                if (hashCode != 94401) {
                    if (hashCode == 94407 && str.equals("_ai")) {
                        c2 = 1;
                    }
                } else if (str.equals("_ac")) {
                    c2 = 0;
                }
            } else if (str.equals("_aa")) {
                c2 = 2;
            }
            if (c2 == 0) {
                q.A().d(this.f2533a, str2);
            } else if (c2 == 1) {
                q.A().e(this.f2533a, str2);
            } else if (c2 != 2) {
                co.b("logScionEvent gmsg contained unsupported eventName");
            } else {
                q.A().g(this.f2533a, str2);
            }
        }
    }
}
