package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.b;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import com.google.android.gms.ads.mediation.a;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.c;
import java.util.Map;

public final class oa extends qa {

    /* renamed from: b  reason: collision with root package name */
    private Map<Class<? extends Object>, Object> f3968b;

    static {
        new xc();
    }

    private final <NetworkExtrasT extends f, ServerParametersT extends e> sa A(String str) {
        try {
            Class<?> cls = Class.forName(str, false, oa.class.getClassLoader());
            if (b.class.isAssignableFrom(cls)) {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new wb(bVar, (f) this.f3968b.get(bVar.getAdditionalParametersType()));
            } else if (com.google.android.gms.ads.mediation.f.class.isAssignableFrom(cls)) {
                return new ob((com.google.android.gms.ads.mediation.f) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } else {
                if (a.class.isAssignableFrom(cls)) {
                    return new ob((a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                co.d(sb.toString());
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            return B(str);
        }
    }

    private final sa B(String str) {
        try {
            co.a("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new ob(new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new ob(new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new ob(new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new wb(customEventAdapter, (c) this.f3968b.get(customEventAdapter.getAdditionalParametersType()));
            }
            throw new RemoteException();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(". ");
            co.c(sb.toString(), th);
        }
    }

    public final void a(Map<Class<? extends Object>, Object> map) {
        this.f3968b = map;
    }

    @Override // com.google.android.gms.internal.ads.ra
    public final qc n(String str) {
        return xc.a(str);
    }

    @Override // com.google.android.gms.internal.ads.ra
    public final sa p(String str) {
        return A(str);
    }

    @Override // com.google.android.gms.internal.ads.ra
    public final boolean x(String str) {
        try {
            return com.google.android.gms.ads.mediation.customevent.a.class.isAssignableFrom(Class.forName(str, false, oa.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", assuming old implementation.");
            co.d(sb.toString());
            return false;
        }
    }
}
