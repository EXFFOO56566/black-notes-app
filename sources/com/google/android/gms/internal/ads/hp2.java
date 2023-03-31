package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.github.ajalt.reprint.module.spass.BuildConfig;

public final class hp2 {

    /* renamed from: a  reason: collision with root package name */
    private final String f2961a;

    public hp2(cp2 cp2) {
        String str;
        try {
            str = cp2.U0();
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
            str = null;
        }
        this.f2961a = str;
    }

    public final String toString() {
        return this.f2961a;
    }
}
