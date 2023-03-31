package a.k.b;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

abstract class c<Params, Progress, Result> {
    private static final ThreadFactory g = new a();
    private static final BlockingQueue<Runnable> h = new LinkedBlockingQueue(10);
    public static final Executor i = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, h, g);
    private static f j;

    /* renamed from: b  reason: collision with root package name */
    private final h<Params, Result> f286b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final FutureTask<Result> f287c = new C0030c(this.f286b);
    private volatile g d = g.PENDING;
    final AtomicBoolean e = new AtomicBoolean();
    final AtomicBoolean f = new AtomicBoolean();

    static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f288a = new AtomicInteger(1);

        a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f288a.getAndIncrement());
        }
    }

    class b extends h<Params, Result> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() {
            c.this.f.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) c.this.a((Object[]) this.f296a);
                Binder.flushPendingCommands();
                c.this.d(result);
                return result;
            } catch (Throwable th) {
                c.this.d(result);
                throw th;
            }
        }
    }

    /* renamed from: a.k.b.c$c  reason: collision with other inner class name */
    class C0030c extends FutureTask<Result> {
        C0030c(Callable callable) {
            super(callable);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: a.k.b.c */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: protected */
        public void done() {
            try {
                c.this.e(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                c.this.e(null);
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f291a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                a.k.b.c$g[] r0 = a.k.b.c.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a.k.b.c.d.f291a = r0
                a.k.b.c$g r1 = a.k.b.c.g.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a.k.b.c.d.f291a     // Catch:{ NoSuchFieldError -> 0x001d }
                a.k.b.c$g r1 = a.k.b.c.g.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.k.b.c.d.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static class e<Data> {

        /* renamed from: a  reason: collision with root package name */
        final c f292a;

        /* renamed from: b  reason: collision with root package name */
        final Data[] f293b;

        e(c cVar, Data... dataArr) {
            this.f292a = cVar;
            this.f293b = dataArr;
        }
    }

    /* access modifiers changed from: private */
    public static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.f292a.a(eVar.f293b[0]);
            } else if (i == 2) {
                eVar.f292a.b((Object[]) eVar.f293b);
            }
        }
    }

    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    private static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: a  reason: collision with root package name */
        Params[] f296a;

        h() {
        }
    }

    c() {
    }

    private static Handler d() {
        f fVar;
        synchronized (c.class) {
            if (j == null) {
                j = new f();
            }
            fVar = j;
        }
        return fVar;
    }

    public final c<Params, Progress, Result> a(Executor executor, Params... paramsArr) {
        if (this.d != g.PENDING) {
            int i2 = d.f291a[this.d.ordinal()];
            if (i2 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i2 != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.d = g.RUNNING;
            c();
            this.f286b.f296a = paramsArr;
            executor.execute(this.f287c);
            return this;
        }
    }

    /* access modifiers changed from: protected */
    public abstract Result a(Params... paramsArr);

    /* access modifiers changed from: package-private */
    public void a(Result result) {
        if (a()) {
            b(result);
        } else {
            c(result);
        }
        this.d = g.FINISHED;
    }

    public final boolean a() {
        return this.e.get();
    }

    public final boolean a(boolean z) {
        this.e.set(true);
        return this.f287c.cancel(z);
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public void b(Result result) {
        b();
    }

    /* access modifiers changed from: protected */
    public void b(Progress... progressArr) {
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    /* access modifiers changed from: protected */
    public void c(Result result) {
    }

    /* access modifiers changed from: package-private */
    public Result d(Result result) {
        d().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: package-private */
    public void e(Result result) {
        if (!this.f.get()) {
            d(result);
        }
    }
}
