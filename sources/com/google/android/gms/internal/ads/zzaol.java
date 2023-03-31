package com.google.android.gms.internal.ads;

import a.c.b.a;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.l;

public final class zzaol implements MediationInterstitialAdapter {

    /* renamed from: a  reason: collision with root package name */
    private Activity f5827a;

    /* renamed from: b  reason: collision with root package name */
    private l f5828b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f5829c;

    @Override // com.google.android.gms.ads.mediation.f
    public final void onDestroy() {
        co.a("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.f
    public final void onPause() {
        co.a("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.f
    public final void onResume() {
        co.a("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, l lVar, Bundle bundle, e eVar, Bundle bundle2) {
        this.f5828b = lVar;
        if (lVar == null) {
            co.d("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            co.d("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f5828b.a(this, 0);
        } else {
            if (!(com.google.android.gms.common.util.l.b() && y.a(context))) {
                co.d("Default browser does not support custom tabs. Bailing out.");
                this.f5828b.a(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                co.d("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f5828b.a(this, 0);
                return;
            }
            this.f5827a = (Activity) context;
            this.f5829c = Uri.parse(string);
            this.f5828b.b(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        a a2 = new a.C0005a().a();
        a2.f62a.setData(this.f5829c);
        gl.h.post(new hd(this, new AdOverlayInfoParcel(new d(a2.f62a), null, new fd(this), null, new fo(0, 0, false))));
        q.g().e();
    }
}
