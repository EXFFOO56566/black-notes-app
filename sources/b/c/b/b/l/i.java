package b.c.b.b.l;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private long f1267a = 0;

    /* renamed from: b  reason: collision with root package name */
    private long f1268b = 300;

    /* renamed from: c  reason: collision with root package name */
    private TimeInterpolator f1269c = null;
    private int d = 0;
    private int e = 1;

    public i(long j, long j2) {
        this.f1267a = j;
        this.f1268b = j2;
    }

    public i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f1267a = j;
        this.f1268b = j2;
        this.f1269c = timeInterpolator;
    }

    static i a(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), b(valueAnimator));
        iVar.d = valueAnimator.getRepeatCount();
        iVar.e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f1255b : interpolator instanceof AccelerateInterpolator ? a.f1256c : interpolator instanceof DecelerateInterpolator ? a.d : interpolator;
    }

    public long a() {
        return this.f1267a;
    }

    public void a(Animator animator) {
        animator.setStartDelay(a());
        animator.setDuration(b());
        animator.setInterpolator(c());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(d());
            valueAnimator.setRepeatMode(e());
        }
    }

    public long b() {
        return this.f1268b;
    }

    public TimeInterpolator c() {
        TimeInterpolator timeInterpolator = this.f1269c;
        return timeInterpolator != null ? timeInterpolator : a.f1255b;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (a() == iVar.a() && b() == iVar.b() && d() == iVar.d() && e() == iVar.e()) {
            return c().getClass().equals(iVar.c().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (a() ^ (a() >>> 32))) * 31) + ((int) (b() ^ (b() >>> 32)))) * 31) + c().getClass().hashCode()) * 31) + d()) * 31) + e();
    }

    public String toString() {
        return '\n' + i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + a() + " duration: " + b() + " interpolator: " + c().getClass() + " repeatCount: " + d() + " repeatMode: " + e() + "}\n";
    }
}
