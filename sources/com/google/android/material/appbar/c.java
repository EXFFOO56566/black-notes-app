package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

class c<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private d f5841a;

    /* renamed from: b  reason: collision with root package name */
    private int f5842b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f5843c = 0;

    public c() {
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(int i) {
        d dVar = this.f5841a;
        if (dVar != null) {
            return dVar.b(i);
        }
        this.f5842b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
        b(coordinatorLayout, v, i);
        if (this.f5841a == null) {
            this.f5841a = new d(v);
        }
        this.f5841a.c();
        this.f5841a.a();
        int i2 = this.f5842b;
        if (i2 != 0) {
            this.f5841a.b(i2);
            this.f5842b = 0;
        }
        int i3 = this.f5843c;
        if (i3 == 0) {
            return true;
        }
        this.f5841a.a(i3);
        this.f5843c = 0;
        return true;
    }

    public int b() {
        d dVar = this.f5841a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.c(v, i);
    }
}
