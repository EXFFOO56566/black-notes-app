package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

public final class dq0 extends bq0 {
    private static final Pattern g = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: b  reason: collision with root package name */
    private final jp0 f2294b;

    /* renamed from: c  reason: collision with root package name */
    private final ko1 f2295c;
    private final zd1 d;
    private final ScheduledExecutorService e;
    private final us0 f;

    dq0(h80 h80, zd1 zd1, jp0 jp0, ko1 ko1, ScheduledExecutorService scheduledExecutorService, us0 us0) {
        super(h80);
        this.d = zd1;
        this.f2294b = jp0;
        this.f2295c = ko1;
        this.e = scheduledExecutorService;
        this.f = us0;
    }

    @Override // com.google.android.gms.internal.ads.bq0
    public final lo1<vd1> a(zf zfVar) {
        lo1<vd1> a2 = yn1.a(this.f2294b.a(zfVar), new gq0(this), this.f2295c);
        if (((Boolean) on2.e().a(zr2.v2)).booleanValue()) {
            a2 = yn1.a(yn1.a(a2, (long) ((Integer) on2.e().a(zr2.w2)).intValue(), TimeUnit.SECONDS, this.e), TimeoutException.class, fq0.f2641a, jo.f);
        }
        yn1.a(a2, new iq0(this), jo.f);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(InputStream inputStream) {
        return yn1.a(new vd1(new pd1(this.d), sd1.a(new InputStreamReader(inputStream))));
    }
}
