package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.nio.ByteBuffer;

public interface d42 extends Closeable {
    ByteBuffer a(long j, long j2);

    void b(long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long position();

    int read(ByteBuffer byteBuffer);

    long size();
}
