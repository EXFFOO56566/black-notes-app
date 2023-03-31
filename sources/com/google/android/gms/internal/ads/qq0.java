package com.google.android.gms.internal.ads;

import android.os.Binder;
import b.c.b.a.c.b;
import com.google.android.gms.common.internal.c;
import java.io.InputStream;

public abstract class qq0 implements c.a, c.b {

    /* renamed from: a  reason: collision with root package name */
    protected final ro<InputStream> f4374a = new ro<>();

    /* renamed from: b  reason: collision with root package name */
    protected final Object f4375b = new Object();

    /* renamed from: c  reason: collision with root package name */
    protected boolean f4376c = false;
    protected boolean d = false;
    protected zf e;
    protected gf f;

    /* access modifiers changed from: protected */
    public final void a() {
        synchronized (this.f4375b) {
            this.d = true;
            if (this.f.a() || this.f.f()) {
                this.f.i();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.common.internal.c.b
    public void a(b bVar) {
        co.a("Disconnected from remote ad request service.");
        this.f4374a.a(new ar0(0));
    }

    @Override // com.google.android.gms.common.internal.c.a
    public void b(int i) {
        co.a("Cannot connect to remote service, fallback to local instance.");
    }
}
