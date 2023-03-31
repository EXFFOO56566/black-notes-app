package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

public final class l9 {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f3509a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final m9<JSONObject> f3510b = new n9();

    /* renamed from: c  reason: collision with root package name */
    public static final k9<InputStream> f3511c = o9.f3964a;

    static final /* synthetic */ InputStream a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f3509a));
    }
}
