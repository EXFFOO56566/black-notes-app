package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class i42 extends j42 {

    /* renamed from: a  reason: collision with root package name */
    private Logger f3024a;

    public i42(String str) {
        this.f3024a = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.j42
    public final void a(String str) {
        this.f3024a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
