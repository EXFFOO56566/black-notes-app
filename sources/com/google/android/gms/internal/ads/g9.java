package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class g9 implements m7, d9 {

    /* renamed from: b  reason: collision with root package name */
    private final e9 f2724b;

    /* renamed from: c  reason: collision with root package name */
    private final HashSet<AbstractMap.SimpleEntry<String, d5<? super e9>>> f2725c = new HashSet<>();

    public g9(e9 e9Var) {
        this.f2724b = e9Var;
    }

    @Override // com.google.android.gms.internal.ads.c8, com.google.android.gms.internal.ads.m7
    public final void a(String str) {
        this.f2724b.a(str);
    }

    @Override // com.google.android.gms.internal.ads.e9
    public final void a(String str, d5<? super e9> d5Var) {
        this.f2724b.a(str, d5Var);
        this.f2725c.remove(new AbstractMap.SimpleEntry(str, d5Var));
    }

    @Override // com.google.android.gms.internal.ads.m7
    public final void a(String str, String str2) {
        l7.a(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.e7
    public final void a(String str, Map map) {
        l7.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.e7, com.google.android.gms.internal.ads.m7
    public final void a(String str, JSONObject jSONObject) {
        l7.b(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.e9
    public final void b(String str, d5<? super e9> d5Var) {
        this.f2724b.b(str, d5Var);
        this.f2725c.add(new AbstractMap.SimpleEntry<>(str, d5Var));
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final void b(String str, JSONObject jSONObject) {
        l7.a(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.d9
    public final void t() {
        Iterator<AbstractMap.SimpleEntry<String, d5<? super e9>>> it = this.f2725c.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry<String, d5<? super e9>> next = it.next();
            String valueOf = String.valueOf(next.getValue().toString());
            wk.e(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.f2724b.a(next.getKey(), next.getValue());
        }
        this.f2725c.clear();
    }
}
