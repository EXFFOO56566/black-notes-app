package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public class b {

    /* renamed from: a  reason: collision with root package name */
    final AbstractC0049b f1023a;

    /* renamed from: b  reason: collision with root package name */
    final a f1024b = new a();

    /* renamed from: c  reason: collision with root package name */
    final List<View> f1025c = new ArrayList();

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f1026a = 0;

        /* renamed from: b  reason: collision with root package name */
        a f1027b;

        a() {
        }

        private void b() {
            if (this.f1027b == null) {
                this.f1027b = new a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1026a = 0;
            a aVar = this.f1027b;
            if (aVar != null) {
                aVar.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i) {
            if (i >= 64) {
                a aVar = this.f1027b;
                if (aVar != null) {
                    aVar.a(i - 64);
                    return;
                }
                return;
            }
            this.f1026a &= ~(1 << i);
        }

        /* access modifiers changed from: package-private */
        public void a(int i, boolean z) {
            if (i >= 64) {
                b();
                this.f1027b.a(i - 64, z);
                return;
            }
            boolean z2 = (this.f1026a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f1026a;
            this.f1026a = ((j2 & (~j)) << 1) | (j2 & j);
            if (z) {
                e(i);
            } else {
                a(i);
            }
            if (z2 || this.f1027b != null) {
                b();
                this.f1027b.a(0, z2);
            }
        }

        /* access modifiers changed from: package-private */
        public int b(int i) {
            a aVar = this.f1027b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.f1026a) : Long.bitCount(this.f1026a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f1026a & ((1 << i) - 1)) : aVar.b(i - 64) + Long.bitCount(this.f1026a);
        }

        /* access modifiers changed from: package-private */
        public boolean c(int i) {
            if (i < 64) {
                return (this.f1026a & (1 << i)) != 0;
            }
            b();
            return this.f1027b.c(i - 64);
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i) {
            if (i >= 64) {
                b();
                return this.f1027b.d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f1026a & j) != 0;
            long j2 = this.f1026a & (~j);
            this.f1026a = j2;
            long j3 = j - 1;
            this.f1026a = (j2 & j3) | Long.rotateRight((~j3) & j2, 1);
            a aVar = this.f1027b;
            if (aVar != null) {
                if (aVar.c(0)) {
                    e(63);
                }
                this.f1027b.d(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public void e(int i) {
            if (i >= 64) {
                b();
                this.f1027b.e(i - 64);
                return;
            }
            this.f1026a |= 1 << i;
        }

        public String toString() {
            if (this.f1027b == null) {
                return Long.toBinaryString(this.f1026a);
            }
            return this.f1027b.toString() + "xx" + Long.toBinaryString(this.f1026a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    public interface AbstractC0049b {
        int a();

        View a(int i);

        void a(View view);

        void a(View view, int i);

        void a(View view, int i, ViewGroup.LayoutParams layoutParams);

        RecyclerView.d0 b(View view);

        void b();

        void b(int i);

        void c(int i);

        void c(View view);

        int d(View view);
    }

    b(AbstractC0049b bVar) {
        this.f1023a = bVar;
    }

    private int f(int i) {
        if (i < 0) {
            return -1;
        }
        int a2 = this.f1023a.a();
        int i2 = i;
        while (i2 < a2) {
            int b2 = i - (i2 - this.f1024b.b(i2));
            if (b2 == 0) {
                while (this.f1024b.c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    private void g(View view) {
        this.f1025c.add(view);
        this.f1023a.a(view);
    }

    private boolean h(View view) {
        if (!this.f1025c.remove(view)) {
            return false;
        }
        this.f1023a.c(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f1023a.a() - this.f1025c.size();
    }

    /* access modifiers changed from: package-private */
    public void a(int i) {
        int f = f(i);
        this.f1024b.d(f);
        this.f1023a.b(f);
    }

    /* access modifiers changed from: package-private */
    public void a(View view) {
        int d = this.f1023a.d(view);
        if (d >= 0) {
            this.f1024b.e(d);
            g(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int a2 = i < 0 ? this.f1023a.a() : f(i);
        this.f1024b.a(a2, z);
        if (z) {
            g(view);
        }
        this.f1023a.a(view, a2, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i, boolean z) {
        int a2 = i < 0 ? this.f1023a.a() : f(i);
        this.f1024b.a(a2, z);
        if (z) {
            g(view);
        }
        this.f1023a.a(view, a2);
    }

    /* access modifiers changed from: package-private */
    public void a(View view, boolean z) {
        a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f1023a.a();
    }

    /* access modifiers changed from: package-private */
    public int b(View view) {
        int d = this.f1023a.d(view);
        if (d != -1 && !this.f1024b.c(d)) {
            return d - this.f1024b.b(d);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public View b(int i) {
        int size = this.f1025c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f1025c.get(i2);
            RecyclerView.d0 b2 = this.f1023a.b(view);
            if (!(b2.k() != i || b2.q() || b2.s())) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View c(int i) {
        return this.f1023a.a(f(i));
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f1024b.a();
        for (int size = this.f1025c.size() - 1; size >= 0; size--) {
            this.f1023a.c(this.f1025c.get(size));
            this.f1025c.remove(size);
        }
        this.f1023a.b();
    }

    /* access modifiers changed from: package-private */
    public boolean c(View view) {
        return this.f1025c.contains(view);
    }

    /* access modifiers changed from: package-private */
    public View d(int i) {
        return this.f1023a.a(i);
    }

    /* access modifiers changed from: package-private */
    public void d(View view) {
        int d = this.f1023a.d(view);
        if (d >= 0) {
            if (this.f1024b.d(d)) {
                h(view);
            }
            this.f1023a.c(d);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(int i) {
        int f = f(i);
        View a2 = this.f1023a.a(f);
        if (a2 != null) {
            if (this.f1024b.d(f)) {
                h(a2);
            }
            this.f1023a.c(f);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e(View view) {
        int d = this.f1023a.d(view);
        if (d == -1) {
            h(view);
            return true;
        } else if (!this.f1024b.c(d)) {
            return false;
        } else {
            this.f1024b.d(d);
            h(view);
            this.f1023a.c(d);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void f(View view) {
        int d = this.f1023a.d(view);
        if (d < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f1024b.c(d)) {
            this.f1024b.a(d);
            h(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f1024b.toString() + ", hidden list:" + this.f1025c.size();
    }
}
