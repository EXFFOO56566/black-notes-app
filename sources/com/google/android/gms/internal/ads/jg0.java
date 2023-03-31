package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.d;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public final class jg0 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final jj0 f3218b;

    /* renamed from: c  reason: collision with root package name */
    private final d f3219c;
    private v3 d;
    private d5<Object> e;
    String f;
    Long g;
    WeakReference<View> h;

    public jg0(jj0 jj0, d dVar) {
        this.f3218b = jj0;
        this.f3219c = dVar;
    }

    private final void c() {
        View view;
        this.f = null;
        this.g = null;
        WeakReference<View> weakReference = this.h;
        if (weakReference != null && (view = weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener(null);
            this.h = null;
        }
    }

    public final void a() {
        if (this.d != null && this.g != null) {
            c();
            try {
                this.d.U1();
            } catch (RemoteException e2) {
                co.d("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void a(v3 v3Var) {
        this.d = v3Var;
        d5<Object> d5Var = this.e;
        if (d5Var != null) {
            this.f3218b.b("/unconfirmedClick", d5Var);
        }
        mg0 mg0 = new mg0(this, v3Var);
        this.e = mg0;
        this.f3218b.a("/unconfirmedClick", mg0);
    }

    public final v3 b() {
        return this.d;
    }

    public final void onClick(View view) {
        WeakReference<View> weakReference = this.h;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.f == null || this.g == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.f);
                hashMap.put("time_interval", String.valueOf(this.f3219c.a() - this.g.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.f3218b.a("sendMessageToNativeJs", hashMap);
            }
            c();
        }
    }
}
