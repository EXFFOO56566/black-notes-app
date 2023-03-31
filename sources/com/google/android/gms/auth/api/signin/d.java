package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: b  reason: collision with root package name */
    static final Comparator f1507b = new d();

    private d() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).d().compareTo(((Scope) obj2).d());
    }
}
