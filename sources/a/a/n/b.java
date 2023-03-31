package a.a.n;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class b {

    /* renamed from: b  reason: collision with root package name */
    private Object f21b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f22c;

    public interface a {
        void a(b bVar);

        boolean a(b bVar, Menu menu);

        boolean a(b bVar, MenuItem menuItem);

        boolean b(b bVar, Menu menu);
    }

    public abstract void a();

    public abstract void a(int i);

    public abstract void a(View view);

    public abstract void a(CharSequence charSequence);

    public void a(Object obj) {
        this.f21b = obj;
    }

    public void a(boolean z) {
        this.f22c = z;
    }

    public abstract View b();

    public abstract void b(int i);

    public abstract void b(CharSequence charSequence);

    public abstract Menu c();

    public abstract MenuInflater d();

    public abstract CharSequence e();

    public Object f() {
        return this.f21b;
    }

    public abstract CharSequence g();

    public boolean h() {
        return this.f22c;
    }

    public abstract void i();

    public abstract boolean j();
}
