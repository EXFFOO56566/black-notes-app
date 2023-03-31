package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

public final class qr2 {

    /* renamed from: a  reason: collision with root package name */
    private final Collection<kr2<?>> f4380a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final Collection<kr2<String>> f4381b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final Collection<kr2<String>> f4382c = new ArrayList();

    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        for (kr2<String> kr2 : this.f4381b) {
            String str = (String) on2.e().a(kr2);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(c.a());
        return arrayList;
    }

    public final void a(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (kr2<?> kr2 : this.f4380a) {
            if (kr2.b() == 1) {
                kr2.a(editor, kr2.a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            co.b("Flag Json is null.");
        }
    }

    public final void a(kr2 kr2) {
        this.f4380a.add(kr2);
    }

    public final List<String> b() {
        List<String> a2 = a();
        for (kr2<String> kr2 : this.f4382c) {
            String str = (String) on2.e().a(kr2);
            if (!TextUtils.isEmpty(str)) {
                a2.add(str);
            }
        }
        a2.addAll(c.b());
        return a2;
    }

    public final void b(kr2<String> kr2) {
        this.f4381b.add(kr2);
    }

    public final void c(kr2<String> kr2) {
        this.f4382c.add(kr2);
    }
}
