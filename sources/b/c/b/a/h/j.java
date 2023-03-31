package b.c.b.a.h;

import java.util.concurrent.Executor;

public final class j<TResult, TContinuationResult> implements r<TResult> {

    /* renamed from: a */
    private final Executor f1227a;

    /* renamed from: b */
    private final a<TResult, TContinuationResult> f1228b;

    /* renamed from: c */
    private final u<TContinuationResult> f1229c;

    public j(Executor executor, a<TResult, TContinuationResult> aVar, u<TContinuationResult> uVar) {
        this.f1227a = executor;
        this.f1228b = aVar;
        this.f1229c = uVar;
    }

    @Override // b.c.b.a.h.r
    public final void a(f<TResult> fVar) {
        this.f1227a.execute(new k(this, fVar));
    }
}
