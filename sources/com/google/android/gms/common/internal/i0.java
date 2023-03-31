package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import b.c.b.a.c.p.a;
import b.c.b.a.e.e.d;
import com.google.android.gms.common.internal.i;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

/* access modifiers changed from: package-private */
public final class i0 extends i implements Handler.Callback {
    @GuardedBy("mConnectionStatus")
    private final HashMap<i.a, k0> d = new HashMap<>();
    private final Context e;
    private final Handler f;
    private final a g;
    private final long h;
    private final long i;

    i0(Context context) {
        this.e = context.getApplicationContext();
        this.f = new d(context.getMainLooper(), this);
        this.g = a.a();
        this.h = 5000;
        this.i = 300000;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.i
    public final boolean a(i.a aVar, ServiceConnection serviceConnection, String str) {
        boolean d2;
        r.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.d) {
            k0 k0Var = this.d.get(aVar);
            if (k0Var == null) {
                k0Var = new k0(this, aVar);
                k0Var.a(serviceConnection, serviceConnection, str);
                k0Var.a(str);
                this.d.put(aVar, k0Var);
            } else {
                this.f.removeMessages(0, aVar);
                if (!k0Var.a(serviceConnection)) {
                    k0Var.a(serviceConnection, serviceConnection, str);
                    int c2 = k0Var.c();
                    if (c2 == 1) {
                        serviceConnection.onServiceConnected(k0Var.b(), k0Var.a());
                    } else if (c2 == 2) {
                        k0Var.a(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            d2 = k0Var.d();
        }
        return d2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.i
    public final void b(i.a aVar, ServiceConnection serviceConnection, String str) {
        r.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.d) {
            k0 k0Var = this.d.get(aVar);
            if (k0Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (k0Var.a(serviceConnection)) {
                k0Var.a(serviceConnection, str);
                if (k0Var.e()) {
                    this.f.sendMessageDelayed(this.f.obtainMessage(0, aVar), this.h);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.d) {
                i.a aVar = (i.a) message.obj;
                k0 k0Var = this.d.get(aVar);
                if (k0Var != null && k0Var.e()) {
                    if (k0Var.d()) {
                        k0Var.b("GmsClientSupervisor");
                    }
                    this.d.remove(aVar);
                }
            }
            return true;
        } else if (i2 != 1) {
            return false;
        } else {
            synchronized (this.d) {
                i.a aVar2 = (i.a) message.obj;
                k0 k0Var2 = this.d.get(aVar2);
                if (k0Var2 != null && k0Var2.c() == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName b2 = k0Var2.b();
                    if (b2 == null) {
                        b2 = aVar2.a();
                    }
                    if (b2 == null) {
                        b2 = new ComponentName(aVar2.b(), "unknown");
                    }
                    k0Var2.onServiceDisconnected(b2);
                }
            }
            return true;
        }
    }
}
