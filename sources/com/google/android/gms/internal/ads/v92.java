package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class v92 implements u82 {

    /* renamed from: b  reason: collision with root package name */
    private int f5073b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f5074c = -1;
    private s92 d;
    private float e = 1.0f;
    private float f = 1.0f;
    private ByteBuffer g;
    private ShortBuffer h;
    private ByteBuffer i;
    private long j;
    private long k;
    private boolean l;

    public v92() {
        ByteBuffer byteBuffer = u82.f4914a;
        this.g = byteBuffer;
        this.h = byteBuffer.asShortBuffer();
        this.i = u82.f4914a;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final boolean E() {
        if (!this.l) {
            return false;
        }
        s92 s92 = this.d;
        return s92 == null || s92.b() == 0;
    }

    public final float a(float f2) {
        float a2 = ag2.a(f2, 0.1f, 8.0f);
        this.e = a2;
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final void a() {
        this.d = null;
        ByteBuffer byteBuffer = u82.f4914a;
        this.g = byteBuffer;
        this.h = byteBuffer.asShortBuffer();
        this.i = u82.f4914a;
        this.f5073b = -1;
        this.f5074c = -1;
        this.j = 0;
        this.k = 0;
        this.l = false;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.j += (long) remaining;
            this.d.a(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int b2 = (this.d.b() * this.f5073b) << 1;
        if (b2 > 0) {
            if (this.g.capacity() < b2) {
                ByteBuffer order = ByteBuffer.allocateDirect(b2).order(ByteOrder.nativeOrder());
                this.g = order;
                this.h = order.asShortBuffer();
            } else {
                this.g.clear();
                this.h.clear();
            }
            this.d.b(this.h);
            this.k += (long) b2;
            this.g.limit(b2);
            this.i = this.g;
        }
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final boolean a(int i2, int i3, int i4) {
        if (i4 != 2) {
            throw new t82(i2, i3, i4);
        } else if (this.f5074c == i2 && this.f5073b == i3) {
            return false;
        } else {
            this.f5074c = i2;
            this.f5073b = i3;
            return true;
        }
    }

    public final float b(float f2) {
        this.f = ag2.a(f2, 0.1f, 8.0f);
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final int b() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final boolean c() {
        return Math.abs(this.e - 1.0f) >= 0.01f || Math.abs(this.f - 1.0f) >= 0.01f;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final void d() {
        this.d.a();
        this.l = true;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final ByteBuffer e() {
        ByteBuffer byteBuffer = this.i;
        this.i = u82.f4914a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final int f() {
        return this.f5073b;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final void flush() {
        s92 s92 = new s92(this.f5074c, this.f5073b);
        this.d = s92;
        s92.a(this.e);
        this.d.b(this.f);
        this.i = u82.f4914a;
        this.j = 0;
        this.k = 0;
        this.l = false;
    }

    public final long g() {
        return this.j;
    }

    public final long h() {
        return this.k;
    }
}
