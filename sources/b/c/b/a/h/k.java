package b.c.b.a.h;

final class k implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ f f1230b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j f1231c;

    k(j jVar, f fVar) {
        this.f1231c = jVar;
        this.f1230b = fVar;
    }

    public final void run() {
        if (this.f1230b.c()) {
            j.a(this.f1231c).f();
            return;
        }
        try {
            j.a(this.f1231c).a(j.b(this.f1231c).a(this.f1230b));
        } catch (e e) {
            if (e.getCause() instanceof Exception) {
                j.a(this.f1231c).a((Exception) e.getCause());
            } else {
                j.a(this.f1231c).a((Exception) e);
            }
        } catch (Exception e2) {
            j.a(this.f1231c).a(e2);
        }
    }
}
