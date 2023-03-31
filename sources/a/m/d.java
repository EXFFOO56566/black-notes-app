package a.m;

import a.g.l.u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

public class d extends j0 {

    /* access modifiers changed from: package-private */
    public class a extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f313a;

        a(d dVar, View view) {
            this.f313a = view;
        }

        @Override // a.m.m.f
        public void e(m mVar) {
            c0.a(this.f313a, 1.0f);
            c0.a(this.f313a);
            mVar.b(this);
        }
    }

    /* access modifiers changed from: private */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final View f314a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f315b = false;

        b(View view) {
            this.f314a = view;
        }

        public void onAnimationEnd(Animator animator) {
            c0.a(this.f314a, 1.0f);
            if (this.f315b) {
                this.f314a.setLayerType(0, null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (u.y(this.f314a) && this.f314a.getLayerType() == 0) {
                this.f315b = true;
                this.f314a.setLayerType(2, null);
            }
        }
    }

    public d(int i) {
        a(i);
    }

    private static float a(s sVar, float f) {
        Float f2;
        return (sVar == null || (f2 = (Float) sVar.f361a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    private Animator a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        c0.a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, c0.f312b, f2);
        ofFloat.addListener(new b(view));
        a(new a(this, view));
        return ofFloat;
    }

    @Override // a.m.j0
    public Animator a(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float f = 0.0f;
        float a2 = a(sVar, 0.0f);
        if (a2 != 1.0f) {
            f = a2;
        }
        return a(view, f, 1.0f);
    }

    @Override // a.m.j0
    public Animator b(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        c0.e(view);
        return a(view, a(sVar, 1.0f), 0.0f);
    }

    @Override // a.m.m, a.m.j0
    public void c(s sVar) {
        super.c(sVar);
        sVar.f361a.put("android:fade:transitionAlpha", Float.valueOf(c0.c(sVar.f362b)));
    }
}
