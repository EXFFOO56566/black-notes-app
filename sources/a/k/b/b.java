package a.k.b;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class b<D> {

    /* renamed from: a  reason: collision with root package name */
    int f283a;

    /* renamed from: b  reason: collision with root package name */
    AbstractC0029b<D> f284b;

    /* renamed from: c  reason: collision with root package name */
    a<D> f285c;
    boolean d = false;
    boolean e = false;
    boolean f = true;
    boolean g = false;
    boolean h = false;

    public interface a<D> {
        void a(b<D> bVar);
    }

    /* renamed from: a.k.b.b$b  reason: collision with other inner class name */
    public interface AbstractC0029b<D> {
        void a(b<D> bVar, D d);
    }

    public b(Context context) {
        context.getApplicationContext();
    }

    public String a(D d2) {
        StringBuilder sb = new StringBuilder(64);
        a.g.k.a.a(d2, sb);
        sb.append("}");
        return sb.toString();
    }

    public void a() {
        this.e = true;
        g();
    }

    public void a(int i, AbstractC0029b<D> bVar) {
        if (this.f284b == null) {
            this.f284b = bVar;
            this.f283a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void a(AbstractC0029b<D> bVar) {
        AbstractC0029b<D> bVar2 = this.f284b;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (bVar2 == bVar) {
            this.f284b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f283a);
        printWriter.print(" mListener=");
        printWriter.println(this.f284b);
        if (this.d || this.g || this.h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.h);
        }
        if (this.e || this.f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.e);
            printWriter.print(" mReset=");
            printWriter.println(this.f);
        }
    }

    public void b(D d2) {
        AbstractC0029b<D> bVar = this.f284b;
        if (bVar != null) {
            bVar.a(this, d2);
        }
    }

    public boolean b() {
        return h();
    }

    public void c() {
        this.h = false;
    }

    public void d() {
        a<D> aVar = this.f285c;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void e() {
        j();
    }

    public boolean f() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public void g() {
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        throw null;
    }

    public void i() {
        if (this.d) {
            e();
        } else {
            this.g = true;
        }
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    /* access modifiers changed from: protected */
    public void k() {
    }

    /* access modifiers changed from: protected */
    public void l() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void m() {
    }

    public void n() {
        k();
        this.f = true;
        this.d = false;
        this.e = false;
        this.g = false;
        this.h = false;
    }

    public void o() {
        if (this.h) {
            i();
        }
    }

    public final void p() {
        this.d = true;
        this.f = false;
        this.e = false;
        l();
    }

    public void q() {
        this.d = false;
        m();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        a.g.k.a.a(this, sb);
        sb.append(" id=");
        sb.append(this.f283a);
        sb.append("}");
        return sb.toString();
    }
}
