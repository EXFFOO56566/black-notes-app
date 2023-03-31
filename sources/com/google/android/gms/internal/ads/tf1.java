package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public final class tf1 implements uf1 {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f4805a;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public tf1(com.google.android.gms.internal.ads.rm2 r3, java.lang.String r4, int r5, java.lang.String r6, com.google.android.gms.internal.ads.bn2 r7) {
        /*
        // Method dump skipped, instructions count: 395
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tf1.<init>(com.google.android.gms.internal.ads.rm2, java.lang.String, int, java.lang.String, com.google.android.gms.internal.ads.bn2):void");
    }

    private static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.uf1
    public final boolean equals(Object obj) {
        if (!(obj instanceof tf1)) {
            return false;
        }
        return Arrays.equals(this.f4805a, ((tf1) obj).f4805a);
    }

    @Override // com.google.android.gms.internal.ads.uf1
    public final int hashCode() {
        return Arrays.hashCode(this.f4805a);
    }

    public final String toString() {
        int hashCode = hashCode();
        String arrays = Arrays.toString(this.f4805a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 22);
        sb.append("[PoolKey#");
        sb.append(hashCode);
        sb.append(" ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
