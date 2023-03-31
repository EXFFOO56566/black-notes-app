package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;

public final class zo {
    public static void a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        new cp(view, onGlobalLayoutListener).a();
    }

    public static void a(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        new bp(view, onScrollChangedListener).a();
    }
}
