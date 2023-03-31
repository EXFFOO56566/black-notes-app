package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class rl0 {

    /* renamed from: a  reason: collision with root package name */
    private final ml0 f4514a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<ra> f4515b = new AtomicReference<>();

    rl0(ml0 ml0) {
        this.f4514a = ml0;
    }

    private final ra b() {
        ra raVar = this.f4515b.get();
        if (raVar != null) {
            return raVar;
        }
        co.d("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    private final sa b(String str, JSONObject jSONObject) {
        ra b2 = b();
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                return b2.x(jSONObject.getString("class_name")) ? b2.p("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : b2.p("com.google.ads.mediation.customevent.CustomEventAdapter");
            } catch (JSONException e) {
                co.b("Invalid custom event.", e);
            }
        }
        return b2.p(str);
    }

    public final le1 a(String str, JSONObject jSONObject) {
        try {
            le1 le1 = new le1("com.google.ads.mediation.admob.AdMobAdapter".equals(str) ? new ob(new AdMobAdapter()) : "com.google.ads.mediation.AdUrlAdapter".equals(str) ? new ob(new AdUrlAdapter()) : "com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str) ? new ob(new zzaol()) : b(str, jSONObject));
            this.f4514a.a(str, le1);
            return le1;
        } catch (Throwable th) {
            throw new fe1(th);
        }
    }

    public final qc a(String str) {
        qc n = b().n(str);
        this.f4514a.a(str, n);
        return n;
    }

    public final void a(ra raVar) {
        this.f4515b.compareAndSet(null, raVar);
    }

    public final boolean a() {
        return this.f4515b.get() != null;
    }
}
