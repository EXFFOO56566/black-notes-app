package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

public final class gm extends ByteArrayOutputStream {

    /* renamed from: b  reason: collision with root package name */
    private final z7 f2781b;

    public gm(z7 z7Var, int i) {
        this.f2781b = z7Var;
        ((ByteArrayOutputStream) this).buf = z7Var.a(Math.max(i, 256));
    }

    private final void a(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i > ((ByteArrayOutputStream) this).buf.length) {
            byte[] a2 = this.f2781b.a((i2 + i) << 1);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a2, 0, ((ByteArrayOutputStream) this).count);
            this.f2781b.a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = a2;
        }
    }

    @Override // java.io.OutputStream, java.io.ByteArrayOutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2781b.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    @Override // java.lang.Object
    public final void finalize() {
        this.f2781b.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.OutputStream, java.io.ByteArrayOutputStream
    public final synchronized void write(int i) {
        a(1);
        super.write(i);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }
}
