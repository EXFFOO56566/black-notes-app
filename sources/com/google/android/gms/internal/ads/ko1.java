package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public interface ko1 extends ExecutorService {
    lo1<?> a(Runnable runnable);

    <T> lo1<T> a(Callable<T> callable);
}
