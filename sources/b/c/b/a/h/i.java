package b.c.b.a.h;

import com.google.android.gms.common.internal.r;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class i {

    private static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private final CountDownLatch f1226a;

        private a() {
            this.f1226a = new CountDownLatch(1);
        }

        /* synthetic */ a(v vVar) {
            this();
        }

        @Override // b.c.b.a.h.b
        public final void a() {
            this.f1226a.countDown();
        }

        @Override // b.c.b.a.h.c
        public final void a(Exception exc) {
            this.f1226a.countDown();
        }

        @Override // b.c.b.a.h.d
        public final void a(Object obj) {
            this.f1226a.countDown();
        }

        public final boolean a(long j, TimeUnit timeUnit) {
            return this.f1226a.await(j, timeUnit);
        }
    }

    interface b extends b, c, d<Object> {
    }

    public static <TResult> f<TResult> a(Executor executor, Callable<TResult> callable) {
        r.a(executor, "Executor must not be null");
        r.a(callable, "Callback must not be null");
        u uVar = new u();
        executor.execute(new v(uVar, callable));
        return uVar;
    }

    private static <TResult> TResult a(f<TResult> fVar) {
        if (fVar.e()) {
            return fVar.b();
        }
        if (fVar.c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(fVar.a());
    }

    public static <TResult> TResult a(f<TResult> fVar, long j, TimeUnit timeUnit) {
        r.a();
        r.a(fVar, "Task must not be null");
        r.a(timeUnit, "TimeUnit must not be null");
        if (fVar.d()) {
            return (TResult) a(fVar);
        }
        a aVar = new a(null);
        a((f<?>) fVar, (b) aVar);
        if (aVar.a(j, timeUnit)) {
            return (TResult) a(fVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    private static void a(f<?> fVar, b bVar) {
        fVar.a(h.f1224b, (d<? super Object>) bVar);
        fVar.a(h.f1224b, (c) bVar);
        fVar.a(h.f1224b, (b) bVar);
    }
}
