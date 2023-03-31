package com.google.android.gms.internal.ads;

import android.content.Context;

public final class ew implements r42<ng> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f2487a;

    public ew(e52<Context> e52) {
        this.f2487a = e52;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Context context = this.f2487a.get();
        lg lgVar = new lg(context, new tg(context).a());
        y42.a(lgVar, "Cannot return null from a non-@Nullable @Provides method");
        return lgVar;
    }
}
