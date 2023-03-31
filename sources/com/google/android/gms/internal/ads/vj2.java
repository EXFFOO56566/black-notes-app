package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;

final class vj2 extends PushbackInputStream {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ qj2 f5125b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    vj2(qj2 qj2, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.f5125b = qj2;
    }

    @Override // java.io.FilterInputStream, java.io.PushbackInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final synchronized void close() {
        this.f5125b.f4347c.a();
        super.close();
    }
}
