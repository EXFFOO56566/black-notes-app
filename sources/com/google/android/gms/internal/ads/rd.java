package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class rd {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f4480a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4481b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4482c;
    private final boolean d;
    private final boolean e;

    private rd(td tdVar) {
        this.f4480a = tdVar.f4786a;
        this.f4481b = tdVar.f4787b;
        this.f4482c = tdVar.f4788c;
        this.d = tdVar.d;
        this.e = tdVar.e;
    }

    public final JSONObject a() {
        try {
            return new JSONObject().put("sms", this.f4480a).put("tel", this.f4481b).put("calendar", this.f4482c).put("storePicture", this.d).put("inlineVideo", this.e);
        } catch (JSONException e2) {
            co.b("Error occured while obtaining the MRAID capabilities.", e2);
            return null;
        }
    }
}
