package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
public final class ip extends ThreadLocal<ByteBuffer> {
    ip(jq jqVar) {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ ByteBuffer initialValue() {
        return ByteBuffer.allocate(32);
    }
}
