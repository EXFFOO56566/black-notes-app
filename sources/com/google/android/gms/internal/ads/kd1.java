package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.Collections;
import java.util.List;

public final class kd1 {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f3375a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3376b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3377c;
    public final String d;
    public final int e;
    public final long f;

    kd1(JsonReader jsonReader) {
        List<String> emptyList = Collections.emptyList();
        jsonReader.beginObject();
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = an.a(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j = jsonReader.nextLong();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        this.f3375a = emptyList;
        this.f3377c = i;
        this.f3376b = str;
        this.d = str2;
        this.e = i2;
        this.f = j;
    }
}
