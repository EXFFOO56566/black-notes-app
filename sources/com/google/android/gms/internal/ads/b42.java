package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class b42 implements mw, Closeable, Iterator<mt> {
    private static final mt h = new e42("eof ");

    /* renamed from: b  reason: collision with root package name */
    protected ls f1860b;

    /* renamed from: c  reason: collision with root package name */
    protected d42 f1861c;
    private mt d = null;
    long e = 0;
    long f = 0;
    private List<mt> g = new ArrayList();

    static {
        j42.a(b42.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final mt next() {
        mt a2;
        mt mtVar = this.d;
        if (mtVar == null || mtVar == h) {
            d42 d42 = this.f1861c;
            if (d42 == null || this.e >= this.f) {
                this.d = h;
                throw new NoSuchElementException();
            }
            try {
                synchronized (d42) {
                    this.f1861c.b(this.e);
                    a2 = this.f1860b.a(this.f1861c, this);
                    this.e = this.f1861c.position();
                }
                return a2;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        } else {
            this.d = null;
            return mtVar;
        }
    }

    public final List<mt> a() {
        return (this.f1861c == null || this.d == h) ? this.g : new h42(this.g, this);
    }

    public void a(d42 d42, long j, ls lsVar) {
        this.f1861c = d42;
        this.e = d42.position();
        d42.b(d42.position() + j);
        this.f = d42.position();
        this.f1860b = lsVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1861c.close();
    }

    public boolean hasNext() {
        mt mtVar = this.d;
        if (mtVar == h) {
            return false;
        }
        if (mtVar != null) {
            return true;
        }
        try {
            this.d = (mt) next();
            return true;
        } catch (NoSuchElementException unused) {
            this.d = h;
            return false;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.g.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.g.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
