package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Signature;

public final class bx1 implements sw1<Signature> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.sw1
    public final /* synthetic */ Signature a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
