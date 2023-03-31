package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class ml0 {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, nl0> f3726a = new HashMap();

    ml0() {
    }

    @Nullable
    public final synchronized nl0 a(String str) {
        return this.f3726a.get(str);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str, le1 le1) {
        if (!this.f3726a.containsKey(str)) {
            try {
                this.f3726a.put(str, new nl0(str, le1.m(), le1.n()));
            } catch (fe1 unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str, qc qcVar) {
        if (!this.f3726a.containsKey(str)) {
            try {
                this.f3726a.put(str, new nl0(str, qcVar.h0(), qcVar.a0()));
            } catch (Throwable unused) {
            }
        }
    }
}
