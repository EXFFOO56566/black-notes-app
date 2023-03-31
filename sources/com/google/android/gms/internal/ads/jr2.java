package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class jr2 implements Callable<Boolean> {
    jr2() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Boolean call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
