package a.g.i;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Object f151a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private HandlerThread f152b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f153c;
    private int d;
    private Handler.Callback e = new a();
    private final int f;
    private final int g;
    private final String h;

    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                c.this.a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                c.this.a((Runnable) message.obj);
                return true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Callable f155b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Handler f156c;
        final /* synthetic */ d d;

        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f157b;

            a(Object obj) {
                this.f157b = obj;
            }

            public void run() {
                b.this.d.a(this.f157b);
            }
        }

        b(c cVar, Callable callable, Handler handler, d dVar) {
            this.f155b = callable;
            this.f156c = handler;
            this.d = dVar;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f155b.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f156c.post(new a(obj));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.g.i.c$c  reason: collision with other inner class name */
    public class RunnableC0012c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicReference f159b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Callable f160c;
        final /* synthetic */ ReentrantLock d;
        final /* synthetic */ AtomicBoolean e;
        final /* synthetic */ Condition f;

        RunnableC0012c(c cVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f159b = atomicReference;
            this.f160c = callable;
            this.d = reentrantLock;
            this.e = atomicBoolean;
            this.f = condition;
        }

        public void run() {
            try {
                this.f159b.set(this.f160c.call());
            } catch (Exception unused) {
            }
            this.d.lock();
            try {
                this.e.set(false);
                this.f.signal();
            } finally {
                this.d.unlock();
            }
        }
    }

    public interface d<T> {
        void a(T t);
    }

    public c(String str, int i, int i2) {
        this.h = str;
        this.g = i;
        this.f = i2;
        this.d = 0;
    }

    private void b(Runnable runnable) {
        synchronized (this.f151a) {
            if (this.f152b == null) {
                HandlerThread handlerThread = new HandlerThread(this.h, this.g);
                this.f152b = handlerThread;
                handlerThread.start();
                this.f153c = new Handler(this.f152b.getLooper(), this.e);
                this.d++;
            }
            this.f153c.removeMessages(0);
            this.f153c.sendMessage(this.f153c.obtainMessage(1, runnable));
        }
    }

    public <T> T a(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        b(new RunnableC0012c(this, atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    T t = (T) atomicReference.get();
                    reentrantLock.unlock();
                    return t;
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        synchronized (this.f151a) {
            if (!this.f153c.hasMessages(1)) {
                this.f152b.quit();
                this.f152b = null;
                this.f153c = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Runnable runnable) {
        runnable.run();
        synchronized (this.f151a) {
            this.f153c.removeMessages(0);
            this.f153c.sendMessageDelayed(this.f153c.obtainMessage(0), (long) this.f);
        }
    }

    public <T> void a(Callable<T> callable, d<T> dVar) {
        b(new b(this, callable, new Handler(), dVar));
    }
}
