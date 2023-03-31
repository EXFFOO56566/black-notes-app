package androidx.appcompat.view.menu;

import a.g.l.d;
import a.g.l.u;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private final Context f541a;

    /* renamed from: b  reason: collision with root package name */
    private final g f542b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f543c;
    private final int d;
    private final int e;
    private View f;
    private int g;
    private boolean h;
    private m.a i;
    private k j;
    private PopupWindow.OnDismissListener k;
    private final PopupWindow.OnDismissListener l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        public void onDismiss() {
            l.this.d();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i2) {
        this(context, gVar, view, z, i2, 0);
    }

    public l(Context context, g gVar, View view, boolean z, int i2, int i3) {
        this.g = 8388611;
        this.l = new a();
        this.f541a = context;
        this.f542b = gVar;
        this.f = view;
        this.f543c = z;
        this.d = i2;
        this.e = i3;
    }

    private void a(int i2, int i3, boolean z, boolean z2) {
        k b2 = b();
        b2.c(z2);
        if (z) {
            if ((d.a(this.g, u.o(this.f)) & 7) == 5) {
                i2 -= this.f.getWidth();
            }
            b2.b(i2);
            b2.c(i3);
            int i4 = (int) ((this.f541a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b2.a(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
        }
        b2.P();
    }

    private k g() {
        Display defaultDisplay = ((WindowManager) this.f541a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        k dVar = Math.min(point.x, point.y) >= this.f541a.getResources().getDimensionPixelSize(a.a.d.abc_cascading_menus_min_smallest_width) ? new d(this.f541a, this.f, this.d, this.e, this.f543c) : new q(this.f541a, this.f542b, this.f, this.d, this.e, this.f543c);
        dVar.a(this.f542b);
        dVar.a(this.l);
        dVar.a(this.f);
        dVar.a(this.i);
        dVar.b(this.h);
        dVar.a(this.g);
        return dVar;
    }

    public void a() {
        if (c()) {
            this.j.dismiss();
        }
    }

    public void a(int i2) {
        this.g = i2;
    }

    public void a(View view) {
        this.f = view;
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void a(m.a aVar) {
        this.i = aVar;
        k kVar = this.j;
        if (kVar != null) {
            kVar.a(aVar);
        }
    }

    public void a(boolean z) {
        this.h = z;
        k kVar = this.j;
        if (kVar != null) {
            kVar.b(z);
        }
    }

    public boolean a(int i2, int i3) {
        if (c()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        a(i2, i3, true, true);
        return true;
    }

    public k b() {
        if (this.j == null) {
            this.j = g();
        }
        return this.j;
    }

    public boolean c() {
        k kVar = this.j;
        return kVar != null && kVar.Q();
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void e() {
        if (!f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean f() {
        if (c()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }
}
