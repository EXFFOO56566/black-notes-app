package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

public final class hl0 extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private final xl f2938b;

    public hl0(Context context, View view, xl xlVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f2938b = xlVar;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f2938b.a(motionEvent);
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof ws)) {
                arrayList.add((ws) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ws) obj).destroy();
        }
    }
}
