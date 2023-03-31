package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.c12;

public abstract class pp1<KeyFormatProtoT extends c12, KeyT> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<KeyFormatProtoT> f4216a;

    public pp1(Class<KeyFormatProtoT> cls) {
        this.f4216a = cls;
    }

    public abstract KeyFormatProtoT a(dy1 dy1);

    public final Class<KeyFormatProtoT> a() {
        return this.f4216a;
    }

    public abstract void a(KeyFormatProtoT keyformatprotot);

    public abstract KeyT b(KeyFormatProtoT keyformatprotot);
}
