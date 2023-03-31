package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.bq2;

public final class AdView extends g {
    public AdView(Context context) {
        super(context, 0);
        r.a(context, "Context cannot be null");
    }

    public AdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    @Override // com.google.android.gms.ads.g
    public final /* bridge */ /* synthetic */ b getAdListener() {
        return super.getAdListener();
    }

    @Override // com.google.android.gms.ads.g
    public final /* bridge */ /* synthetic */ e getAdSize() {
        return super.getAdSize();
    }

    @Override // com.google.android.gms.ads.g
    public final /* bridge */ /* synthetic */ String getAdUnitId() {
        return super.getAdUnitId();
    }

    @Override // com.google.android.gms.ads.g
    @Deprecated
    public final /* bridge */ /* synthetic */ String getMediationAdapterClassName() {
        return super.getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.ads.g
    public final /* bridge */ /* synthetic */ o getResponseInfo() {
        return super.getResponseInfo();
    }

    public final p getVideoController() {
        bq2 bq2 = this.f1389b;
        if (bq2 != null) {
            return bq2.j();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.g
    public final /* bridge */ /* synthetic */ void setAdListener(b bVar) {
        super.setAdListener(bVar);
    }

    @Override // com.google.android.gms.ads.g
    public final /* bridge */ /* synthetic */ void setAdSize(e eVar) {
        super.setAdSize(eVar);
    }

    @Override // com.google.android.gms.ads.g
    public final /* bridge */ /* synthetic */ void setAdUnitId(String str) {
        super.setAdUnitId(str);
    }

    @Override // com.google.android.gms.ads.g
    public final /* bridge */ /* synthetic */ void setOnPaidEventListener(l lVar) {
        super.setOnPaidEventListener(lVar);
    }
}
