package a.k.a;

import a.k.a.a;
import a.k.b.b;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.h;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* access modifiers changed from: package-private */
public class b extends a {

    /* renamed from: c  reason: collision with root package name */
    static boolean f275c = false;

    /* renamed from: a  reason: collision with root package name */
    private final h f276a;

    /* renamed from: b  reason: collision with root package name */
    private final c f277b;

    public static class a<D> extends m<D> implements b.AbstractC0029b<D> {
        private final int k;
        private final Bundle l;
        private final a.k.b.b<D> m;
        private h n;
        private C0027b<D> o;
        private a.k.b.b<D> p;

        a(int i, Bundle bundle, a.k.b.b<D> bVar, a.k.b.b<D> bVar2) {
            this.k = i;
            this.l = bundle;
            this.m = bVar;
            this.p = bVar2;
            bVar.a(i, this);
        }

        /* access modifiers changed from: package-private */
        public a.k.b.b<D> a(h hVar, a.AbstractC0026a<D> aVar) {
            C0027b<D> bVar = new C0027b<>(this.m, aVar);
            a(hVar, bVar);
            C0027b<D> bVar2 = this.o;
            if (bVar2 != null) {
                a((n) bVar2);
            }
            this.n = hVar;
            this.o = bVar;
            return this.m;
        }

        /* access modifiers changed from: package-private */
        public a.k.b.b<D> a(boolean z) {
            if (b.f275c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.m.b();
            this.m.a();
            C0027b<D> bVar = this.o;
            if (bVar != null) {
                a((n) bVar);
                if (z) {
                    bVar.b();
                }
            }
            this.m.a((b.AbstractC0029b) this);
            if ((bVar == null || bVar.a()) && !z) {
                return this.m;
            }
            this.m.n();
            return this.p;
        }

        @Override // a.k.b.b.AbstractC0029b
        public void a(a.k.b.b<D> bVar, D d) {
            if (b.f275c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                b((Object) d);
                return;
            }
            if (b.f275c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            a((Object) d);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.n<? super D> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void a(n<? super D> nVar) {
            super.a((n) nVar);
            this.n = null;
            this.o = null;
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.k);
            printWriter.print(" mArgs=");
            printWriter.println(this.l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.m);
            a.k.b.b<D> bVar = this.m;
            bVar.a(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.o != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.o);
                C0027b<D> bVar2 = this.o;
                bVar2.a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(e().a((Object) ((D) a())));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(b());
        }

        @Override // androidx.lifecycle.LiveData, androidx.lifecycle.m
        public void b(D d) {
            super.b((Object) d);
            a.k.b.b<D> bVar = this.p;
            if (bVar != null) {
                bVar.n();
                this.p = null;
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void c() {
            if (b.f275c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.m.p();
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void d() {
            if (b.f275c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.m.q();
        }

        /* access modifiers changed from: package-private */
        public a.k.b.b<D> e() {
            return this.m;
        }

        /* access modifiers changed from: package-private */
        public void f() {
            h hVar = this.n;
            C0027b<D> bVar = this.o;
            if (hVar != null && bVar != null) {
                super.a((n) bVar);
                a(hVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.k);
            sb.append(" : ");
            a.g.k.a.a(this.m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.k.a.b$b  reason: collision with other inner class name */
    public static class C0027b<D> implements n<D> {

        /* renamed from: a  reason: collision with root package name */
        private final a.k.b.b<D> f278a;

        /* renamed from: b  reason: collision with root package name */
        private final a.AbstractC0026a<D> f279b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f280c = false;

        C0027b(a.k.b.b<D> bVar, a.AbstractC0026a<D> aVar) {
            this.f278a = bVar;
            this.f279b = aVar;
        }

        @Override // androidx.lifecycle.n
        public void a(D d) {
            if (b.f275c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f278a + ": " + this.f278a.a((Object) d));
            }
            this.f279b.a(this.f278a, d);
            this.f280c = true;
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f280c);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f280c;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (this.f280c) {
                if (b.f275c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f278a);
                }
                this.f279b.a(this.f278a);
            }
        }

        public String toString() {
            return this.f279b.toString();
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends q {
        private static final r.a d = new a();

        /* renamed from: b  reason: collision with root package name */
        private a.e.h<a> f281b = new a.e.h<>();

        /* renamed from: c  reason: collision with root package name */
        private boolean f282c = false;

        static class a implements r.a {
            a() {
            }

            @Override // androidx.lifecycle.r.a
            public <T extends q> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c a(s sVar) {
            return (c) new r(sVar, d).a(c.class);
        }

        /* access modifiers changed from: package-private */
        public <D> a<D> a(int i) {
            return this.f281b.a(i);
        }

        /* access modifiers changed from: package-private */
        public void a(int i, a aVar) {
            this.f281b.c(i, aVar);
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f281b.c() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f281b.c(); i++) {
                    a d2 = this.f281b.d(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f281b.b(i));
                    printWriter.print(": ");
                    printWriter.println(d2.toString());
                    d2.a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.q
        public void b() {
            super.b();
            int c2 = this.f281b.c();
            for (int i = 0; i < c2; i++) {
                this.f281b.d(i).a(true);
            }
            this.f281b.a();
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f282c = false;
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            return this.f282c;
        }

        /* access modifiers changed from: package-private */
        public void e() {
            int c2 = this.f281b.c();
            for (int i = 0; i < c2; i++) {
                this.f281b.d(i).f();
            }
        }

        /* access modifiers changed from: package-private */
        public void f() {
            this.f282c = true;
        }
    }

    b(h hVar, s sVar) {
        this.f276a = hVar;
        this.f277b = c.a(sVar);
    }

    /* JADX INFO: finally extract failed */
    private <D> a.k.b.b<D> a(int i, Bundle bundle, a.AbstractC0026a<D> aVar, a.k.b.b<D> bVar) {
        try {
            this.f277b.f();
            a.k.b.b<D> a2 = aVar.a(i, bundle);
            if (a2 != null) {
                if (a2.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(a2.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + a2);
                    }
                }
                a aVar2 = new a(i, bundle, a2, bVar);
                if (f275c) {
                    Log.v("LoaderManager", "  Created new loader " + aVar2);
                }
                this.f277b.a(i, aVar2);
                this.f277b.c();
                return aVar2.a(this.f276a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f277b.c();
            throw th;
        }
    }

    @Override // a.k.a.a
    public <D> a.k.b.b<D> a(int i, Bundle bundle, a.AbstractC0026a<D> aVar) {
        if (this.f277b.d()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            a<D> a2 = this.f277b.a(i);
            if (f275c) {
                Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
            }
            if (a2 == null) {
                return a(i, bundle, aVar, (a.k.b.b) null);
            }
            if (f275c) {
                Log.v("LoaderManager", "  Re-using existing loader " + a2);
            }
            return a2.a(this.f276a, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    @Override // a.k.a.a
    public void a() {
        this.f277b.e();
    }

    @Override // a.k.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f277b.a(str, fileDescriptor, printWriter, strArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        a.g.k.a.a(this.f276a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
