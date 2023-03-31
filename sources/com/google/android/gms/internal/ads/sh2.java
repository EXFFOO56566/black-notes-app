package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
public final class sh2 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f4657a = new Object();
    @GuardedBy("activityTrackerLock")

    /* renamed from: b  reason: collision with root package name */
    private vh2 f4658b = null;
    @GuardedBy("activityTrackerLock")

    /* renamed from: c  reason: collision with root package name */
    private boolean f4659c = false;

    public final Activity a() {
        synchronized (this.f4657a) {
            if (this.f4658b == null) {
                return null;
            }
            return this.f4658b.a();
        }
    }

    public final void a(Context context) {
        synchronized (this.f4657a) {
            if (!this.f4659c) {
                Application application = null;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                }
                if (application == null) {
                    co.d("Can not cast Context to Application");
                    return;
                }
                if (this.f4658b == null) {
                    this.f4658b = new vh2();
                }
                this.f4658b.a(application, context);
                this.f4659c = true;
            }
        }
    }

    public final void a(xh2 xh2) {
        synchronized (this.f4657a) {
            if (this.f4658b == null) {
                this.f4658b = new vh2();
            }
            this.f4658b.a(xh2);
        }
    }

    public final Context b() {
        synchronized (this.f4657a) {
            if (this.f4658b == null) {
                return null;
            }
            return this.f4658b.b();
        }
    }

    public final void b(xh2 xh2) {
        synchronized (this.f4657a) {
            if (this.f4658b != null) {
                this.f4658b.b(xh2);
            }
        }
    }
}
