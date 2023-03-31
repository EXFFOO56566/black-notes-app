package b.c.b.a.h;

import java.util.concurrent.Callable;

final class v implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ u f1252b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Callable f1253c;

    v(u uVar, Callable callable) {
        this.f1252b = uVar;
        this.f1253c = callable;
    }

    public final void run() {
        try {
            this.f1252b.a(this.f1253c.call());
        } catch (Exception e) {
            this.f1252b.a(e);
        }
    }
}
