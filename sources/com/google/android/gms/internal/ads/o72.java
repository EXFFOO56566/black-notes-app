package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class o72 extends Exception {
    private o72(int i, String str, Throwable th, int i2) {
        super(null, th);
    }

    public static o72 a(IOException iOException) {
        return new o72(0, null, iOException, -1);
    }

    public static o72 a(Exception exc, int i) {
        return new o72(1, null, exc, i);
    }

    static o72 a(RuntimeException runtimeException) {
        return new o72(2, null, runtimeException, -1);
    }
}
