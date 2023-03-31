package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class bm1<E> extends sl1<E> {
    @NullableDecl
    private Object[] d;
    private int e;

    public bm1() {
        super(4);
    }

    bm1(int i) {
        super(i);
        this.d = new Object[cm1.f(i)];
    }

    public final cm1<E> a() {
        cm1<E> cm1;
        int i = this.f4677b;
        if (i == 0) {
            return lm1.i;
        }
        if (i == 1) {
            return cm1.a(this.f4676a[0]);
        }
        if (this.d == null || cm1.f(i) != this.d.length) {
            cm1 = cm1.a(this.f4677b, this.f4676a);
            this.f4677b = cm1.size();
        } else {
            Object[] copyOf = cm1.a(this.f4677b, this.f4676a.length) ? Arrays.copyOf(this.f4676a, this.f4677b) : this.f4676a;
            int i2 = this.e;
            Object[] objArr = this.d;
            cm1 = new lm1<>(copyOf, i2, objArr, objArr.length - 1, this.f4677b);
        }
        this.f4678c = true;
        this.d = null;
        return cm1;
    }

    @Override // com.google.android.gms.internal.ads.sl1, com.google.android.gms.internal.ads.vl1
    public final /* synthetic */ vl1 a(Iterable iterable) {
        jl1.a(iterable);
        if (this.d != null) {
            for (Object obj : iterable) {
                a(obj);
            }
        } else {
            super.a(iterable);
        }
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.vl1
    public final /* synthetic */ vl1 a(Object obj) {
        jl1.a(obj);
        if (this.d != null) {
            int f = cm1.f(this.f4677b);
            Object[] objArr = this.d;
            if (f <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int a2 = ql1.a(hashCode);
                while (true) {
                    int i = a2 & length;
                    Object[] objArr2 = this.d;
                    Object[] objArr3 = objArr2[i];
                    if (objArr3 != 0) {
                        if (objArr3.equals(obj)) {
                            break;
                        }
                        a2 = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.e += hashCode;
                        super.b(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.d = null;
        super.b(obj);
        return this;
    }
}
