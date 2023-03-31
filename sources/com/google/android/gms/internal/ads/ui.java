package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class ui extends a {
    public static final Parcelable.Creator<ui> CREATOR = new ti();

    /* renamed from: b  reason: collision with root package name */
    public final String f4956b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4957c;
    public final boolean d;
    public final boolean e;
    public final List<String> f;
    public final boolean g;
    public final boolean h;
    public final List<String> i;

    public ui(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.f4956b = str;
        this.f4957c = str2;
        this.d = z;
        this.e = z2;
        this.f = list;
        this.g = z3;
        this.h = z4;
        this.i = list2 == null ? new ArrayList<>() : list2;
    }

    public static ui a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new ui(jSONObject.optString("click_string", BuildConfig.FLAVOR), jSONObject.optString("report_url", BuildConfig.FLAVOR), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), an.a(jSONObject.optJSONArray("allowed_headers"), (List<String>) null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), an.a(jSONObject.optJSONArray("webview_permissions"), (List<String>) null));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f4956b, false);
        c.a(parcel, 3, this.f4957c, false);
        c.a(parcel, 4, this.d);
        c.a(parcel, 5, this.e);
        c.b(parcel, 6, this.f, false);
        c.a(parcel, 7, this.g);
        c.a(parcel, 8, this.h);
        c.b(parcel, 9, this.i, false);
        c.a(parcel, a2);
    }
}
