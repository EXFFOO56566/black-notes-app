package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.Provider;

public final class yw1 implements sw1<MessageDigest> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.sw1
    public final /* synthetic */ MessageDigest a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
