package a.k.b;

import a.g.h.b;
import a.g.k.i;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public abstract class a<D> extends b<D> {
    private final Executor i;
    volatile a<D>.RunnableC0028a j;
    volatile a<D>.RunnableC0028a k;
    long l;
    long m;
    Handler n;

    /* access modifiers changed from: package-private */
    /* renamed from: a.k.b.a$a  reason: collision with other inner class name */
    public final class RunnableC0028a extends c<Void, Void, D> implements Runnable {
        private final CountDownLatch k = new CountDownLatch(1);
        boolean l;

        RunnableC0028a() {
        }

        /* access modifiers changed from: protected */
        public D a(Void... voidArr) {
            try {
                return (D) a.this.u();
            } catch (b e) {
                if (a()) {
                    return null;
                }
                throw e;
            }
        }

        /* access modifiers changed from: protected */
        @Override // a.k.b.c
        public void b(D d) {
            try {
                a.this.a(this, d);
            } finally {
                this.k.countDown();
            }
        }

        /* access modifiers changed from: protected */
        @Override // a.k.b.c
        public void c(D d) {
            try {
                a.this.b(this, d);
            } finally {
                this.k.countDown();
            }
        }

        public void run() {
            this.l = false;
            a.this.s();
        }
    }

    public a(Context context) {
        this(context, c.i);
    }

    private a(Context context, Executor executor) {
        super(context);
        this.m = -10000;
        this.i = executor;
    }

    /* access modifiers changed from: package-private */
    public void a(a<D>.RunnableC0028a aVar, D d) {
        c(d);
        if (this.k == aVar) {
            o();
            this.m = SystemClock.uptimeMillis();
            this.k = null;
            d();
            s();
        }
    }

    @Override // a.k.b.b
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.j);
            printWriter.print(" waiting=");
            printWriter.println(this.j.l);
        }
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.k);
            printWriter.print(" waiting=");
            printWriter.println(this.k.l);
        }
        if (this.l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            i.a(this.l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            i.a(this.m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(a<D>.RunnableC0028a aVar, D d) {
        if (this.j != aVar) {
            a(aVar, d);
        } else if (f()) {
            c(d);
        } else {
            c();
            this.m = SystemClock.uptimeMillis();
            this.j = null;
            b(d);
        }
    }

    public void c(D d) {
    }

    /* access modifiers changed from: protected */
    @Override // a.k.b.b
    public boolean h() {
        if (this.j == null) {
            return false;
        }
        if (!this.d) {
            this.g = true;
        }
        if (this.k != null) {
            if (this.j.l) {
                this.j.l = false;
                this.n.removeCallbacks(this.j);
            }
            this.j = null;
            return false;
        } else if (this.j.l) {
            this.j.l = false;
            this.n.removeCallbacks(this.j);
            this.j = null;
            return false;
        } else {
            boolean a2 = this.j.a(false);
            if (a2) {
                this.k = this.j;
                r();
            }
            this.j = null;
            return a2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // a.k.b.b
    public void j() {
        super.j();
        b();
        this.j = new RunnableC0028a();
        s();
    }

    public void r() {
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (this.k == null && this.j != null) {
            if (this.j.l) {
                this.j.l = false;
                this.n.removeCallbacks(this.j);
            }
            if (this.l <= 0 || SystemClock.uptimeMillis() >= this.m + this.l) {
                this.j.a(this.i, null);
                return;
            }
            this.j.l = true;
            this.n.postAtTime(this.j, this.m + this.l);
        }
    }

    public abstract D t();

    /* access modifiers changed from: protected */
    public D u() {
        return t();
    }
}
