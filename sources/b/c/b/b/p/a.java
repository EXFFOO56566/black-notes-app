package b.c.b.b.p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import b.c.b.b.p.d;

public final class a {

    /* renamed from: b.c.b.b.p.a$a  reason: collision with other inner class name */
    static class C0063a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f1273a;

        C0063a(d dVar) {
            this.f1273a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1273a.a();
        }

        public void onAnimationStart(Animator animator) {
            this.f1273a.b();
        }
    }

    public static Animator.AnimatorListener a(d dVar) {
        return new C0063a(dVar);
    }

    public static Animator a(d dVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, d.c.f1278a, d.b.f1276b, new d.e(f, f2, f3));
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        d.e revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f, (int) f2, revealInfo.f1282c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
