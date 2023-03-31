package androidx.fragment.app;

import a.g.k.h;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.t;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final h<?> f835a;

    private f(h<?> hVar) {
        this.f835a = hVar;
    }

    public static f a(h<?> hVar) {
        h.a(hVar, "callbacks == null");
        return new f(hVar);
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f835a.f.onCreateView(view, str, context, attributeSet);
    }

    public Fragment a(String str) {
        return this.f835a.f.b(str);
    }

    public void a() {
        this.f835a.f.f();
    }

    public void a(Configuration configuration) {
        this.f835a.f.a(configuration);
    }

    public void a(Parcelable parcelable) {
        h<?> hVar = this.f835a;
        if (hVar instanceof t) {
            hVar.f.a(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public void a(Menu menu) {
        this.f835a.f.a(menu);
    }

    public void a(Fragment fragment) {
        h<?> hVar = this.f835a;
        hVar.f.a(hVar, hVar, fragment);
    }

    public void a(boolean z) {
        this.f835a.f.a(z);
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        return this.f835a.f.a(menu, menuInflater);
    }

    public boolean a(MenuItem menuItem) {
        return this.f835a.f.a(menuItem);
    }

    public void b() {
        this.f835a.f.g();
    }

    public void b(boolean z) {
        this.f835a.f.b(z);
    }

    public boolean b(Menu menu) {
        return this.f835a.f.b(menu);
    }

    public boolean b(MenuItem menuItem) {
        return this.f835a.f.b(menuItem);
    }

    public void c() {
        this.f835a.f.h();
    }

    public void d() {
        this.f835a.f.j();
    }

    public void e() {
        this.f835a.f.k();
    }

    public void f() {
        this.f835a.f.m();
    }

    public void g() {
        this.f835a.f.n();
    }

    public void h() {
        this.f835a.f.o();
    }

    public boolean i() {
        return this.f835a.f.q();
    }

    public i j() {
        return this.f835a.f;
    }

    public void k() {
        this.f835a.f.x();
    }

    public Parcelable l() {
        return this.f835a.f.z();
    }
}
