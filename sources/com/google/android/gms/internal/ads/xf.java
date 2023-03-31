package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* access modifiers changed from: package-private */
public final /* synthetic */ class xf implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final OutputStream f5418b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f5419c;

    xf(OutputStream outputStream, byte[] bArr) {
        this.f5418b = outputStream;
        this.f5419c = bArr;
    }

    public final void run() {
        yf.a(this.f5418b, this.f5419c);
    }
}
