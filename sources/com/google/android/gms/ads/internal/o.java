package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.fo;
import com.google.android.gms.internal.ads.g0;
import com.google.android.gms.internal.ads.p61;
import com.google.android.gms.internal.ads.rm2;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;

/* access modifiers changed from: package-private */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1408a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1409b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f1410c = new TreeMap();
    private String d;
    private String e;

    public o(Context context, String str) {
        this.f1408a = context.getApplicationContext();
        this.f1409b = str;
    }

    public final String a() {
        return this.d;
    }

    public final void a(rm2 rm2, fo foVar) {
        this.d = rm2.k.f2001b;
        Bundle bundle = rm2.n;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String a2 = g0.f2682c.a();
            for (String str : bundle2.keySet()) {
                if (a2.equals(str)) {
                    this.e = bundle2.getString(str);
                } else if (str.startsWith("csa_")) {
                    this.f1410c.put(str.substring(4), bundle2.getString(str));
                }
            }
            this.f1410c.put("SDKVersion", foVar.f2633b);
            if (g0.f2680a.a().booleanValue()) {
                try {
                    Bundle a3 = p61.a(this.f1408a, new JSONArray(g0.f2681b.a()));
                    for (String str2 : a3.keySet()) {
                        this.f1410c.put(str2, a3.get(str2).toString());
                    }
                } catch (JSONException e2) {
                    co.b("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e2);
                }
            }
        }
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.f1409b;
    }

    public final Map<String, String> d() {
        return this.f1410c;
    }
}
