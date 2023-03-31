package com.google.android.gms.ads.r;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.b;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.h;
import com.google.android.gms.ads.o;
import com.google.android.gms.ads.p;
import com.google.android.gms.ads.q;
import com.google.android.gms.internal.ads.bq2;
import com.google.android.gms.internal.ads.co;

public final class d extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    private final bq2 f1461b;

    public final b getAdListener() {
        return this.f1461b.b();
    }

    public final e getAdSize() {
        return this.f1461b.c();
    }

    public final e[] getAdSizes() {
        return this.f1461b.d();
    }

    public final String getAdUnitId() {
        return this.f1461b.e();
    }

    public final a getAppEventListener() {
        return this.f1461b.f();
    }

    @Deprecated
    public final String getMediationAdapterClassName() {
        return this.f1461b.g();
    }

    public final c getOnCustomRenderedAdLoadedListener() {
        return this.f1461b.h();
    }

    public final o getResponseInfo() {
        return this.f1461b.i();
    }

    public final p getVideoController() {
        return this.f1461b.j();
    }

    public final q getVideoOptions() {
        return this.f1461b.k();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            e eVar = null;
            try {
                eVar = getAdSize();
            } catch (NullPointerException e) {
                co.b("Unable to retrieve ad size.", e);
            }
            if (eVar != null) {
                Context context = getContext();
                int b2 = eVar.b(context);
                i3 = eVar.a(context);
                i4 = b2;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public final void setAdListener(b bVar) {
        this.f1461b.a(bVar);
    }

    public final void setAdSizes(e... eVarArr) {
        if (eVarArr == null || eVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f1461b.b(eVarArr);
    }

    public final void setAdUnitId(String str) {
        this.f1461b.a(str);
    }

    public final void setAppEventListener(a aVar) {
        this.f1461b.a(aVar);
    }

    @Deprecated
    public final void setCorrelator(h hVar) {
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.f1461b.a(z);
    }

    public final void setOnCustomRenderedAdLoadedListener(c cVar) {
        this.f1461b.a(cVar);
    }

    public final void setVideoOptions(q qVar) {
        this.f1461b.a(qVar);
    }
}
