package com.google.android.gms.ads.s;

import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.on2;
import com.google.android.gms.internal.ads.z1;
import com.google.android.gms.internal.ads.zr2;

@Deprecated
public class e extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f1470b;

    /* renamed from: c  reason: collision with root package name */
    private final z1 f1471c;

    /* access modifiers changed from: protected */
    public final View a(String str) {
        try {
            a t = this.f1471c.t(str);
            if (t != null) {
                return (View) b.Q(t);
            }
            return null;
        } catch (RemoteException e) {
            co.b("Unable to call getAssetView on delegate", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str, View view) {
        try {
            this.f1471c.a(str, b.a(view));
        } catch (RemoteException e) {
            co.b("Unable to call setAssetView on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f1470b);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f1470b;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        z1 z1Var;
        if (((Boolean) on2.e().a(zr2.n1)).booleanValue() && (z1Var = this.f1471c) != null) {
            try {
                z1Var.j(b.a(motionEvent));
            } catch (RemoteException e) {
                co.b("Unable to call handleTouchEvent on delegate", e);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getAdChoicesView() {
        View a2 = a("1098");
        if (a2 instanceof a) {
            return (a) a2;
        }
        return null;
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        z1 z1Var = this.f1471c;
        if (z1Var != null) {
            try {
                z1Var.a(b.a(view), i);
            } catch (RemoteException e) {
                co.b("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f1470b);
    }

    public void removeView(View view) {
        if (this.f1470b != view) {
            super.removeView(view);
        }
    }

    public void setAdChoicesView(a aVar) {
        a("1098", aVar);
    }

    public void setNativeAd(c cVar) {
        try {
            this.f1471c.e((a) cVar.a());
        } catch (RemoteException e) {
            co.b("Unable to call setNativeAd on delegate", e);
        }
    }
}
