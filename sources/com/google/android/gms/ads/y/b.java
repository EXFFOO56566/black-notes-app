package com.google.android.gms.ads.y;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.e;
import com.google.android.gms.internal.ads.bq2;
import com.google.android.gms.internal.ads.co;

public final class b extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    private final bq2 f1492b;

    public final com.google.android.gms.ads.b getAdListener() {
        return this.f1492b.b();
    }

    public final e getAdSize() {
        return this.f1492b.c();
    }

    public final String getAdUnitId() {
        return this.f1492b.e();
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

    public final void setAdListener(com.google.android.gms.ads.b bVar) {
        this.f1492b.a(bVar);
    }

    public final void setAdSize(e eVar) {
        this.f1492b.a(eVar);
    }

    public final void setAdUnitId(String str) {
        this.f1492b.a(str);
    }
}
