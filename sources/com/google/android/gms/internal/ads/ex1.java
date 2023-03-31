package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

public final class ex1 {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<SecureRandom> f2500a = new hx1();

    /* access modifiers changed from: private */
    public static SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        f2500a.get().nextBytes(bArr);
        return bArr;
    }
}
