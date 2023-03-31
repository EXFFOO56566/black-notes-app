package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

public final class cz0 {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, qc> f2191a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final rl0 f2192b;

    public cz0(rl0 rl0) {
        this.f2192b = rl0;
    }

    public final void a(String str) {
        try {
            this.f2191a.put(str, this.f2192b.a(str));
        } catch (RemoteException e) {
            co.b("Couldn't create RTB adapter : ", e);
        }
    }

    @CheckForNull
    public final qc b(String str) {
        if (this.f2191a.containsKey(str)) {
            return this.f2191a.get(str);
        }
        return null;
    }
}
