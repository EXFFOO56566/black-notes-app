package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.ads.xl;

/* access modifiers changed from: package-private */
public final class j extends RelativeLayout {

    /* renamed from: b  reason: collision with root package name */
    private xl f1422b;

    /* renamed from: c  reason: collision with root package name */
    boolean f1423c;

    public j(Context context, String str, String str2) {
        super(context);
        xl xlVar = new xl(context, str);
        this.f1422b = xlVar;
        xlVar.b(str2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f1423c) {
            return false;
        }
        this.f1422b.a(motionEvent);
        return false;
    }
}
