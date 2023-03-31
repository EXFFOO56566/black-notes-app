package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* access modifiers changed from: package-private */
public final class ii2 {

    /* renamed from: a  reason: collision with root package name */
    private ByteArrayOutputStream f3095a = new ByteArrayOutputStream(4096);

    /* renamed from: b  reason: collision with root package name */
    private Base64OutputStream f3096b = new Base64OutputStream(this.f3095a, 10);

    public final void a(byte[] bArr) {
        this.f3096b.write(bArr);
    }

    public final String toString() {
        String str;
        try {
            this.f3096b.close();
        } catch (IOException e) {
            co.b("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.f3095a.close();
            str = this.f3095a.toString();
        } catch (IOException e2) {
            co.b("HashManager: Unable to convert to Base64.", e2);
            str = BuildConfig.FLAVOR;
        } catch (Throwable th) {
            this.f3095a = null;
            this.f3096b = null;
            throw th;
        }
        this.f3095a = null;
        this.f3096b = null;
        return str;
    }
}
