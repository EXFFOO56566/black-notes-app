package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class an {
    static {
        new zm();
    }

    public static Bundle a(JSONObject jSONObject) {
        String str;
        String valueOf;
        String str2;
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Double) opt).doubleValue());
                } else if (opt instanceof Integer) {
                    bundle.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof String) {
                    bundle.putString(next, (String) opt);
                } else {
                    if (opt instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) opt;
                        if (!(jSONArray == null || jSONArray.length() == 0)) {
                            int length = jSONArray.length();
                            int i = 0;
                            Object obj = null;
                            int i2 = 0;
                            while (obj == null && i2 < length) {
                                obj = !jSONArray.isNull(i2) ? jSONArray.opt(i2) : null;
                                i2++;
                            }
                            if (obj == null) {
                                str = "Expected JSONArray with at least 1 non-null element for key:";
                                valueOf = String.valueOf(next);
                                if (valueOf.length() == 0) {
                                    str2 = new String(str);
                                }
                            } else if (obj instanceof JSONObject) {
                                Parcelable[] parcelableArr = new Bundle[length];
                                while (i < length) {
                                    parcelableArr[i] = !jSONArray.isNull(i) ? a(jSONArray.optJSONObject(i)) : null;
                                    i++;
                                }
                                bundle.putParcelableArray(next, parcelableArr);
                            } else if (obj instanceof Number) {
                                double[] dArr = new double[jSONArray.length()];
                                while (i < length) {
                                    dArr[i] = jSONArray.optDouble(i);
                                    i++;
                                }
                                bundle.putDoubleArray(next, dArr);
                            } else if (obj instanceof CharSequence) {
                                String[] strArr = new String[length];
                                while (i < length) {
                                    strArr[i] = !jSONArray.isNull(i) ? jSONArray.optString(i) : null;
                                    i++;
                                }
                                bundle.putStringArray(next, strArr);
                            } else if (obj instanceof Boolean) {
                                boolean[] zArr = new boolean[length];
                                while (i < length) {
                                    zArr[i] = jSONArray.optBoolean(i);
                                    i++;
                                }
                                bundle.putBooleanArray(next, zArr);
                            } else {
                                str2 = String.format("JSONArray with unsupported type %s for key:%s", obj.getClass().getCanonicalName(), next);
                            }
                            co.d(str2);
                        }
                    } else if (opt instanceof JSONObject) {
                        bundle.putBundle(next, a((JSONObject) opt));
                    } else {
                        str = "Unsupported type for key:";
                        valueOf = String.valueOf(next);
                        if (valueOf.length() == 0) {
                            str2 = new String(str);
                            co.d(str2);
                        }
                    }
                    str2 = str.concat(valueOf);
                    co.d(str2);
                }
            }
        }
        return bundle;
    }

    public static String a(bn bnVar) {
        return a((Object) bnVar);
    }

    private static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            a(jsonWriter, obj);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e) {
            co.b("Error when writing JSON.", e);
            return null;
        }
    }

    public static List<String> a(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static List<String> a(JSONArray jSONArray, List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public static JSONObject a(String str, Object obj) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, obj);
        return jSONObject;
    }

    public static JSONObject a(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static JSONObject a(JSONObject jSONObject, String... strArr) {
        JSONObject b2 = b(jSONObject, strArr);
        if (b2 == null) {
            return null;
        }
        return b2.optJSONObject(strArr[strArr.length - 1]);
    }

    private static void a(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            jsonWriter.value((String) obj);
        } else if (obj instanceof bn) {
            ((bn) obj).a(jsonWriter);
        } else if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (key instanceof String) {
                    a(jsonWriter.name((String) key), entry.getValue());
                }
            }
            jsonWriter.endObject();
        } else if (obj instanceof List) {
            jsonWriter.beginArray();
            for (Object obj2 : (List) obj) {
                a(jsonWriter, obj2);
            }
            jsonWriter.endArray();
        } else {
            jsonWriter.nullValue();
        }
    }

    private static void a(JsonWriter jsonWriter, JSONArray jSONArray) {
        try {
            jsonWriter.beginArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    a(jsonWriter, (JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    a(jsonWriter, (JSONArray) obj);
                } else {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                    sb.append("unable to write field: ");
                    sb.append(valueOf);
                    throw new JSONException(sb.toString());
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    public static void a(JsonWriter jsonWriter, JSONObject jSONObject) {
        try {
            jsonWriter.beginObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    a(jsonWriter.name(next), (JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    a(jsonWriter.name(next), (JSONArray) obj);
                } else {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                    sb.append("unable to write field: ");
                    sb.append(valueOf);
                    throw new JSONException(sb.toString());
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    public static boolean a(boolean z, JSONObject jSONObject, String... strArr) {
        JSONObject b2 = b(jSONObject, strArr);
        if (b2 == null) {
            return false;
        }
        return b2.optBoolean(strArr[strArr.length - 1], false);
    }

    public static Map<String, String> b(JsonReader jsonReader) {
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            hashMap.put(jsonReader.nextName(), jsonReader.nextString());
        }
        jsonReader.endObject();
        return hashMap;
    }

    private static JSONObject b(JSONObject jSONObject, String[] strArr) {
        for (int i = 0; i < strArr.length - 1; i++) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[i]);
        }
        return jSONObject;
    }

    public static JSONObject c(JsonReader jsonReader) {
        Object nextString;
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                nextString = d(jsonReader);
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                nextString = c(jsonReader);
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextDouble());
            } else if (JsonToken.STRING.equals(peek)) {
                nextString = jsonReader.nextString();
            } else {
                String valueOf = String.valueOf(peek);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("unexpected json token: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
            jSONObject.put(nextName, nextString);
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static JSONArray d(JsonReader jsonReader) {
        Object nextString;
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                nextString = d(jsonReader);
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                nextString = c(jsonReader);
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else if (JsonToken.STRING.equals(peek)) {
                nextString = jsonReader.nextString();
            } else {
                String valueOf = String.valueOf(peek);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("unexpected json token: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
            jSONArray.put(nextString);
        }
        jsonReader.endArray();
        return jSONArray;
    }
}
