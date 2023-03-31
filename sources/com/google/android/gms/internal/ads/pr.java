package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
public final class pr implements d42 {

    /* renamed from: b  reason: collision with root package name */
    private final ByteBuffer f4221b;

    pr(ByteBuffer byteBuffer) {
        this.f4221b = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.d42
    public final ByteBuffer a(long j, long j2) {
        int position = this.f4221b.position();
        this.f4221b.position((int) j);
        ByteBuffer slice = this.f4221b.slice();
        slice.limit((int) j2);
        this.f4221b.position(position);
        return slice;
    }

    @Override // com.google.android.gms.internal.ads.d42
    public final void b(long j) {
        this.f4221b.position((int) j);
    }

    @Override // com.google.android.gms.internal.ads.d42, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.d42
    public final long position() {
        return (long) this.f4221b.position();
    }

    @Override // com.google.android.gms.internal.ads.d42
    public final int read(ByteBuffer byteBuffer) {
        if (this.f4221b.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.f4221b.remaining());
        byte[] bArr = new byte[min];
        this.f4221b.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.d42
    public final long size() {
        return (long) this.f4221b.limit();
    }
}
