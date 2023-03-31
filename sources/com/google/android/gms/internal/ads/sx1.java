package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

final class sx1 extends px1 {
    sx1() {
    }

    @Override // com.google.android.gms.internal.ads.px1
    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }

    @Override // com.google.android.gms.internal.ads.px1
    public final void a(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }
}
