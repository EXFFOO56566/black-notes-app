package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public final class v12 extends iy1 {

    /* renamed from: b  reason: collision with root package name */
    private final x12 f5037b = new x12(this.d, null);

    /* renamed from: c  reason: collision with root package name */
    private my1 f5038c = a();
    private final /* synthetic */ s12 d;

    v12(s12 s12) {
        this.d = s12;
    }

    private final my1 a() {
        if (this.f5037b.hasNext()) {
            return (my1) ((py1) this.f5037b.next()).iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.f5038c != null;
    }

    @Override // com.google.android.gms.internal.ads.my1
    public final byte nextByte() {
        my1 my1 = this.f5038c;
        if (my1 != null) {
            byte nextByte = my1.nextByte();
            if (!this.f5038c.hasNext()) {
                this.f5038c = a();
            }
            return nextByte;
        }
        throw new NoSuchElementException();
    }
}
