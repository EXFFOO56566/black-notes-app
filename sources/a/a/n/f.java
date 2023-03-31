package a.a.n;

import a.a.n.b;
import a.e.g;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f26a;

    /* renamed from: b  reason: collision with root package name */
    final b f27b;

    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f28a;

        /* renamed from: b  reason: collision with root package name */
        final Context f29b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<f> f30c = new ArrayList<>();
        final g<Menu, Menu> d = new g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f29b = context;
            this.f28a = callback;
        }

        private Menu a(Menu menu) {
            Menu menu2 = this.d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            o oVar = new o(this.f29b, (a.g.f.a.a) menu);
            this.d.put(menu, oVar);
            return oVar;
        }

        @Override // a.a.n.b.a
        public void a(b bVar) {
            this.f28a.onDestroyActionMode(b(bVar));
        }

        @Override // a.a.n.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f28a.onPrepareActionMode(b(bVar), a(menu));
        }

        @Override // a.a.n.b.a
        public boolean a(b bVar, MenuItem menuItem) {
            return this.f28a.onActionItemClicked(b(bVar), new j(this.f29b, (a.g.f.a.b) menuItem));
        }

        public ActionMode b(b bVar) {
            int size = this.f30c.size();
            for (int i = 0; i < size; i++) {
                f fVar = this.f30c.get(i);
                if (fVar != null && fVar.f27b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f29b, bVar);
            this.f30c.add(fVar2);
            return fVar2;
        }

        @Override // a.a.n.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f28a.onCreateActionMode(b(bVar), a(menu));
        }
    }

    public f(Context context, b bVar) {
        this.f26a = context;
        this.f27b = bVar;
    }

    public void finish() {
        this.f27b.a();
    }

    public View getCustomView() {
        return this.f27b.b();
    }

    public Menu getMenu() {
        return new o(this.f26a, (a.g.f.a.a) this.f27b.c());
    }

    public MenuInflater getMenuInflater() {
        return this.f27b.d();
    }

    public CharSequence getSubtitle() {
        return this.f27b.e();
    }

    public Object getTag() {
        return this.f27b.f();
    }

    public CharSequence getTitle() {
        return this.f27b.g();
    }

    public boolean getTitleOptionalHint() {
        return this.f27b.h();
    }

    public void invalidate() {
        this.f27b.i();
    }

    public boolean isTitleOptional() {
        return this.f27b.j();
    }

    public void setCustomView(View view) {
        this.f27b.a(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f27b.a(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f27b.a(charSequence);
    }

    public void setTag(Object obj) {
        this.f27b.a(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f27b.b(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f27b.b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f27b.a(z);
    }
}
