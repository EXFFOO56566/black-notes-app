package a.m;

import android.graphics.Matrix;
import android.view.View;

class h0 extends g0 {
    h0() {
    }

    @Override // a.m.i0, a.m.d0
    public void a(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // a.m.i0, a.m.g0
    public void a(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // a.m.i0, a.m.f0
    public void a(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // a.m.i0, a.m.e0
    public void a(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // a.m.i0, a.m.d0
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // a.m.i0, a.m.e0
    public void b(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
