package com.google.android.gms.internal.ads;

import java.util.Map;

public final class k4 implements d5<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final n4 f3317a;

    public k4(n4 n4Var) {
        this.f3317a = n4Var;
    }

    @Override // com.google.android.gms.internal.ads.d5
    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("name");
        if (str == null) {
            co.d("App event with no name parameter.");
        } else {
            this.f3317a.a(str, map.get("info"));
        }
    }
}
