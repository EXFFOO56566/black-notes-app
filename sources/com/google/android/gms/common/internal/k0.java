package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import b.c.b.a.c.p.a;
import com.google.android.gms.common.internal.i;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class k0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final Map<ServiceConnection, ServiceConnection> f1633a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private int f1634b = 2;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1635c;
    private IBinder d;
    private final i.a e;
    private ComponentName f;
    private final /* synthetic */ i0 g;

    public k0(i0 i0Var, i.a aVar) {
        this.g = i0Var;
        this.e = aVar;
    }

    public final IBinder a() {
        return this.d;
    }

    public final void a(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        a unused = this.g.g;
        Context unused2 = this.g.e;
        this.e.a(this.g.e);
        this.f1633a.put(serviceConnection, serviceConnection2);
    }

    public final void a(ServiceConnection serviceConnection, String str) {
        a unused = this.g.g;
        Context unused2 = this.g.e;
        this.f1633a.remove(serviceConnection);
    }

    public final void a(String str) {
        this.f1634b = 3;
        boolean a2 = this.g.g.a(this.g.e, str, this.e.a(this.g.e), this, this.e.c());
        this.f1635c = a2;
        if (a2) {
            this.g.f.sendMessageDelayed(this.g.f.obtainMessage(1, this.e), this.g.i);
            return;
        }
        this.f1634b = 2;
        try {
            this.g.g.a(this.g.e, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.f1633a.containsKey(serviceConnection);
    }

    public final ComponentName b() {
        return this.f;
    }

    public final void b(String str) {
        this.g.f.removeMessages(1, this.e);
        this.g.g.a(this.g.e, this);
        this.f1635c = false;
        this.f1634b = 2;
    }

    public final int c() {
        return this.f1634b;
    }

    public final boolean d() {
        return this.f1635c;
    }

    public final boolean e() {
        return this.f1633a.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.d) {
            this.g.f.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.f1633a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f1634b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.d) {
            this.g.f.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.f1633a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f1634b = 2;
        }
    }
}
