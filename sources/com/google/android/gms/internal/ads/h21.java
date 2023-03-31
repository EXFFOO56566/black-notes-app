package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public final class h21 implements y61<f21> {

    /* renamed from: a  reason: collision with root package name */
    private final String f2845a;

    /* renamed from: b  reason: collision with root package name */
    private final ko1 f2846b;

    /* renamed from: c  reason: collision with root package name */
    private final rl0 f2847c;

    public h21(String str, ko1 ko1, rl0 rl0) {
        this.f2845a = str;
        this.f2846b = ko1;
        this.f2847c = rl0;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0018 */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e A[Catch:{ fe1 -> 0x002b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.os.Bundle a(com.google.android.gms.internal.ads.le1 r3) {
        /*
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.internal.ads.ed r1 = r3.n()     // Catch:{ fe1 -> 0x0018 }
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "sdk_version"
            com.google.android.gms.internal.ads.ed r2 = r3.n()     // Catch:{ fe1 -> 0x0018 }
            java.lang.String r2 = r2.toString()     // Catch:{ fe1 -> 0x0018 }
            r0.putString(r1, r2)     // Catch:{ fe1 -> 0x0018 }
        L_0x0018:
            com.google.android.gms.internal.ads.ed r1 = r3.m()     // Catch:{ fe1 -> 0x002b }
            if (r1 == 0) goto L_0x002b
            java.lang.String r1 = "adapter_version"
            com.google.android.gms.internal.ads.ed r3 = r3.m()     // Catch:{ fe1 -> 0x002b }
            java.lang.String r3 = r3.toString()     // Catch:{ fe1 -> 0x002b }
            r0.putString(r1, r3)     // Catch:{ fe1 -> 0x002b }
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h21.a(com.google.android.gms.internal.ads.le1):android.os.Bundle");
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<f21> a() {
        if (new BigInteger(this.f2845a).equals(BigInteger.ONE)) {
            if (!kl1.b((String) on2.e().a(zr2.G0))) {
                return this.f2846b.a(new l21(this));
            }
        }
        return yn1.a(new f21(new Bundle()));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ f21 b() {
        List<String> asList = Arrays.asList(((String) on2.e().a(zr2.G0)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                bundle.putBundle(str, a(this.f2847c.a(str, new JSONObject())));
            } catch (fe1 unused) {
            }
        }
        return new f21(bundle);
    }
}
