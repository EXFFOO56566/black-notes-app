package b.c.b.a.h;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* access modifiers changed from: package-private */
public final class s<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1246a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b  reason: collision with root package name */
    private Queue<r<TResult>> f1247b;
    @GuardedBy("mLock")

    /* renamed from: c  reason: collision with root package name */
    private boolean f1248c;

    s() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f1246a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r2.f1247b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f1248c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.a(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(b.c.b.a.h.f<TResult> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f1246a
            monitor-enter(r0)
            java.util.Queue<b.c.b.a.h.r<TResult>> r1 = r2.f1247b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f1248c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f1248c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f1246a
            monitor-enter(r1)
            java.util.Queue<b.c.b.a.h.r<TResult>> r0 = r2.f1247b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            b.c.b.a.h.r r0 = (b.c.b.a.h.r) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f1248c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.a(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r1)
            throw r3
        L_0x002a:
            monitor-exit(r0)
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.b.a.h.s.a(b.c.b.a.h.f):void");
    }

    public final void a(r<TResult> rVar) {
        synchronized (this.f1246a) {
            if (this.f1247b == null) {
                this.f1247b = new ArrayDeque();
            }
            this.f1247b.add(rVar);
        }
    }
}
