package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

class i {

    /* renamed from: a  reason: collision with root package name */
    boolean f1089a = true;

    /* renamed from: b  reason: collision with root package name */
    int f1090b;

    /* renamed from: c  reason: collision with root package name */
    int f1091c;
    int d;
    int e;
    int f = 0;
    int g = 0;
    boolean h;
    boolean i;

    i() {
    }

    /* access modifiers changed from: package-private */
    public View a(RecyclerView.v vVar) {
        View d2 = vVar.d(this.f1091c);
        this.f1091c += this.d;
        return d2;
    }

    /* access modifiers changed from: package-private */
    public boolean a(RecyclerView.a0 a0Var) {
        int i2 = this.f1091c;
        return i2 >= 0 && i2 < a0Var.a();
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f1090b + ", mCurrentPosition=" + this.f1091c + ", mItemDirection=" + this.d + ", mLayoutDirection=" + this.e + ", mStartLine=" + this.f + ", mEndLine=" + this.g + '}';
    }
}
