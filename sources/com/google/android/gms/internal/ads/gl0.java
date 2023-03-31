package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.common.util.l;

@TargetApi(19)
public final class gl0 {

    /* renamed from: a  reason: collision with root package name */
    private Context f2779a;

    /* renamed from: b  reason: collision with root package name */
    private PopupWindow f2780b;

    private static PopupWindow b(Context context, View view) {
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) context).isDestroyed()) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(view, -1, -1);
        PopupWindow popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setClippingEnabled(false);
        co.a("Displaying the 1x1 popup off the screen.");
        try {
            popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            return popupWindow;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a() {
        Context context = this.f2779a;
        if (context != null && this.f2780b != null) {
            if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && this.f2780b.isShowing()) {
                this.f2780b.dismiss();
            }
            this.f2779a = null;
            this.f2780b = null;
        }
    }

    public final void a(Context context, View view) {
        if (l.f() && !l.h()) {
            PopupWindow b2 = b(context, view);
            this.f2780b = b2;
            if (b2 == null) {
                context = null;
            }
            this.f2779a = context;
        }
    }
}
