package a.b.a.a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    private final Object f50a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f51b = Executors.newFixedThreadPool(2, new a(this));

    /* renamed from: c  reason: collision with root package name */
    private volatile Handler f52c;

    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f53a = new AtomicInteger(0);

        a(b bVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f53a.getAndIncrement())));
            return thread;
        }
    }

    @Override // a.b.a.a.c
    public void a(Runnable runnable) {
        this.f51b.execute(runnable);
    }

    @Override // a.b.a.a.c
    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // a.b.a.a.c
    public void b(Runnable runnable) {
        if (this.f52c == null) {
            synchronized (this.f50a) {
                if (this.f52c == null) {
                    this.f52c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f52c.post(runnable);
    }
}
