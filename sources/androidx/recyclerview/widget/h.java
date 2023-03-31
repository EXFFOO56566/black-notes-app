package androidx.recyclerview.widget;

import a.g.l.u;
import a.l.c;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;

/* access modifiers changed from: package-private */
public class h implements g {

    /* renamed from: a  reason: collision with root package name */
    static final g f1088a = new h();

    h() {
    }

    private static float a(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float k = u.k(childAt);
                if (k > f) {
                    f = k;
                }
            }
        }
        return f;
    }

    @Override // androidx.recyclerview.widget.g
    public void a(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }

    @Override // androidx.recyclerview.widget.g
    public void a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            Object tag = view.getTag(c.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                u.a(view, ((Float) tag).floatValue());
            }
            view.setTag(c.item_touch_helper_previous_elevation, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.g
    public void b(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 21 && z && view.getTag(c.item_touch_helper_previous_elevation) == null) {
            Float valueOf = Float.valueOf(u.k(view));
            u.a(view, a(recyclerView, view) + 1.0f);
            view.setTag(c.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    @Override // androidx.recyclerview.widget.g
    public void b(View view) {
    }
}
