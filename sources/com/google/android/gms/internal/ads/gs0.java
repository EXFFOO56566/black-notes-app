package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.j;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class gs0 implements zg1<fs0, is0> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2800a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2801b;

    /* renamed from: c  reason: collision with root package name */
    private final rg f2802c;
    private final String d;

    public gs0(Context context, String str, rg rgVar, String str2) {
        this.f2800a = context;
        this.f2801b = str;
        this.f2802c = rgVar;
        this.d = str2;
    }

    private final is0 a(String str, fg fgVar, JSONObject jSONObject, String str2) {
        byte[] bArr;
        int responseCode;
        InputStreamReader inputStreamReader;
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        Throwable th2;
        String str3 = "doritos_v2";
        String str4 = "doritos";
        String str5 = BuildConfig.FLAVOR;
        try {
            boolean z = false;
            if (fgVar.a() == -2) {
                is0 is0 = new is0();
                String valueOf = String.valueOf(this.f2801b);
                co.c(valueOf.length() != 0 ? "SDK version: ".concat(valueOf) : new String("SDK version: "));
                String valueOf2 = String.valueOf(str);
                co.a(valueOf2.length() != 0 ? "AdRequestServiceImpl: Sending request: ".concat(valueOf2) : new String("AdRequestServiceImpl: Sending request: "));
                URL url = new URL(str);
                HashMap hashMap = new HashMap();
                long b2 = q.j().b();
                int i = 0;
                while (true) {
                    this.f2802c.b();
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    try {
                        q.c().a(this.f2800a, this.f2801b, z, httpURLConnection);
                        if (!TextUtils.isEmpty(str2)) {
                            httpURLConnection.addRequestProperty("Cookie", str2);
                        }
                        if (fgVar.f()) {
                            JSONObject optJSONObject = jSONObject.optJSONObject("pii");
                            if (optJSONObject != null) {
                                if (!TextUtils.isEmpty(optJSONObject.optString(str4, str5))) {
                                    httpURLConnection.addRequestProperty("x-afma-drt-cookie", optJSONObject.optString(str4, str5));
                                }
                                if (!TextUtils.isEmpty(optJSONObject.optString(str3, str5))) {
                                    httpURLConnection.addRequestProperty("x-afma-drt-v2-cookie", optJSONObject.optString(str3, str5));
                                }
                            } else {
                                wk.e("DSID signal does not exist.");
                            }
                        }
                        if (fgVar == null || TextUtils.isEmpty(fgVar.e())) {
                            bArr = null;
                        } else {
                            httpURLConnection.setDoOutput(true);
                            bArr = fgVar.e().getBytes();
                            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream2.write(bArr);
                                    j.a(bufferedOutputStream2);
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    j.a(bufferedOutputStream);
                                    throw th2;
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                bufferedOutputStream = null;
                                j.a(bufferedOutputStream);
                                throw th2;
                            }
                        }
                        wn wnVar = new wn();
                        wnVar.a(httpURLConnection, bArr);
                        responseCode = httpURLConnection.getResponseCode();
                        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
                            String key = entry.getKey();
                            List<String> value = entry.getValue();
                            if (hashMap.containsKey(key)) {
                                ((List) hashMap.get(key)).addAll(value);
                            } else {
                                hashMap.put(key, new ArrayList(value));
                                str5 = str5;
                            }
                            str4 = str4;
                            str3 = str3;
                        }
                        wnVar.a(httpURLConnection, responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            try {
                                InputStreamReader inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                                try {
                                    q.c();
                                    String a2 = gl.a(inputStreamReader2);
                                    j.a(inputStreamReader2);
                                    wnVar.a(a2);
                                    is0.f3131a = responseCode;
                                    is0.f3133c = a2;
                                    is0.f3132b = hashMap;
                                    if (TextUtils.isEmpty(a2)) {
                                        if (!((Boolean) on2.e().a(zr2.u2)).booleanValue()) {
                                            throw new nr0("No Fill", 3);
                                        }
                                    }
                                    is0.d = q.j().b() - b2;
                                    return is0;
                                } catch (Throwable th5) {
                                    th = th5;
                                    inputStreamReader = inputStreamReader2;
                                    j.a(inputStreamReader);
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                inputStreamReader = null;
                                j.a(inputStreamReader);
                                throw th;
                            }
                        } else if (responseCode < 300 || responseCode >= 400) {
                            StringBuilder sb = new StringBuilder(46);
                            sb.append("Received error HTTP response code: ");
                            sb.append(responseCode);
                            co.d(sb.toString());
                            StringBuilder sb2 = new StringBuilder(46);
                            sb2.append("Received error HTTP response code: ");
                            sb2.append(responseCode);
                        } else {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (!TextUtils.isEmpty(headerField)) {
                                URL url2 = new URL(headerField);
                                i++;
                                if (i <= ((Integer) on2.e().a(zr2.l2)).intValue()) {
                                    httpURLConnection.disconnect();
                                    this.f2802c.a();
                                    url = url2;
                                    str5 = str5;
                                    str4 = str4;
                                    str3 = str3;
                                    z = false;
                                } else {
                                    co.d("Too many redirects.");
                                    throw new nr0("Too many redirects");
                                }
                            } else {
                                co.d("No location header to follow redirect.");
                                throw new nr0("No location header to follow redirect");
                            }
                        }
                    } finally {
                        httpURLConnection.disconnect();
                        this.f2802c.a();
                    }
                }
                StringBuilder sb3 = new StringBuilder(46);
                sb3.append("Received error HTTP response code: ");
                sb3.append(responseCode);
                co.d(sb3.toString());
                StringBuilder sb22 = new StringBuilder(46);
                sb22.append("Received error HTTP response code: ");
                sb22.append(responseCode);
                throw new nr0(sb22.toString());
            } else if (fgVar.a() == 1) {
                if (fgVar.c() != null) {
                    co.b(TextUtils.join(", ", fgVar.c()));
                }
                throw new nr0("Error building request URL.", fgVar.a());
            } else {
                throw new nr0("Internal error.", 0);
            }
        } catch (IOException e) {
            String valueOf3 = String.valueOf(e.getMessage());
            co.d(valueOf3.length() != 0 ? "Error while connecting to ad server: ".concat(valueOf3) : new String("Error while connecting to ad server: "));
            String valueOf4 = String.valueOf(e.getMessage());
            throw new nr0(valueOf4.length() != 0 ? "Error connecting to ad server:".concat(valueOf4) : new String("Error connecting to ad server:"), 2);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zg1
    public final /* synthetic */ is0 a(fs0 fs0) {
        fs0 fs02 = fs0;
        return a(fs02.f2652b.b(), fs02.f2652b, fs02.f2651a, this.d);
    }
}
