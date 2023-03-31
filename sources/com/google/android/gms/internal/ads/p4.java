package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class p4 {

    /* renamed from: a  reason: collision with root package name */
    public static final d5<ws> f4104a = o4.f3941a;

    /* renamed from: b  reason: collision with root package name */
    public static final d5<ws> f4105b = r4.f4442a;

    /* renamed from: c  reason: collision with root package name */
    public static final d5<ws> f4106c = q4.f4268a;
    public static final d5<ws> d = new v4();
    public static final d5<ws> e = new u4();
    public static final d5<ws> f = t4.f4750a;
    public static final d5<Object> g = new x4();
    public static final d5<ws> h = new w4();
    public static final d5<ws> i = s4.f4596a;
    public static final d5<ws> j = new z4();
    public static final d5<ws> k = new y4();
    public static final d5<gq> l = new tr();
    public static final d5<gq> m = new sr();
    public static final d5<ws> n = new m4();
    public static final j5 o = new j5();
    public static final d5<ws> p = new b5();
    public static final d5<ws> q = new a5();
    public static final d5<ws> r = new e5();

    static final /* synthetic */ void a(e7 e7Var, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            co.d("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            eq1 d2 = ((eu) e7Var).d();
            if (d2 != null && d2.a(parse)) {
                parse = d2.a(parse, ((wt) e7Var).getContext(), ((gu) e7Var).getView(), ((wt) e7Var).a());
            }
        } catch (ht1 unused) {
            String valueOf = String.valueOf(str);
            co.d(valueOf.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf) : new String("Unable to append parameter to URL: "));
        }
        wt wtVar = (wt) e7Var;
        new en(wtVar.getContext(), ((hu) e7Var).b().f2633b, sj.a(parse, wtVar.getContext())).b();
    }

    static final /* synthetic */ void a(eu euVar, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            eq1 d2 = euVar.d();
            if (d2 != null) {
                d2.a().a(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            co.d("Could not parse touch parameters from gmsg.");
        }
    }

    static final /* synthetic */ void a(wt wtVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            co.d("URL missing from httpTrack GMSG.");
        } else {
            new en(wtVar.getContext(), ((hu) wtVar).b().f2633b, str).b();
        }
    }

    static final /* synthetic */ void b(wt wtVar, Map map) {
        JSONException jSONException;
        String str;
        PackageManager packageManager = wtVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString("c");
                        jSONObject2.optString("f");
                        jSONObject2.optString("e");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e2) {
                                String valueOf = String.valueOf(optString7);
                                co.b(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e2);
                            }
                        }
                        boolean z = true;
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        if (packageManager.resolveActivity(intent, 65536) == null) {
                            z = false;
                        }
                        try {
                            jSONObject.put(optString, z);
                        } catch (JSONException e3) {
                            jSONException = e3;
                            str = "Error constructing openable urls response.";
                        }
                    } catch (JSONException e4) {
                        jSONException = e4;
                        str = "Error parsing the intent data.";
                        co.b(str, jSONException);
                    }
                }
                ((e7) wtVar).a("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((e7) wtVar).a("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((e7) wtVar).a("openableIntents", new JSONObject());
        }
    }

    static final /* synthetic */ void c(wt wtVar, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            co.d("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = wtVar.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((e7) wtVar).a("openableURLs", hashMap);
    }
}
