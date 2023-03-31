package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

final class ve extends FilterInputStream {

    /* renamed from: b  reason: collision with root package name */
    private final long f5097b;

    /* renamed from: c  reason: collision with root package name */
    private long f5098c;

    ve(InputStream inputStream, long j) {
        super(inputStream);
        this.f5097b = j;
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        return this.f5097b - this.f5098c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f5098c++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f5098c += (long) read;
        }
        return read;
    }
}
