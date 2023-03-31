package b.c.b.a.h;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* access modifiers changed from: package-private */
public final class l<TResult> implements r<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f1232a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f1233b = new Object();
    @GuardedBy("mLock")

    /* renamed from: c  reason: collision with root package name */
    private b f1234c;

    public l(Executor executor, b bVar) {
        this.f1232a = executor;
        this.f1234c = bVar;
    }

    @Override // b.c.b.a.h.r
    public final void a(f fVar) {
        if (fVar.c()) {
            synchronized (this.f1233b) {
                if (this.f1234c != null) {
                    this.f1232a.execute(new m(this));
                }
            }
        }
    }
}
