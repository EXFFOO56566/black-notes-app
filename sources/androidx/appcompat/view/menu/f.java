package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

public class f extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    g f522b;

    /* renamed from: c  reason: collision with root package name */
    private int f523c = -1;
    private boolean d;
    private final boolean e;
    private final LayoutInflater f;
    private final int g;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.e = z;
        this.f = layoutInflater;
        this.f522b = gVar;
        this.g = i;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        i f2 = this.f522b.f();
        if (f2 != null) {
            ArrayList<i> j = this.f522b.j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (j.get(i) == f2) {
                    this.f523c = i;
                    return;
                }
            }
        }
        this.f523c = -1;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public g b() {
        return this.f522b;
    }

    public int getCount() {
        ArrayList<i> j = this.e ? this.f522b.j() : this.f522b.n();
        int i = this.f523c;
        int size = j.size();
        return i < 0 ? size : size - 1;
    }

    public i getItem(int i) {
        ArrayList<i> j = this.e ? this.f522b.j() : this.f522b.n();
        int i2 = this.f523c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return j.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f.inflate(this.g, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f522b.o() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.a(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
