package com.google.android.gms.common.api;

import com.google.android.gms.common.api.k;
import java.util.concurrent.TimeUnit;

public abstract class g<R extends k> {

    public interface a {
        void a(Status status);
    }

    public abstract R a(long j, TimeUnit timeUnit);

    public abstract void a(a aVar);
}
