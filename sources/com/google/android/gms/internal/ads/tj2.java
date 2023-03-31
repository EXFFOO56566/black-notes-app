package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

final /* synthetic */ class tj2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final qj2 f4823b;

    /* renamed from: c  reason: collision with root package name */
    private final jj2 f4824c;
    private final ij2 d;
    private final ro e;

    tj2(qj2 qj2, jj2 jj2, ij2 ij2, ro roVar) {
        this.f4823b = qj2;
        this.f4824c = jj2;
        this.d = ij2;
        this.e = roVar;
    }

    public final void run() {
        qj2 qj2 = this.f4823b;
        jj2 jj2 = this.f4824c;
        ij2 ij2 = this.d;
        ro roVar = this.e;
        try {
            hj2 a2 = jj2.A().a(ij2);
            if (!a2.d()) {
                roVar.a(new RuntimeException("No entry contents."));
                qj2.f4347c.a();
                return;
            }
            vj2 vj2 = new vj2(qj2, a2.e(), 1);
            int read = vj2.read();
            if (read != -1) {
                vj2.unread(read);
                roVar.b(vj2);
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e2) {
            co.b("Unable to obtain a cache service instance.", e2);
            roVar.a(e2);
            qj2.f4347c.a();
        }
    }
}
