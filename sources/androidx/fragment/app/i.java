package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public abstract class i {

    /* renamed from: c  reason: collision with root package name */
    static final g f839c = new g();

    /* renamed from: b  reason: collision with root package name */
    private g f840b = null;

    public static abstract class a {
        public abstract void a(i iVar, Fragment fragment);

        public abstract void a(i iVar, Fragment fragment, Context context);

        public abstract void a(i iVar, Fragment fragment, Bundle bundle);

        public abstract void a(i iVar, Fragment fragment, View view, Bundle bundle);

        public abstract void b(i iVar, Fragment fragment);

        public abstract void b(i iVar, Fragment fragment, Context context);

        public abstract void b(i iVar, Fragment fragment, Bundle bundle);

        public abstract void c(i iVar, Fragment fragment);

        public abstract void c(i iVar, Fragment fragment, Bundle bundle);

        public abstract void d(i iVar, Fragment fragment);

        public abstract void d(i iVar, Fragment fragment, Bundle bundle);

        public abstract void e(i iVar, Fragment fragment);

        public abstract void f(i iVar, Fragment fragment);

        public abstract void g(i iVar, Fragment fragment);
    }

    public interface b {
        void a();
    }

    public abstract n a();

    public abstract void a(int i, int i2);

    public void a(g gVar) {
        this.f840b = gVar;
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public g b() {
        if (this.f840b == null) {
            this.f840b = f839c;
        }
        return this.f840b;
    }

    public abstract List<Fragment> c();

    public abstract boolean d();
}
