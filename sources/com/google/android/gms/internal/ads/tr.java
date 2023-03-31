package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class tr implements d5<gq> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f4847a;

    private static int a(Context context, Map<String, String> map, String str, int i) {
        String str2 = map.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            on2.a();
            return sn.b(context, Integer.parseInt(str2));
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
            sb.append("Could not parse ");
            sb.append(str);
            sb.append(" in a video GMSG: ");
            sb.append(str2);
            co.d(sb.toString());
            return i;
        }
    }

    private static void a(tp tpVar, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                tpVar.b(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                co.d(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            tpVar.c(Integer.parseInt(str2));
        }
        if (str3 != null) {
            tpVar.d(Integer.parseInt(str3));
        }
        if (str4 != null) {
            tpVar.e(Integer.parseInt(str4));
        }
        if (str5 != null) {
            tpVar.f(Integer.parseInt(str5));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.d5
    public final /* synthetic */ void a(gq gqVar, Map map) {
        int i;
        gq gqVar2 = gqVar;
        String str = (String) map.get("action");
        if (str == null) {
            co.d("Action missing from video GMSG.");
            return;
        }
        if (co.a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            co.a(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                co.d("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                gqVar2.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                co.d("Invalid color parameter in video GMSG.");
            }
        } else {
            if ("decoderProps".equals(str)) {
                String str3 = (String) map.get("mimeTypes");
                if (str3 == null) {
                    co.d("No MIME types specified for decoder properties inspection.");
                    tp.a(gqVar2, "missingMimeTypes");
                    return;
                }
                HashMap hashMap = new HashMap();
                String[] split = str3.split(",");
                for (String str4 : split) {
                    hashMap.put(str4, qn.a(str4.trim()));
                }
                tp.a(gqVar2, hashMap);
                return;
            }
            zp l = gqVar2.l();
            if (l == null) {
                co.d("Could not get underlay container for a video GMSG.");
                return;
            }
            boolean equals = "new".equals(str);
            boolean equals2 = "position".equals(str);
            if (equals || equals2) {
                Context context = gqVar2.getContext();
                int a2 = a(context, map, "x", 0);
                int a3 = a(context, map, "y", 0);
                int a4 = a(context, map, "w", -1);
                int a5 = a(context, map, "h", -1);
                int min = Math.min(a4, gqVar2.j() - a2);
                int min2 = Math.min(a5, gqVar2.s() - a3);
                try {
                    i = Integer.parseInt((String) map.get("player"));
                } catch (NumberFormatException unused2) {
                    i = 0;
                }
                boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                if (!equals || l.c() != null) {
                    l.a(a2, a3, min, min2);
                    return;
                }
                l.a(a2, a3, min, min2, i, parseBoolean, new hq((String) map.get("flags")));
                tp c2 = l.c();
                if (c2 != null) {
                    a(c2, (Map<String, String>) map);
                    return;
                }
                return;
            }
            rt i2 = gqVar2.i();
            if (i2 != null) {
                if ("timeupdate".equals(str)) {
                    String str5 = (String) map.get("currentTime");
                    if (str5 == null) {
                        co.d("currentTime parameter missing from timeupdate video GMSG.");
                        return;
                    }
                    try {
                        i2.b(Float.parseFloat(str5));
                        return;
                    } catch (NumberFormatException unused3) {
                        String valueOf = String.valueOf(str5);
                        co.d(valueOf.length() != 0 ? "Could not parse currentTime parameter from timeupdate video GMSG: ".concat(valueOf) : new String("Could not parse currentTime parameter from timeupdate video GMSG: "));
                        return;
                    }
                } else if ("skip".equals(str)) {
                    i2.b2();
                    return;
                }
            }
            tp c3 = l.c();
            if (c3 == null) {
                tp.a(gqVar2);
            } else if ("click".equals(str)) {
                Context context2 = gqVar2.getContext();
                int a6 = a(context2, map, "x", 0);
                int a7 = a(context2, map, "y", 0);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a6, (float) a7, 0);
                c3.a(obtain);
                obtain.recycle();
            } else if ("currentTime".equals(str)) {
                String str6 = (String) map.get("time");
                if (str6 == null) {
                    co.d("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try {
                    c3.a((int) (Float.parseFloat(str6) * 1000.0f));
                } catch (NumberFormatException unused4) {
                    String valueOf2 = String.valueOf(str6);
                    co.d(valueOf2.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(valueOf2) : new String("Could not parse time parameter from currentTime video GMSG: "));
                }
            } else if ("hide".equals(str)) {
                c3.setVisibility(4);
            } else if ("load".equals(str)) {
                c3.k();
            } else if ("loadControl".equals(str)) {
                a(c3, (Map<String, String>) map);
            } else if ("muted".equals(str)) {
                if (Boolean.parseBoolean((String) map.get("muted"))) {
                    c3.l();
                } else {
                    c3.m();
                }
            } else if ("pause".equals(str)) {
                c3.i();
            } else if ("play".equals(str)) {
                c3.j();
            } else if ("show".equals(str)) {
                c3.setVisibility(0);
            } else if ("src".equals(str)) {
                String str7 = (String) map.get("src");
                String[] strArr = {str7};
                String str8 = (String) map.get("demuxed");
                if (str8 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str8);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                            strArr2[i3] = jSONArray.getString(i3);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused5) {
                        String valueOf3 = String.valueOf(str8);
                        co.d(valueOf3.length() != 0 ? "Malformed demuxed URL list for playback: ".concat(valueOf3) : new String("Malformed demuxed URL list for playback: "));
                        strArr = new String[]{str7};
                    }
                }
                c3.a(str7, strArr);
            } else if ("touchMove".equals(str)) {
                Context context3 = gqVar2.getContext();
                c3.a((float) a(context3, map, "dx", 0), (float) a(context3, map, "dy", 0));
                if (!this.f4847a) {
                    gqVar2.w();
                    this.f4847a = true;
                }
            } else if ("volume".equals(str)) {
                String str9 = (String) map.get("volume");
                if (str9 == null) {
                    co.d("Level parameter missing from volume video GMSG.");
                    return;
                }
                try {
                    c3.setVolume(Float.parseFloat(str9));
                } catch (NumberFormatException unused6) {
                    String valueOf4 = String.valueOf(str9);
                    co.d(valueOf4.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(valueOf4) : new String("Could not parse volume parameter from volume video GMSG: "));
                }
            } else if ("watermark".equals(str)) {
                c3.n();
            } else {
                String valueOf5 = String.valueOf(str);
                co.d(valueOf5.length() != 0 ? "Unknown video action: ".concat(valueOf5) : new String("Unknown video action: "));
            }
        }
    }
}
