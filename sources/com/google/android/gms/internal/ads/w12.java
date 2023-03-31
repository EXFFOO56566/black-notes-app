package com.google.android.gms.internal.ads;

import java.io.InputStream;

final class w12 extends InputStream {

    /* renamed from: b  reason: collision with root package name */
    private x12 f5196b;

    /* renamed from: c  reason: collision with root package name */
    private py1 f5197c;
    private int d;
    private int e;
    private int f;
    private int g;
    private final /* synthetic */ s12 h;

    public w12(s12 s12) {
        this.h = s12;
        a();
    }

    private final int a(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            b();
            if (this.f5197c == null) {
                break;
            }
            int min = Math.min(this.d - this.e, i3);
            if (bArr != null) {
                this.f5197c.a(bArr, this.e, i, min);
                i += min;
            }
            this.e += min;
            i3 -= min;
        }
        return i2 - i3;
    }

    private final void a() {
        x12 x12 = new x12(this.h, null);
        this.f5196b = x12;
        py1 py1 = (py1) x12.next();
        this.f5197c = py1;
        this.d = py1.size();
        this.e = 0;
        this.f = 0;
    }

    private final void b() {
        int i;
        if (this.f5197c != null && this.e == (i = this.d)) {
            this.f += i;
            this.e = 0;
            if (this.f5196b.hasNext()) {
                py1 py1 = (py1) this.f5196b.next();
                this.f5197c = py1;
                this.d = py1.size();
                return;
            }
            this.f5197c = null;
            this.d = 0;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.h.size() - (this.f + this.e);
    }

    public final void mark(int i) {
        this.g = this.f + this.e;
    }

    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        b();
        py1 py1 = this.f5197c;
        if (py1 == null) {
            return -1;
        }
        int i = this.e;
        this.e = i + 1;
        return py1.f(i) & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw null;
        } else if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else {
            int a2 = a(bArr, i, i2);
            if (a2 == 0) {
                return -1;
            }
            return a2;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        a();
        a(null, 0, this.g);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j >= 0) {
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return (long) a(null, 0, (int) j);
        }
        throw new IndexOutOfBoundsException();
    }
}
