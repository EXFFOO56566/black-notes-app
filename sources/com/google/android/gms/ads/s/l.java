package com.google.android.gms.ads.s;

import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.ads.j;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.mq2;
import com.google.android.gms.internal.ads.on2;
import com.google.android.gms.internal.ads.z1;
import com.google.android.gms.internal.ads.zr2;

public final class l extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f1477b;

    /* renamed from: c  reason: collision with root package name */
    private final z1 f1478c;

    private final View a(String str) {
        try {
            a t = this.f1478c.t(str);
            if (t != null) {
                return (View) b.Q(t);
            }
            return null;
        } catch (RemoteException e) {
            co.b("Unable to call getAssetView on delegate", e);
            return null;
        }
    }

    private final void a(String str, View view) {
        try {
            this.f1478c.a(str, b.a(view));
        } catch (RemoteException e) {
            co.b("Unable to call setAssetView on delegate", e);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(ImageView.ScaleType scaleType) {
        if (scaleType != null) {
            try {
                this.f1478c.L(b.a(scaleType));
            } catch (RemoteException e) {
                co.b("Unable to call setMediaViewImageScaleType on delegate", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(j jVar) {
        try {
            if (jVar instanceof mq2) {
                this.f1478c.a(((mq2) jVar).a());
            } else if (jVar == null) {
                this.f1478c.a(null);
            } else {
                co.a("Use MediaContent provided by UnifiedNativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            co.b("Unable to call setMediaContent on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f1477b);
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f1477b;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        z1 z1Var;
        if (((Boolean) on2.e().a(zr2.n1)).booleanValue() && (z1Var = this.f1478c) != null) {
            try {
                z1Var.j(b.a(motionEvent));
            } catch (RemoteException e) {
                co.b("Unable to call handleTouchEvent on delegate", e);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final a getAdChoicesView() {
        View a2 = a("3011");
        if (a2 instanceof a) {
            return (a) a2;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final b getMediaView() {
        View a2 = a("3010");
        if (a2 instanceof b) {
            return (b) a2;
        }
        if (a2 == null) {
            return null;
        }
        co.a("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        z1 z1Var = this.f1478c;
        if (z1Var != null) {
            try {
                z1Var.a(b.a(view), i);
            } catch (RemoteException e) {
                co.b("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f1477b);
    }

    public final void removeView(View view) {
        if (this.f1477b != view) {
            super.removeView(view);
        }
    }

    public final void setAdChoicesView(a aVar) {
        a("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        a("3005", view);
    }

    public final void setBodyView(View view) {
        a("3004", view);
    }

    public final void setCallToActionView(View view) {
        a("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.f1478c.c(b.a(view));
        } catch (RemoteException e) {
            co.b("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(View view) {
        a("3001", view);
    }

    public final void setIconView(View view) {
        a("3003", view);
    }

    public final void setImageView(View view) {
        a("3008", view);
    }

    public final void setMediaView(b bVar) {
        a("3010", bVar);
        if (bVar != null) {
            bVar.a(new p(this));
            bVar.a(new o(this));
        }
    }

    public final void setNativeAd(k kVar) {
        try {
            this.f1478c.e((a) kVar.k());
        } catch (RemoteException e) {
            co.b("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(View view) {
        a("3007", view);
    }

    public final void setStarRatingView(View view) {
        a("3009", view);
    }

    public final void setStoreView(View view) {
        a("3006", view);
    }
}
