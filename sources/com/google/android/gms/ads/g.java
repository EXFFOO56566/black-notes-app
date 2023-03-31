package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.r.a;
import com.google.android.gms.internal.ads.bq2;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.jm2;

/* access modifiers changed from: package-private */
public class g extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    protected final bq2 f1389b;

    public g(Context context, int i) {
        super(context);
        this.f1389b = new bq2(this, i);
    }

    public g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f1389b = new bq2(this, attributeSet, false, i);
    }

    public g(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f1389b = new bq2(this, attributeSet, false, i2);
    }

    public void a() {
        this.f1389b.a();
    }

    public void a(d dVar) {
        this.f1389b.a(dVar.a());
    }

    public void b() {
        this.f1389b.l();
    }

    public void c() {
        this.f1389b.m();
    }

    public b getAdListener() {
        return this.f1389b.b();
    }

    public e getAdSize() {
        return this.f1389b.c();
    }

    public String getAdUnitId() {
        return this.f1389b.e();
    }

    @Deprecated
    public String getMediationAdapterClassName() {
        return this.f1389b.g();
    }

    public o getResponseInfo() {
        return this.f1389b.i();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    public void onMeasure(int i, int i2) {
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

    public void setAdListener(b bVar) {
        this.f1389b.a(bVar);
        if (bVar == null) {
            this.f1389b.a((jm2) null);
            this.f1389b.a((a) null);
            return;
        }
        if (bVar instanceof jm2) {
            this.f1389b.a((jm2) bVar);
        }
        if (bVar instanceof a) {
            this.f1389b.a((a) bVar);
        }
    }

    public void setAdSize(e eVar) {
        this.f1389b.a(eVar);
    }

    public void setAdUnitId(String str) {
        this.f1389b.a(str);
    }

    public void setOnPaidEventListener(l lVar) {
        this.f1389b.a(lVar);
    }
}
