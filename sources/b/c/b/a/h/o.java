package b.c.b.a.h;

final class o implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ f f1239b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ n f1240c;

    o(n nVar, f fVar) {
        this.f1240c = nVar;
        this.f1239b = fVar;
    }

    public final void run() {
        synchronized (this.f1240c.f1237b) {
            if (this.f1240c.f1238c != null) {
                this.f1240c.f1238c.a(this.f1239b.a());
            }
        }
    }
}
