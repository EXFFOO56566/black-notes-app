package b.c.b.a.h;

final class q implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ f f1244b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ p f1245c;

    q(p pVar, f fVar) {
        this.f1245c = pVar;
        this.f1244b = fVar;
    }

    public final void run() {
        synchronized (this.f1245c.f1242b) {
            if (this.f1245c.f1243c != null) {
                this.f1245c.f1243c.a(this.f1244b.b());
            }
        }
    }
}
