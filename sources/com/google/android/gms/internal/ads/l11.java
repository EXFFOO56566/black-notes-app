package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

public final class l11 {

    /* renamed from: a  reason: collision with root package name */
    public final String f3483a;

    /* renamed from: b  reason: collision with root package name */
    public String f3484b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f3485c = new Bundle();

    public l11(JsonReader jsonReader) {
        Map<String, String> hashMap = new HashMap<>();
        jsonReader.beginObject();
        String str = BuildConfig.FLAVOR;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? BuildConfig.FLAVOR : nextName;
            char c2 = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -995427962) {
                if (hashCode == -271442291 && nextName.equals("signal_dictionary")) {
                    c2 = 1;
                }
            } else if (nextName.equals("params")) {
                c2 = 0;
            }
            if (c2 == 0) {
                str = jsonReader.nextString();
            } else if (c2 != 1) {
                jsonReader.skipValue();
            } else {
                hashMap = an.b(jsonReader);
            }
        }
        this.f3483a = str;
        jsonReader.endObject();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null)) {
                this.f3485c.putString(entry.getKey(), entry.getValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final l11 a(Bundle bundle) {
        try {
            this.f3484b = q.c().a(bundle).toString();
        } catch (JSONException unused) {
            this.f3484b = "{}";
        }
        return this;
    }
}
