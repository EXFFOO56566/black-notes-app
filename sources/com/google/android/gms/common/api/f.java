package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.m;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

@Deprecated
public abstract class f {
    @GuardedBy("sAllClients")

    /* renamed from: a  reason: collision with root package name */
    private static final Set<f> f1543a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public interface a extends e {
    }

    @Deprecated
    public interface b extends k {
    }

    public static Set<f> c() {
        Set<f> set;
        synchronized (f1543a) {
            set = f1543a;
        }
        return set;
    }

    public Looper a() {
        throw new UnsupportedOperationException();
    }

    public <A extends a.b, T extends d<? extends k, A>> T a(T t) {
        throw new UnsupportedOperationException();
    }

    public boolean a(m mVar) {
        throw new UnsupportedOperationException();
    }

    public void b() {
        throw new UnsupportedOperationException();
    }
}
