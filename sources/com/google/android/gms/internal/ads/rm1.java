package com.google.android.gms.internal.ads;

import java.io.OutputStream;

final class rm1 extends OutputStream {
    rm1() {
    }

    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        jl1.a(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        jl1.a(bArr);
    }
}
