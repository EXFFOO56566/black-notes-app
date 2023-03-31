package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

public class u92 {

    /* renamed from: a  reason: collision with root package name */
    private int f4920a;

    public void a() {
        this.f4920a = 0;
    }

    public final void a(int i) {
        this.f4920a = i;
    }

    public final void b(int i) {
        this.f4920a |= RecyclerView.UNDEFINED_DURATION;
    }

    public final boolean b() {
        return c(RecyclerView.UNDEFINED_DURATION);
    }

    public final boolean c() {
        return c(4);
    }

    /* access modifiers changed from: protected */
    public final boolean c(int i) {
        return (this.f4920a & i) == i;
    }

    public final boolean d() {
        return c(1);
    }
}
