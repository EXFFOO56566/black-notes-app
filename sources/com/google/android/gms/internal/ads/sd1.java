package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.common.util.j;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

public final class sd1 {

    /* renamed from: a  reason: collision with root package name */
    public final List<id1> f4641a;

    /* renamed from: b  reason: collision with root package name */
    public final kd1 f4642b;

    /* renamed from: c  reason: collision with root package name */
    public final List<rd1> f4643c;

    private sd1(JsonReader jsonReader) {
        List<id1> emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        kd1 kd1 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList<>();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new id1(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        kd1 = new kd1(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    Map<String, String> map = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            map = an.b(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new rd1(str, map));
                    }
                    jsonReader.endObject();
                }
            }
            jsonReader.endArray();
        }
        this.f4643c = arrayList;
        this.f4641a = emptyList;
        this.f4642b = kd1 == null ? new kd1(new JsonReader(new StringReader("{}"))) : kd1;
    }

    public static sd1 a(Reader reader) {
        try {
            sd1 sd1 = new sd1(new JsonReader(reader));
            j.a(reader);
            return sd1;
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new jd1("unable to parse ServerResponse", e);
        } catch (Throwable th) {
            j.a(reader);
            throw th;
        }
    }
}
