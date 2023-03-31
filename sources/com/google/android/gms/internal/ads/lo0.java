package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class lo0 implements r42<Set<ab0<m80>>> {
    public static Set<ab0<m80>> a(io0 io0, so0 so0, Executor executor) {
        Set<ab0<m80>> i = io0.i(so0, executor);
        y42.a(i, "Cannot return null from a non-@Nullable @Provides method");
        return i;
    }
}
