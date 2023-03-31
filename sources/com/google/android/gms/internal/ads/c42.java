package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public abstract class c42 extends a42 implements mt {
    private int j;

    protected c42(String str) {
        super(str);
    }

    public final int b() {
        if (!this.f1696c) {
            a();
        }
        return this.j;
    }

    /* access modifiers changed from: protected */
    public final long b(ByteBuffer byteBuffer) {
        this.j = mu.a(byteBuffer.get());
        mu.b(byteBuffer);
        mu.a(byteBuffer.get());
        return 4;
    }
}
