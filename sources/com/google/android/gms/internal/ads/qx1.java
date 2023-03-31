package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.util.List;

final class qx1 extends px1 {

    /* renamed from: a  reason: collision with root package name */
    private final ox1 f4413a = new ox1();

    qx1() {
    }

    @Override // com.google.android.gms.internal.ads.px1
    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> a2 = this.f4413a.a(th, false);
        if (a2 != null) {
            synchronized (a2) {
                for (Throwable th2 : a2) {
                    printWriter.print("Suppressed: ");
                    th2.printStackTrace(printWriter);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.px1
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f4413a.a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
