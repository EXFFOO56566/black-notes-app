package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class wl1<E> extends pl1<E> {
    private final ul1<E> d;

    wl1(ul1<E> ul1, int i) {
        super(ul1.size(), i);
        this.d = ul1;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.pl1
    public final E a(int i) {
        return this.d.get(i);
    }
}
