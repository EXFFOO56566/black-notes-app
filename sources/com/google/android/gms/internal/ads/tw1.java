package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.sw1;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public final class tw1<T_WRAPPER extends sw1<T_ENGINE>, T_ENGINE> {
    private static final Logger d = Logger.getLogger(tw1.class.getName());
    private static final List<Provider> e;
    public static final tw1<vw1, Cipher> f = new tw1<>(new vw1());
    public static final tw1<zw1, Mac> g = new tw1<>(new zw1());
    public static final tw1<uw1, KeyAgreement> h = new tw1<>(new uw1());
    public static final tw1<ww1, KeyPairGenerator> i = new tw1<>(new ww1());
    public static final tw1<xw1, KeyFactory> j = new tw1<>(new xw1());

    /* renamed from: a  reason: collision with root package name */
    private T_WRAPPER f4869a;

    /* renamed from: b  reason: collision with root package name */
    private List<Provider> f4870b = e;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4871c = true;

    static {
        if (gx1.a()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 2; i2++) {
                String str = strArr[i2];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    d.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
                }
            }
            e = arrayList;
        } else {
            e = new ArrayList();
        }
        new tw1(new bx1());
        new tw1(new yw1());
    }

    private tw1(T_WRAPPER t_wrapper) {
        this.f4869a = t_wrapper;
    }

    public final T_ENGINE a(String str) {
        Exception exc = null;
        for (Provider provider : this.f4870b) {
            try {
                return (T_ENGINE) this.f4869a.a(str, provider);
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        if (this.f4871c) {
            return (T_ENGINE) this.f4869a.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
