package b.c.b.a.h;

final class m implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ l f1235b;

    m(l lVar) {
        this.f1235b = lVar;
    }

    public final void run() {
        synchronized (l.a(this.f1235b)) {
            if (l.b(this.f1235b) != null) {
                l.b(this.f1235b).a();
            }
        }
    }
}
