package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;
import java.util.Set;

public final class w70 implements r42<t70> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Set<ab0<o>>> f5220a;

    private w70(e52<Set<ab0<o>>> e52) {
        this.f5220a = e52;
    }

    public static w70 a(e52<Set<ab0<o>>> e52) {
        return new w70(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new t70(this.f5220a.get());
    }
}
