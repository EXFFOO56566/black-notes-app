package androidx.appcompat.widget;

import a.g.l.y;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.m;

public interface d0 {
    y a(int i, long j);

    void a(int i);

    void a(Menu menu, m.a aVar);

    void a(p0 p0Var);

    void a(boolean z);

    boolean a();

    void b();

    void b(int i);

    void b(boolean z);

    void c(int i);

    boolean c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    void g();

    Context getContext();

    CharSequence getTitle();

    ViewGroup h();

    boolean i();

    int j();

    int k();

    void l();

    void m();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
