package a.a.n;

import a.g.l.a0;
import a.g.l.y;
import a.g.l.z;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public class h {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<y> f40a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private long f41b = -1;

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f42c;
    z d;
    private boolean e;
    private final a0 f = new a();

    class a extends a0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f43a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f44b = 0;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f44b = 0;
            this.f43a = false;
            h.this.b();
        }

        @Override // a.g.l.z
        public void b(View view) {
            int i = this.f44b + 1;
            this.f44b = i;
            if (i == h.this.f40a.size()) {
                z zVar = h.this.d;
                if (zVar != null) {
                    zVar.b(null);
                }
                a();
            }
        }

        @Override // a.g.l.a0, a.g.l.z
        public void c(View view) {
            if (!this.f43a) {
                this.f43a = true;
                z zVar = h.this.d;
                if (zVar != null) {
                    zVar.c(null);
                }
            }
        }
    }

    public h a(long j) {
        if (!this.e) {
            this.f41b = j;
        }
        return this;
    }

    public h a(y yVar) {
        if (!this.e) {
            this.f40a.add(yVar);
        }
        return this;
    }

    public h a(y yVar, y yVar2) {
        this.f40a.add(yVar);
        yVar2.b(yVar.b());
        this.f40a.add(yVar2);
        return this;
    }

    public h a(z zVar) {
        if (!this.e) {
            this.d = zVar;
        }
        return this;
    }

    public h a(Interpolator interpolator) {
        if (!this.e) {
            this.f42c = interpolator;
        }
        return this;
    }

    public void a() {
        if (this.e) {
            Iterator<y> it = this.f40a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.e = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.e = false;
    }

    public void c() {
        if (!this.e) {
            Iterator<y> it = this.f40a.iterator();
            while (it.hasNext()) {
                y next = it.next();
                long j = this.f41b;
                if (j >= 0) {
                    next.a(j);
                }
                Interpolator interpolator = this.f42c;
                if (interpolator != null) {
                    next.a(interpolator);
                }
                if (this.d != null) {
                    next.a(this.f);
                }
                next.c();
            }
            this.e = true;
        }
    }
}
