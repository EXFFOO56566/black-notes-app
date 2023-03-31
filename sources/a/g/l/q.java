package a.g.l;

import android.view.View;
import android.view.ViewGroup;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private int f231a;

    /* renamed from: b  reason: collision with root package name */
    private int f232b;

    public q(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f231a | this.f232b;
    }

    public void a(View view, int i) {
        if (i == 1) {
            this.f232b = 0;
        } else {
            this.f231a = 0;
        }
    }

    public void a(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    public void a(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f232b = i;
        } else {
            this.f231a = i;
        }
    }
}
