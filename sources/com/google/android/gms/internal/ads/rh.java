package com.google.android.gms.internal.ads;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

public final class rh extends d6 {

    /* renamed from: a  reason: collision with root package name */
    private final ij f4503a;

    public rh() {
        this(null);
    }

    private rh(ij ijVar) {
        this(null, null);
    }

    private rh(ij ijVar, SSLSocketFactory sSLSocketFactory) {
        this.f4503a = null;
    }

    /* access modifiers changed from: private */
    public static InputStream a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private static List<bb2> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new bb2(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    private static void a(HttpURLConnection httpURLConnection, gh2<?> gh2) {
        byte[] m = gh2.m();
        if (m != null) {
            httpURLConnection.setDoOutput(true);
            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                httpURLConnection.setRequestProperty("Content-Type", "UTF-8".length() != 0 ? "application/x-www-form-urlencoded; charset=".concat("UTF-8") : new String("application/x-www-form-urlencoded; charset="));
            }
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(m);
            dataOutputStream.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf A[Catch:{ all -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0117  */
    @Override // com.google.android.gms.internal.ads.d6
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.pf a(com.google.android.gms.internal.ads.gh2<?> r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
        // Method dump skipped, instructions count: 306
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rh.a(com.google.android.gms.internal.ads.gh2, java.util.Map):com.google.android.gms.internal.ads.pf");
    }
}
