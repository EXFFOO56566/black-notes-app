package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.Map;

public final class m4 implements d5<ws> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.d5
    public final /* synthetic */ void a(ws wsVar, Map map) {
        ws wsVar2 = wsVar;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                co.d("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                co.d("No timestamp given for CSI tick.");
            } else {
                try {
                    long b2 = q.j().b() + (Long.parseLong(str4) - q.j().a());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    wsVar2.g().a(str2, str3, b2);
                } catch (NumberFormatException e) {
                    co.c("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                co.d("No value given for CSI experiment.");
                return;
            }
            o a2 = wsVar2.g().a();
            if (a2 == null) {
                co.d("No ticker for WebView, dropping experiment ID.");
            } else {
                a2.a("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                co.d("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                co.d("No name given for CSI extra.");
            } else {
                o a3 = wsVar2.g().a();
                if (a3 == null) {
                    co.d("No ticker for WebView, dropping extra parameter.");
                } else {
                    a3.a(str6, str7);
                }
            }
        }
    }
}
