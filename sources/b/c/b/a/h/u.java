package b.c.b.a.h;

import com.google.android.gms.common.internal.r;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* access modifiers changed from: package-private */
public final class u<TResult> extends f<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1249a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final s<TResult> f1250b = new s<>();
    @GuardedBy("mLock")

    /* renamed from: c  reason: collision with root package name */
    private boolean f1251c;
    private volatile boolean d;
    @GuardedBy("mLock")
    private TResult e;
    @GuardedBy("mLock")
    private Exception f;

    u() {
    }

    @GuardedBy("mLock")
    private final void g() {
        r.b(this.f1251c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    private final void h() {
        r.b(!this.f1251c, "Task is already complete");
    }

    @GuardedBy("mLock")
    private final void i() {
        if (this.d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void j() {
        synchronized (this.f1249a) {
            if (this.f1251c) {
                this.f1250b.a(this);
            }
        }
    }

    @Override // b.c.b.a.h.f
    public final f<TResult> a(c cVar) {
        a(h.f1223a, cVar);
        return this;
    }

    @Override // b.c.b.a.h.f
    public final <TContinuationResult> f<TContinuationResult> a(Executor executor, a<TResult, TContinuationResult> aVar) {
        u uVar = new u();
        this.f1250b.a(new j(executor, aVar, uVar));
        j();
        return uVar;
    }

    @Override // b.c.b.a.h.f
    public final f<TResult> a(Executor executor, b bVar) {
        this.f1250b.a(new l(executor, bVar));
        j();
        return this;
    }

    @Override // b.c.b.a.h.f
    public final f<TResult> a(Executor executor, c cVar) {
        this.f1250b.a(new n(executor, cVar));
        j();
        return this;
    }

    @Override // b.c.b.a.h.f
    public final f<TResult> a(Executor executor, d<? super TResult> dVar) {
        this.f1250b.a(new p(executor, dVar));
        j();
        return this;
    }

    @Override // b.c.b.a.h.f
    public final Exception a() {
        Exception exc;
        synchronized (this.f1249a) {
            exc = this.f;
        }
        return exc;
    }

    public final void a(Exception exc) {
        r.a(exc, "Exception must not be null");
        synchronized (this.f1249a) {
            h();
            this.f1251c = true;
            this.f = exc;
        }
        this.f1250b.a(this);
    }

    public final void a(TResult tresult) {
        synchronized (this.f1249a) {
            h();
            this.f1251c = true;
            this.e = tresult;
        }
        this.f1250b.a(this);
    }

    @Override // b.c.b.a.h.f
    public final TResult b() {
        TResult tresult;
        synchronized (this.f1249a) {
            g();
            i();
            if (this.f == null) {
                tresult = this.e;
            } else {
                throw new e(this.f);
            }
        }
        return tresult;
    }

    public final boolean b(Exception exc) {
        r.a(exc, "Exception must not be null");
        synchronized (this.f1249a) {
            if (this.f1251c) {
                return false;
            }
            this.f1251c = true;
            this.f = exc;
            this.f1250b.a(this);
            return true;
        }
    }

    public final boolean b(TResult tresult) {
        synchronized (this.f1249a) {
            if (this.f1251c) {
                return false;
            }
            this.f1251c = true;
            this.e = tresult;
            this.f1250b.a(this);
            return true;
        }
    }

    @Override // b.c.b.a.h.f
    public final boolean c() {
        return this.d;
    }

    @Override // b.c.b.a.h.f
    public final boolean d() {
        boolean z;
        synchronized (this.f1249a) {
            z = this.f1251c;
        }
        return z;
    }

    @Override // b.c.b.a.h.f
    public final boolean e() {
        boolean z;
        synchronized (this.f1249a) {
            z = this.f1251c && !this.d && this.f == null;
        }
        return z;
    }

    public final boolean f() {
        synchronized (this.f1249a) {
            if (this.f1251c) {
                return false;
            }
            this.f1251c = true;
            this.d = true;
            this.f1250b.a(this);
            return true;
        }
    }
}
