package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

public final class x71 implements y61<u71> {

    /* renamed from: a  reason: collision with root package name */
    private final gg f5379a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5380b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5381c;
    private final ko1 d;

    public x71(gg ggVar, Context context, String str, ko1 ko1) {
        this.f5379a = ggVar;
        this.f5380b = context;
        this.f5381c = str;
        this.d = ko1;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<u71> a() {
        return this.d.a(new w71(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ u71 b() {
        JSONObject jSONObject = new JSONObject();
        gg ggVar = this.f5379a;
        if (ggVar != null) {
            ggVar.a(this.f5380b, this.f5381c, jSONObject);
        }
        return new u71(jSONObject);
    }
}
