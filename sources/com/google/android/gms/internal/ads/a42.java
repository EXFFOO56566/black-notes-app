package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class a42 implements mt {
    private static j42 i = j42.a(a42.class);

    /* renamed from: b  reason: collision with root package name */
    private String f1695b;

    /* renamed from: c  reason: collision with root package name */
    boolean f1696c;
    private boolean d;
    private ByteBuffer e;
    private long f;
    private long g = -1;
    private d42 h;

    protected a42(String str) {
        this.f1695b = str;
        this.d = true;
        this.f1696c = true;
    }

    private final synchronized void b() {
        if (!this.d) {
            try {
                j42 j42 = i;
                String valueOf = String.valueOf(this.f1695b);
                j42.a(valueOf.length() != 0 ? "mem mapping ".concat(valueOf) : new String("mem mapping "));
                this.e = this.h.a(this.f, this.g);
                this.d = true;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final synchronized void a() {
        b();
        j42 j42 = i;
        String valueOf = String.valueOf(this.f1695b);
        j42.a(valueOf.length() != 0 ? "parsing details of ".concat(valueOf) : new String("parsing details of "));
        if (this.e != null) {
            ByteBuffer byteBuffer = this.e;
            this.f1696c = true;
            byteBuffer.rewind();
            a(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                byteBuffer.slice();
            }
            this.e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.mt
    public final void a(d42 d42, ByteBuffer byteBuffer, long j, ls lsVar) {
        this.f = d42.position();
        byteBuffer.remaining();
        this.g = j;
        this.h = d42;
        d42.b(d42.position() + j);
        this.d = false;
        this.f1696c = false;
        a();
    }

    @Override // com.google.android.gms.internal.ads.mt
    public final void a(mw mwVar) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(ByteBuffer byteBuffer);

    @Override // com.google.android.gms.internal.ads.mt
    public final String m() {
        return this.f1695b;
    }
}
