package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public abstract class iy1 implements my1 {
    iy1() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public /* synthetic */ Byte next() {
        return Byte.valueOf(nextByte());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
