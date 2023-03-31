package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public abstract class ci2 {

    /* renamed from: b  reason: collision with root package name */
    private static MessageDigest f2123b;

    /* renamed from: a  reason: collision with root package name */
    protected Object f2124a = new Object();

    /* access modifiers changed from: protected */
    public final MessageDigest a() {
        synchronized (this.f2124a) {
            if (f2123b != null) {
                return f2123b;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f2123b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f2123b;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] a(String str);
}
