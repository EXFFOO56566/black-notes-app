package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* access modifiers changed from: package-private */
public final class bv0 implements Runnable {
    private bv0() {
    }

    public final void run() {
        try {
            MessageDigest unused = zs0.f5808b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused2) {
        } catch (Throwable th) {
            zs0.e.countDown();
            throw th;
        }
        zs0.e.countDown();
    }
}
