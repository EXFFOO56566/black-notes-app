package b.c.b.a.h;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* access modifiers changed from: package-private */
public final class p<TResult> implements r<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f1241a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f1242b = new Object();
    @GuardedBy("mLock")

    /* renamed from: c  reason: collision with root package name */
    private d<? super TResult> f1243c;

    public p(Executor executor, d<? super TResult> dVar) {
        this.f1241a = executor;
        this.f1243c = dVar;
    }

    @Override // b.c.b.a.h.r
    public final void a(f<TResult> fVar) {
        if (fVar.e()) {
            synchronized (this.f1242b) {
                if (this.f1243c != null) {
                    this.f1241a.execute(new q(this, fVar));
                }
            }
        }
    }
}
