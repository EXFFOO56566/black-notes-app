package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Cipher;

public final class vw1 implements sw1<Cipher> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.sw1
    public final /* synthetic */ Cipher a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
