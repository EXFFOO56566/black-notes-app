package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* access modifiers changed from: package-private */
public class o {
    static int a(RecyclerView.a0 a0Var, m mVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.e() == 0 || a0Var.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.l(view) - oVar.l(view2)) + 1;
        }
        return Math.min(mVar.g(), mVar.a(view2) - mVar.d(view));
    }

    static int a(RecyclerView.a0 a0Var, m mVar, View view, View view2, RecyclerView.o oVar, boolean z, boolean z2) {
        if (oVar.e() == 0 || a0Var.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (a0Var.a() - Math.max(oVar.l(view), oVar.l(view2))) - 1) : Math.max(0, Math.min(oVar.l(view), oVar.l(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(mVar.a(view2) - mVar.d(view))) / ((float) (Math.abs(oVar.l(view) - oVar.l(view2)) + 1)))) + ((float) (mVar.f() - mVar.d(view))));
    }

    static int b(RecyclerView.a0 a0Var, m mVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.e() == 0 || a0Var.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return a0Var.a();
        }
        return (int) ((((float) (mVar.a(view2) - mVar.d(view))) / ((float) (Math.abs(oVar.l(view) - oVar.l(view2)) + 1))) * ((float) a0Var.a()));
    }
}
