package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.r.a;
import javax.annotation.concurrent.GuardedBy;

public final class uz0 implements a {
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private no2 f5028b;

    public final synchronized no2 a() {
        return this.f5028b;
    }

    public final synchronized void a(no2 no2) {
        this.f5028b = no2;
    }

    @Override // com.google.android.gms.ads.r.a
    public final synchronized void a(String str, String str2) {
        if (this.f5028b != null) {
            try {
                this.f5028b.a(str, str2);
            } catch (RemoteException e) {
                co.c("Remote Exception at onAppEvent.", e);
            }
        }
    }
}
