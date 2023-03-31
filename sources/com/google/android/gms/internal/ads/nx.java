package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class nx extends a42 {
    public nx(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.a42
    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
