package a.b.a.a;

import java.util.concurrent.Executor;

public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f47c;

    /* renamed from: a  reason: collision with root package name */
    private c f48a;

    /* renamed from: b  reason: collision with root package name */
    private c f49b;

    /* renamed from: a.b.a.a.a$a  reason: collision with other inner class name */
    static class ExecutorC0003a implements Executor {
        ExecutorC0003a() {
        }

        public void execute(Runnable runnable) {
            a.b().b(runnable);
        }
    }

    static class b implements Executor {
        b() {
        }

        public void execute(Runnable runnable) {
            a.b().a(runnable);
        }
    }

    static {
        new ExecutorC0003a();
        new b();
    }

    private a() {
        b bVar = new b();
        this.f49b = bVar;
        this.f48a = bVar;
    }

    public static a b() {
        if (f47c != null) {
            return f47c;
        }
        synchronized (a.class) {
            if (f47c == null) {
                f47c = new a();
            }
        }
        return f47c;
    }

    @Override // a.b.a.a.c
    public void a(Runnable runnable) {
        this.f48a.a(runnable);
    }

    @Override // a.b.a.a.c
    public boolean a() {
        return this.f48a.a();
    }

    @Override // a.b.a.a.c
    public void b(Runnable runnable) {
        this.f48a.b(runnable);
    }
}
