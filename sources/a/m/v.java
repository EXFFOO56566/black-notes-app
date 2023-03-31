package a.m;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* access modifiers changed from: package-private */
public class v implements w {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroupOverlay f367a;

    v(ViewGroup viewGroup) {
        this.f367a = viewGroup.getOverlay();
    }

    @Override // a.m.b0
    public void a(Drawable drawable) {
        this.f367a.add(drawable);
    }

    @Override // a.m.w
    public void a(View view) {
        this.f367a.add(view);
    }

    @Override // a.m.b0
    public void b(Drawable drawable) {
        this.f367a.remove(drawable);
    }

    @Override // a.m.w
    public void b(View view) {
        this.f367a.remove(view);
    }
}
