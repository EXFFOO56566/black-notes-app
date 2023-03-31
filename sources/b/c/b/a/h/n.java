package b.c.b.a.h;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* access modifiers changed from: package-private */
public final class n<TResult> implements r<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f1236a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f1237b = new Object();
    @GuardedBy("mLock")

    /* renamed from: c  reason: collision with root package name */
    private c f1238c;

    public n(Executor executor, c cVar) {
        this.f1236a = executor;
        this.f1238c = cVar;
    }

    @Override // b.c.b.a.h.r
    public final void a(f<TResult> fVar) {
        if (!fVar.e() && !fVar.c()) {
            synchronized (this.f1237b) {
                if (this.f1238c != null) {
                    this.f1236a.execute(new o(this, fVar));
                }
            }
        }
    }
}
