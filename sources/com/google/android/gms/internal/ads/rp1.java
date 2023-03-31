package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class rp1 {

    /* renamed from: a  reason: collision with root package name */
    private yu1 f4534a;

    private rp1(yu1 yu1) {
        this.f4534a = yu1;
    }

    static final rp1 a(yu1 yu1) {
        if (yu1 != null && yu1.r() > 0) {
            return new rp1(yu1);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* access modifiers changed from: package-private */
    public final yu1 a() {
        return this.f4534a;
    }

    public final String toString() {
        return jq1.a(this.f4534a).toString();
    }
}
