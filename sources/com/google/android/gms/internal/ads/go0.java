package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.d;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

public final class go0 {

    /* renamed from: a  reason: collision with root package name */
    private final d f2791a;

    public go0(d dVar) {
        this.f2791a = dVar;
    }

    public final void a(List<Object> list, String str, String str2, Object... objArr) {
        if (q0.f4253a.a().booleanValue()) {
            long a2 = this.f2791a.a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(a2);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                for (Object obj : list) {
                    jsonWriter.value(obj.toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj2 = objArr[i];
                    jsonWriter.value(obj2 != null ? obj2.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                co.b("unable to log", e);
            }
            String valueOf = String.valueOf(stringWriter.toString());
            co.c(valueOf.length() != 0 ? "AD-DBG ".concat(valueOf) : new String("AD-DBG "));
        }
    }
}
