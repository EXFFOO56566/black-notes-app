package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class sc1 implements r42<pc1> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f4633a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f4634b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<kv> f4635c;
    private final e52<mb1<fk0, ck0>> d;
    private final e52<rb1> e;
    private final e52<be1> f;
    private final e52<td1> g;

    public sc1(e52<Context> e52, e52<Executor> e522, e52<kv> e523, e52<mb1<fk0, ck0>> e524, e52<rb1> e525, e52<be1> e526, e52<td1> e527) {
        this.f4633a = e52;
        this.f4634b = e522;
        this.f4635c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
        this.g = e527;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new pc1(this.f4633a.get(), this.f4634b.get(), this.f4635c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
