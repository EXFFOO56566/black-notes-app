package a.g.l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<View> f247a;

    /* renamed from: b  reason: collision with root package name */
    Runnable f248b = null;

    /* renamed from: c  reason: collision with root package name */
    Runnable f249c = null;
    int d = -1;

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f250a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f251b;

        a(y yVar, z zVar, View view) {
            this.f250a = zVar;
            this.f251b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f250a.a(this.f251b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f250a.b(this.f251b);
        }

        public void onAnimationStart(Animator animator) {
            this.f250a.c(this.f251b);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0 f252a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f253b;

        b(y yVar, b0 b0Var, View view) {
            this.f252a = b0Var;
            this.f253b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f252a.a(this.f253b);
        }
    }

    static class c implements z {

        /* renamed from: a  reason: collision with root package name */
        y f254a;

        /* renamed from: b  reason: collision with root package name */
        boolean f255b;

        c(y yVar) {
            this.f254a = yVar;
        }

        @Override // a.g.l.z
        public void a(View view) {
            Object tag = view.getTag(2113929216);
            z zVar = tag instanceof z ? (z) tag : null;
            if (zVar != null) {
                zVar.a(view);
            }
        }

        @Override // a.g.l.z
        public void b(View view) {
            int i = this.f254a.d;
            z zVar = null;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f254a.d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f255b) {
                y yVar = this.f254a;
                Runnable runnable = yVar.f249c;
                if (runnable != null) {
                    yVar.f249c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof z) {
                    zVar = (z) tag;
                }
                if (zVar != null) {
                    zVar.b(view);
                }
                this.f255b = true;
            }
        }

        @Override // a.g.l.z
        public void c(View view) {
            this.f255b = false;
            z zVar = null;
            if (this.f254a.d > -1) {
                view.setLayerType(2, null);
            }
            y yVar = this.f254a;
            Runnable runnable = yVar.f248b;
            if (runnable != null) {
                yVar.f248b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof z) {
                zVar = (z) tag;
            }
            if (zVar != null) {
                zVar.c(view);
            }
        }
    }

    y(View view) {
        this.f247a = new WeakReference<>(view);
    }

    private void a(View view, z zVar) {
        if (zVar != null) {
            view.animate().setListener(new a(this, zVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public y a(float f) {
        View view = this.f247a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public y a(long j) {
        View view = this.f247a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public y a(b0 b0Var) {
        View view = this.f247a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            b bVar = null;
            if (b0Var != null) {
                bVar = new b(this, b0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public y a(z zVar) {
        View view = this.f247a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, zVar);
                zVar = new c(this);
            }
            a(view, zVar);
        }
        return this;
    }

    public y a(Interpolator interpolator) {
        View view = this.f247a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public void a() {
        View view = this.f247a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long b() {
        View view = this.f247a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public y b(float f) {
        View view = this.f247a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public y b(long j) {
        View view = this.f247a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public void c() {
        View view = this.f247a.get();
        if (view != null) {
            view.animate().start();
        }
    }
}
