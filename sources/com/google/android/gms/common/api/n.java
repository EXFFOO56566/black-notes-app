package com.google.android.gms.common.api;

import b.c.b.a.c.d;

public final class n extends UnsupportedOperationException {

    /* renamed from: b  reason: collision with root package name */
    private final d f1598b;

    public n(d dVar) {
        this.f1598b = dVar;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f1598b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
