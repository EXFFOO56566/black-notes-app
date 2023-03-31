package com.google.android.gms.internal.ads;

import java.util.Map;

public final class fs implements d5<gq> {
    private static Integer a(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = map.get(str);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            co.d(sb.toString());
            return null;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.d5
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(com.google.android.gms.internal.ads.gq r10, java.util.Map r11) {
        /*
        // Method dump skipped, instructions count: 308
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fs.a(java.lang.Object, java.util.Map):void");
    }
}
