package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

public final class cb1 {
    public static <T> void a(AtomicReference<T> atomicReference, bb1<T> bb1) {
        T t = atomicReference.get();
        if (t != null) {
            try {
                bb1.a(t);
            } catch (RemoteException e) {
                co.d("#007 Could not call remote method.", e);
            }
        }
    }
}
