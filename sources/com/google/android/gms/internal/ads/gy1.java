package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public final class gy1 extends iy1 {

    /* renamed from: b  reason: collision with root package name */
    private int f2828b = 0;

    /* renamed from: c  reason: collision with root package name */
    private final int f2829c = this.d.size();
    private final /* synthetic */ dy1 d;

    gy1(dy1 dy1) {
        this.d = dy1;
    }

    public final boolean hasNext() {
        return this.f2828b < this.f2829c;
    }

    @Override // com.google.android.gms.internal.ads.my1
    public final byte nextByte() {
        int i = this.f2828b;
        if (i < this.f2829c) {
            this.f2828b = i + 1;
            return this.d.g(i);
        }
        throw new NoSuchElementException();
    }
}
