package a.m;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

class a0 implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewOverlay f297a;

    a0(View view) {
        this.f297a = view.getOverlay();
    }

    @Override // a.m.b0
    public void a(Drawable drawable) {
        this.f297a.add(drawable);
    }

    @Override // a.m.b0
    public void b(Drawable drawable) {
        this.f297a.remove(drawable);
    }
}
