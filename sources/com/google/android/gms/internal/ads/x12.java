package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public final class x12 implements Iterator<py1> {

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<s12> f5350b;

    /* renamed from: c  reason: collision with root package name */
    private py1 f5351c;

    private x12(dy1 dy1) {
        py1 py1;
        if (dy1 instanceof s12) {
            s12 s12 = (s12) dy1;
            ArrayDeque<s12> arrayDeque = new ArrayDeque<>(s12.i());
            this.f5350b = arrayDeque;
            arrayDeque.push(s12);
            py1 = a(s12.f);
        } else {
            this.f5350b = null;
            py1 = (py1) dy1;
        }
        this.f5351c = py1;
    }

    /* synthetic */ x12(dy1 dy1, v12 v12) {
        this(dy1);
    }

    private final py1 a(dy1 dy1) {
        while (dy1 instanceof s12) {
            s12 s12 = (s12) dy1;
            this.f5350b.push(s12);
            dy1 = s12.f;
        }
        return (py1) dy1;
    }

    public final boolean hasNext() {
        return this.f5351c != null;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* synthetic */ py1 next() {
        py1 py1;
        py1 py12 = this.f5351c;
        if (py12 != null) {
            while (true) {
                ArrayDeque<s12> arrayDeque = this.f5350b;
                if (arrayDeque != null && !arrayDeque.isEmpty()) {
                    py1 = a(this.f5350b.pop().g);
                    if (!py1.isEmpty()) {
                        break;
                    }
                } else {
                    py1 = null;
                }
            }
            py1 = null;
            this.f5351c = py1;
            return py12;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
