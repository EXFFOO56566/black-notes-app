package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.tx1;
import com.google.android.gms.internal.ads.wx1;

public abstract class wx1<MessageType extends tx1<MessageType, BuilderType>, BuilderType extends wx1<MessageType, BuilderType>> implements b12 {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.wx1<MessageType extends com.google.android.gms.internal.ads.tx1<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.wx1<MessageType, BuilderType>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.b12
    public final /* synthetic */ b12 a(c12 c12) {
        if (h().getClass().isInstance(c12)) {
            a((tx1) c12);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* access modifiers changed from: protected */
    public abstract BuilderType a(MessageType messagetype);
}
