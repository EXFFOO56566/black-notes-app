package com.google.android.material.appbar;

import a.g.l.u;
import android.view.View;

/* access modifiers changed from: package-private */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final View f5844a;

    /* renamed from: b  reason: collision with root package name */
    private int f5845b;

    /* renamed from: c  reason: collision with root package name */
    private int f5846c;
    private int d;
    private int e;
    private boolean f = true;
    private boolean g = true;

    public d(View view) {
        this.f5844a = view;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        View view = this.f5844a;
        u.e(view, this.d - (view.getTop() - this.f5845b));
        View view2 = this.f5844a;
        u.d(view2, this.e - (view2.getLeft() - this.f5846c));
    }

    public boolean a(int i) {
        if (!this.g || this.e == i) {
            return false;
        }
        this.e = i;
        a();
        return true;
    }

    public int b() {
        return this.d;
    }

    public boolean b(int i) {
        if (!this.f || this.d == i) {
            return false;
        }
        this.d = i;
        a();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f5845b = this.f5844a.getTop();
        this.f5846c = this.f5844a.getLeft();
    }
}
