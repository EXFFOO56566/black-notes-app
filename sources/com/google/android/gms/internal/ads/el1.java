package com.google.android.gms.internal.ads;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class el1<T> implements Serializable {
    el1() {
    }

    public static <T> el1<T> a(@NullableDecl T t) {
        return t == null ? wk1.f5290b : new il1(t);
    }

    @NullableDecl
    public abstract T a();
}
