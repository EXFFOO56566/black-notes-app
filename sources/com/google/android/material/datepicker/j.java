package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;

class j extends BaseAdapter {
    static final int f = o.d().getMaximum(4);

    /* renamed from: b  reason: collision with root package name */
    final i f5919b;

    /* renamed from: c  reason: collision with root package name */
    final d<?> f5920c;
    c d;
    final a e;

    j(i iVar, d<?> dVar, a aVar) {
        this.f5919b = iVar;
        this.f5920c = dVar;
        this.e = aVar;
    }

    private void a(Context context) {
        if (this.d == null) {
            this.d = new c(context);
        }
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f5919b.b();
    }

    /* access modifiers changed from: package-private */
    public int a(int i) {
        return a() + (i - 1);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return (this.f5919b.b() + this.f5919b.g) - 1;
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i) {
        return i % this.f5919b.f == 0;
    }

    /* access modifiers changed from: package-private */
    public boolean c(int i) {
        return (i + 1) % this.f5919b.f == 0;
    }

    /* access modifiers changed from: package-private */
    public int d(int i) {
        return (i - this.f5919b.b()) + 1;
    }

    /* access modifiers changed from: package-private */
    public boolean e(int i) {
        return i >= a() && i <= b();
    }

    public int getCount() {
        return this.f5919b.g + a();
    }

    public Long getItem(int i) {
        if (i < this.f5919b.b() || i > b()) {
            return null;
        }
        return Long.valueOf(this.f5919b.a(d(i)));
    }

    public long getItemId(int i) {
        return (long) (i / this.f5919b.f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
        // Method dump skipped, instructions count: 212
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.j.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public boolean hasStableIds() {
        return true;
    }
}
