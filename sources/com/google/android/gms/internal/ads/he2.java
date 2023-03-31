package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

public final class he2 extends me2 {
    private final AtomicReference<ke2> d;

    public he2() {
        this(null);
    }

    private he2(qe2 qe2) {
        this.d = new AtomicReference<>(new ke2());
    }

    private static int a(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    private static boolean a(e82 e82, String str) {
        return str != null && TextUtils.equals(str, ag2.b(e82.z));
    }

    private static boolean b(int i, boolean z) {
        int i2 = i & 3;
        if (i2 != 3) {
            return z && i2 == 2;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017f, code lost:
        if (r11 <= r12) goto L_0x0184;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01b2  */
    @Override // com.google.android.gms.internal.ads.me2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.ne2[] a(com.google.android.gms.internal.ads.m82[] r36, com.google.android.gms.internal.ads.ee2[] r37, int[][][] r38) {
        /*
        // Method dump skipped, instructions count: 1081
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.he2.a(com.google.android.gms.internal.ads.m82[], com.google.android.gms.internal.ads.ee2[], int[][][]):com.google.android.gms.internal.ads.ne2[]");
    }
}
