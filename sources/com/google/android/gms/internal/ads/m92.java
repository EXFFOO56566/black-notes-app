package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class m92 implements u82 {

    /* renamed from: b  reason: collision with root package name */
    private int f3680b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f3681c = -1;
    private int[] d;
    private boolean e;
    private int[] f;
    private ByteBuffer g;
    private ByteBuffer h;
    private boolean i;

    public m92() {
        ByteBuffer byteBuffer = u82.f4914a;
        this.g = byteBuffer;
        this.h = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final boolean E() {
        return this.i && this.h == u82.f4914a;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final void a() {
        flush();
        this.g = u82.f4914a;
        this.f3680b = -1;
        this.f3681c = -1;
        this.f = null;
        this.e = false;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = (((limit - position) / (this.f3680b * 2)) * this.f.length) << 1;
        if (this.g.capacity() < length) {
            this.g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        while (position < limit) {
            for (int i2 : this.f) {
                this.g.putShort(byteBuffer.getShort((i2 * 2) + position));
            }
            position += this.f3680b << 1;
        }
        byteBuffer.position(limit);
        this.g.flip();
        this.h = this.g;
    }

    public final void a(int[] iArr) {
        this.d = iArr;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final boolean a(int i2, int i3, int i4) {
        boolean z = !Arrays.equals(this.d, this.f);
        int[] iArr = this.d;
        this.f = iArr;
        if (iArr == null) {
            this.e = false;
            return z;
        } else if (i4 != 2) {
            throw new t82(i2, i3, i4);
        } else if (!z && this.f3681c == i2 && this.f3680b == i3) {
            return false;
        } else {
            this.f3681c = i2;
            this.f3680b = i3;
            this.e = i3 != this.f.length;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f;
                if (i5 >= iArr2.length) {
                    return true;
                }
                int i6 = iArr2[i5];
                if (i6 < i3) {
                    this.e = (i6 != i5) | this.e;
                    i5++;
                } else {
                    throw new t82(i2, i3, i4);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final int b() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final boolean c() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final void d() {
        this.i = true;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final ByteBuffer e() {
        ByteBuffer byteBuffer = this.h;
        this.h = u82.f4914a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final int f() {
        int[] iArr = this.f;
        return iArr == null ? this.f3680b : iArr.length;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final void flush() {
        this.h = u82.f4914a;
        this.i = false;
    }
}
