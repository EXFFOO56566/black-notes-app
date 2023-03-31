package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public final class xo1<V> implements Runnable {
    @NullableDecl

    /* renamed from: b  reason: collision with root package name */
    private vo1<V> f5471b;

    xo1(vo1<V> vo1) {
        this.f5471b = vo1;
    }

    public final void run() {
        lo1<? extends V> a2;
        vo1<V> vo1 = this.f5471b;
        if (vo1 != null && (a2 = vo1.a((vo1) vo1)) != null) {
            this.f5471b = null;
            if (a2.isDone()) {
                vo1.a((lo1) a2);
                return;
            }
            try {
                ScheduledFuture b2 = vo1.b((vo1) vo1);
                vo1.a((vo1) vo1, (ScheduledFuture) null);
                String str = "Timed out";
                if (b2 != null) {
                    try {
                        long abs = Math.abs(b2.getDelay(TimeUnit.MILLISECONDS));
                        if (abs > 10) {
                            StringBuilder sb = new StringBuilder(str.length() + 66);
                            sb.append(str);
                            sb.append(" (timeout delayed by ");
                            sb.append(abs);
                            sb.append(" ms after scheduled time)");
                            str = sb.toString();
                        }
                    } catch (Throwable th) {
                        vo1.a((Throwable) new wo1(str));
                        throw th;
                    }
                }
                String valueOf = String.valueOf(str);
                String valueOf2 = String.valueOf(a2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
                sb2.append(valueOf);
                sb2.append(": ");
                sb2.append(valueOf2);
                vo1.a((Throwable) new wo1(sb2.toString()));
            } finally {
                a2.cancel(true);
            }
        }
    }
}
