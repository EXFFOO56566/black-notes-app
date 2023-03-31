package androidx.appcompat.view.menu;

import a.e.a;
import a.g.f.a.b;
import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    final Context f506a;

    /* renamed from: b  reason: collision with root package name */
    private Map<b, MenuItem> f507b;

    /* renamed from: c  reason: collision with root package name */
    private Map<a.g.f.a.c, SubMenu> f508c;

    c(Context context) {
        this.f506a = context;
    }

    /* access modifiers changed from: package-private */
    public final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.f507b == null) {
            this.f507b = new a();
        }
        MenuItem menuItem2 = this.f507b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.f506a, bVar);
        this.f507b.put(bVar, jVar);
        return jVar;
    }

    /* access modifiers changed from: package-private */
    public final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof a.g.f.a.c)) {
            return subMenu;
        }
        a.g.f.a.c cVar = (a.g.f.a.c) subMenu;
        if (this.f508c == null) {
            this.f508c = new a();
        }
        SubMenu subMenu2 = this.f508c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.f506a, cVar);
        this.f508c.put(cVar, sVar);
        return sVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        Map<b, MenuItem> map = this.f507b;
        if (map != null) {
            Iterator<b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        Map<b, MenuItem> map = this.f507b;
        if (map != null) {
            map.clear();
        }
        Map<a.g.f.a.c, SubMenu> map2 = this.f508c;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i) {
        Map<b, MenuItem> map = this.f507b;
        if (map != null) {
            Iterator<b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
