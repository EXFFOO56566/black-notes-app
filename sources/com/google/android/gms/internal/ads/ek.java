package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.net.HttpURLConnection;

final class ek extends FilterInputStream {

    /* renamed from: b  reason: collision with root package name */
    private final HttpURLConnection f2439b;

    ek(HttpURLConnection httpURLConnection) {
        super(rh.a(httpURLConnection));
        this.f2439b = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        super.close();
        this.f2439b.disconnect();
    }
}
