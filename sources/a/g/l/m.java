package a.g.l;

import android.view.View;
import android.view.ViewParent;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private ViewParent f228a;

    /* renamed from: b  reason: collision with root package name */
    private ViewParent f229b;

    /* renamed from: c  reason: collision with root package name */
    private final View f230c;
    private boolean d;
    private int[] e;

    public m(View view) {
        this.f230c = view;
    }

    private void a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f228a = viewParent;
        } else if (i == 1) {
            this.f229b = viewParent;
        }
    }

    private boolean b(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent d2;
        int i6;
        int i7;
        int[] iArr3;
        if (!b() || (d2 = d(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f230c.getLocationInWindow(iArr);
            i7 = iArr[0];
            i6 = iArr[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] d3 = d();
            d3[0] = 0;
            d3[1] = 0;
            iArr3 = d3;
        } else {
            iArr3 = iArr2;
        }
        x.a(d2, this.f230c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f230c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i6;
        }
        return true;
    }

    private ViewParent d(int i) {
        if (i == 0) {
            return this.f228a;
        }
        if (i != 1) {
            return null;
        }
        return this.f229b;
    }

    private int[] d() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }

    public void a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        b(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void a(boolean z) {
        if (this.d) {
            u.I(this.f230c);
        }
        this.d = z;
    }

    public boolean a() {
        return a(0);
    }

    public boolean a(float f, float f2) {
        ViewParent d2;
        if (!b() || (d2 = d(0)) == null) {
            return false;
        }
        return x.a(d2, this.f230c, f, f2);
    }

    public boolean a(float f, float f2, boolean z) {
        ViewParent d2;
        if (!b() || (d2 = d(0)) == null) {
            return false;
        }
        return x.a(d2, this.f230c, f, f2, z);
    }

    public boolean a(int i) {
        return d(i) != null;
    }

    public boolean a(int i, int i2) {
        if (a(i2)) {
            return true;
        }
        if (!b()) {
            return false;
        }
        View view = this.f230c;
        for (ViewParent parent = this.f230c.getParent(); parent != null; parent = parent.getParent()) {
            if (x.b(parent, view, this.f230c, i, i2)) {
                a(i2, parent);
                x.a(parent, view, this.f230c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public boolean a(int i, int i2, int i3, int i4, int[] iArr) {
        return b(i, i2, i3, i4, iArr, 0, null);
    }

    public boolean a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return b(i, i2, i3, i4, iArr, i5, null);
    }

    public boolean a(int i, int i2, int[] iArr, int[] iArr2) {
        return a(i, i2, iArr, iArr2, 0);
    }

    public boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent d2;
        int i4;
        int i5;
        if (!b() || (d2 = d(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f230c.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                iArr = d();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            x.a(d2, this.f230c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f230c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i4;
            }
            return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public boolean b() {
        return this.d;
    }

    public boolean b(int i) {
        return a(i, 0);
    }

    public void c() {
        c(0);
    }

    public void c(int i) {
        ViewParent d2 = d(i);
        if (d2 != null) {
            x.a(d2, this.f230c, i);
            a(i, (ViewParent) null);
        }
    }
}
