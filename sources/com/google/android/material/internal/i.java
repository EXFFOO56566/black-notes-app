package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
public class i extends ImageButton {

    /* renamed from: b  reason: collision with root package name */
    private int f5978b;

    public final void a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f5978b = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f5978b;
    }

    public void setVisibility(int i) {
        a(i, true);
    }
}
