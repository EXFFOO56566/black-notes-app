package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.ws;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f1419a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup.LayoutParams f1420b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f1421c;
    public final Context d;

    public i(ws wsVar) {
        this.f1420b = wsVar.getLayoutParams();
        ViewParent parent = wsVar.getParent();
        this.d = wsVar.D();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new g("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f1421c = viewGroup;
        this.f1419a = viewGroup.indexOfChild(wsVar.getView());
        this.f1421c.removeView(wsVar.getView());
        wsVar.g(true);
    }
}
