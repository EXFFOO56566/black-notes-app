package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import b.c.b.a.c.j;
import b.c.b.a.c.q.c;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class vr2 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final Object f5149a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final ConditionVariable f5150b = new ConditionVariable();

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f5151c = false;
    private volatile boolean d = false;
    private SharedPreferences e = null;
    private Bundle f = new Bundle();
    private Context g;
    private JSONObject h = new JSONObject();

    private final void b() {
        if (this.e != null) {
            try {
                this.h = new JSONObject((String) kn.a(new xr2(this)));
            } catch (JSONException unused) {
            }
        }
    }

    public final <T> T a(kr2<T> kr2) {
        if (!this.f5150b.block(5000)) {
            synchronized (this.f5149a) {
                if (!this.d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f5151c || this.e == null) {
            synchronized (this.f5149a) {
                if (this.f5151c) {
                    if (this.e == null) {
                    }
                }
                return kr2.c();
            }
        }
        if (kr2.b() != 2) {
            return (kr2.b() != 1 || !this.h.has(kr2.a())) ? (T) kn.a(new ur2(this, kr2)) : kr2.a(this.h);
        }
        Bundle bundle = this.f;
        return bundle == null ? kr2.c() : kr2.a(bundle);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String a() {
        return this.e.getString("flag_configuration", "{}");
    }

    public final void a(Context context) {
        if (!this.f5151c) {
            synchronized (this.f5149a) {
                if (!this.f5151c) {
                    if (!this.d) {
                        this.d = true;
                    }
                    Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    this.g = applicationContext;
                    try {
                        this.f = c.a(applicationContext).a(this.g.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context b2 = j.b(context);
                        if (b2 == null && context != null) {
                            Context applicationContext2 = context.getApplicationContext();
                            if (applicationContext2 != null) {
                                context = applicationContext2;
                            }
                            b2 = context;
                        }
                        if (b2 != null) {
                            on2.c();
                            SharedPreferences sharedPreferences = b2.getSharedPreferences("google_ads_flags", 0);
                            this.e = sharedPreferences;
                            if (sharedPreferences != null) {
                                sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                            }
                            f1.a(new wr2(this));
                            b();
                            this.f5151c = true;
                            this.d = false;
                            this.f5150b.open();
                        }
                    } finally {
                        this.d = false;
                        this.f5150b.open();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object b(kr2 kr2) {
        return kr2.a(this.e);
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            b();
        }
    }
}
