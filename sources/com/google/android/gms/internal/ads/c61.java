package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c61 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final List f2071a;

    c61(List list) {
        this.f2071a = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<lo1> list = this.f2071a;
        JSONArray jSONArray = new JSONArray();
        for (lo1 lo1 : list) {
            if (((JSONObject) lo1.get()) != null) {
                jSONArray.put(lo1.get());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new v51(jSONArray.toString());
    }
}
