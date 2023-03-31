package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;

public final class ry1 extends OutputStream {
    private static final byte[] g = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    private final int f4569b = 128;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<dy1> f4570c = new ArrayList<>();
    private int d;
    private byte[] e = new byte[128];
    private int f;

    ry1(int i) {
    }

    private final void a(int i) {
        this.f4570c.add(new oy1(this.e));
        int length = this.d + this.e.length;
        this.d = length;
        this.e = new byte[Math.max(this.f4569b, Math.max(i, length >>> 1))];
        this.f = 0;
    }

    private final synchronized int size() {
        return this.d + this.f;
    }

    public final synchronized dy1 a() {
        if (this.f >= this.e.length) {
            this.f4570c.add(new oy1(this.e));
            this.e = g;
        } else if (this.f > 0) {
            byte[] bArr = this.e;
            int i = this.f;
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            this.f4570c.add(new oy1(bArr2));
        }
        this.d += this.f;
        this.f = 0;
        return dy1.a(this.f4570c);
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        if (this.f == this.e.length) {
            a(1);
        }
        byte[] bArr = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        bArr[i2] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        if (i2 <= this.e.length - this.f) {
            System.arraycopy(bArr, i, this.e, this.f, i2);
            this.f += i2;
            return;
        }
        int length = this.e.length - this.f;
        System.arraycopy(bArr, i, this.e, this.f, length);
        int i3 = i2 - length;
        a(i3);
        System.arraycopy(bArr, i + length, this.e, 0, i3);
        this.f = i3;
    }
}
