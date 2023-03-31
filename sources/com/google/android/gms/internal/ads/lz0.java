package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

public final class lz0 extends uc {

    /* renamed from: b  reason: collision with root package name */
    private final String f3628b;

    /* renamed from: c  reason: collision with root package name */
    private final qc f3629c;
    private ro<JSONObject> d;
    private final JSONObject e;
    @GuardedBy("this")
    private boolean f = false;

    public lz0(String str, qc qcVar, ro<JSONObject> roVar) {
        JSONObject jSONObject = new JSONObject();
        this.e = jSONObject;
        this.d = roVar;
        this.f3628b = str;
        this.f3629c = qcVar;
        try {
            jSONObject.put("adapter_version", qcVar.h0().toString());
            this.e.put("sdk_version", this.f3629c.a0().toString());
            this.e.put("name", this.f3628b);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.rc
    public final synchronized void b(String str) {
        if (!this.f) {
            try {
                this.e.put("signal_error", str);
            } catch (JSONException unused) {
            }
            this.d.b(this.e);
            this.f = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.rc
    public final synchronized void e(String str) {
        if (!this.f) {
            if (str == null) {
                b("Adapter returned null signals");
                return;
            }
            try {
                this.e.put("signals", str);
            } catch (JSONException unused) {
            }
            this.d.b(this.e);
            this.f = true;
        }
    }
}
