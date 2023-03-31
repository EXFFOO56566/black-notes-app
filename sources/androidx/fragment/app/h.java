package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class h<E> extends e {

    /* renamed from: b  reason: collision with root package name */
    private final Activity f837b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f838c;
    private final Handler d;
    private final int e;
    final j f;

    h(Activity activity, Context context, Handler handler, int i) {
        this.f = new j();
        this.f837b = activity;
        a.g.k.h.a(context, "context == null");
        this.f838c = context;
        a.g.k.h.a(handler, "handler == null");
        this.d = handler;
        this.e = i;
    }

    h(d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.e
    public View a(int i) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public boolean b(Fragment fragment) {
        return true;
    }

    @Override // androidx.fragment.app.e
    public boolean d() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public Activity f() {
        return this.f837b;
    }

    /* access modifiers changed from: package-private */
    public Context g() {
        return this.f838c;
    }

    /* access modifiers changed from: package-private */
    public Handler h() {
        return this.d;
    }

    public abstract E i();

    public LayoutInflater j() {
        return LayoutInflater.from(this.f838c);
    }

    public int k() {
        return this.e;
    }

    public boolean l() {
        return true;
    }

    public void m() {
    }
}
