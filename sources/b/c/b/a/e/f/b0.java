package b.c.b.a.e.f;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

public final class b0 extends g0 {

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<Bundle> f1200b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f1201c;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r4 = r4.get("r");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T a(android.os.Bundle r4, java.lang.Class<T> r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x0038
            java.lang.String r1 = "r"
            java.lang.Object r4 = r4.get(r1)
            if (r4 == 0) goto L_0x0038
            java.lang.Object r4 = r5.cast(r4)     // Catch:{ ClassCastException -> 0x0010 }
            return r4
        L_0x0010:
            r0 = move-exception
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received"
            java.lang.String r2 = ": %s, %s"
            java.lang.String r1 = r1.concat(r2)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = java.lang.String.format(r1, r2)
            java.lang.String r5 = "AM"
            android.util.Log.w(r5, r4, r0)
            throw r0
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.b.a.e.f.b0.a(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final String a(long j) {
        return (String) a(b(j), String.class);
    }

    public final Bundle b(long j) {
        Bundle bundle;
        synchronized (this.f1200b) {
            if (!this.f1201c) {
                try {
                    this.f1200b.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f1200b.get();
        }
        return bundle;
    }

    @Override // b.c.b.a.e.f.e0
    public final void h(Bundle bundle) {
        synchronized (this.f1200b) {
            try {
                this.f1200b.set(bundle);
                this.f1201c = true;
                this.f1200b.notify();
            } catch (Throwable th) {
                this.f1200b.notify();
                throw th;
            }
        }
    }
}
