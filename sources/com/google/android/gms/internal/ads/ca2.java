package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class ca2 extends u92 {

    /* renamed from: b  reason: collision with root package name */
    public final x92 f2091b = new x92();

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer f2092c;
    public long d;

    public ca2(int i) {
    }

    private final ByteBuffer e(int i) {
        ByteBuffer byteBuffer = this.f2092c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.u92
    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.f2092c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void d(int i) {
        ByteBuffer byteBuffer = this.f2092c;
        if (byteBuffer != null) {
            int capacity = byteBuffer.capacity();
            int position = this.f2092c.position() + i;
            if (capacity < position) {
                e(position);
                throw null;
            }
            return;
        }
        e(i);
        throw null;
    }

    public final boolean e() {
        return c(1073741824);
    }
}
