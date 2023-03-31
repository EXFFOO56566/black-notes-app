package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<b> f5965a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private b f5966b = null;

    /* renamed from: c  reason: collision with root package name */
    ValueAnimator f5967c = null;
    private final Animator.AnimatorListener d = new a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            e eVar = e.this;
            if (eVar.f5967c == animator) {
                eVar.f5967c = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final int[] f5969a;

        /* renamed from: b  reason: collision with root package name */
        final ValueAnimator f5970b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f5969a = iArr;
            this.f5970b = valueAnimator;
        }
    }

    private void a(b bVar) {
        ValueAnimator valueAnimator = bVar.f5970b;
        this.f5967c = valueAnimator;
        valueAnimator.start();
    }

    private void b() {
        ValueAnimator valueAnimator = this.f5967c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5967c = null;
        }
    }

    public void a() {
        ValueAnimator valueAnimator = this.f5967c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f5967c = null;
        }
    }

    public void a(int[] iArr) {
        b bVar;
        int size = this.f5965a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.f5965a.get(i);
            if (StateSet.stateSetMatches(bVar.f5969a, iArr)) {
                break;
            }
            i++;
        }
        b bVar2 = this.f5966b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                b();
            }
            this.f5966b = bVar;
            if (bVar != null) {
                a(bVar);
            }
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.f5965a.add(bVar);
    }
}
