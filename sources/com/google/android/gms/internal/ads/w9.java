package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class w9 implements l5 {

    /* renamed from: a  reason: collision with root package name */
    private final s8 f5228a;

    /* renamed from: b  reason: collision with root package name */
    private final ro<O> f5229b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ r9 f5230c;

    public w9(r9 r9Var, s8 s8Var, ro<O> roVar) {
        this.f5230c = r9Var;
        this.f5228a = s8Var;
        this.f5229b = roVar;
    }

    @Override // com.google.android.gms.internal.ads.l5
    public final void a(JSONObject jSONObject) {
        try {
            this.f5229b.b((O) this.f5230c.f4462a.a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f5229b.a(e);
        } catch (Throwable th) {
            this.f5228a.c();
            throw th;
        }
        this.f5228a.c();
    }

    @Override // com.google.android.gms.internal.ads.l5
    public final void b(String str) {
        if (str == null) {
            try {
                this.f5229b.a(new f9());
            } catch (IllegalStateException unused) {
            } catch (Throwable th) {
                this.f5228a.c();
                throw th;
            }
        } else {
            this.f5229b.a(new f9(str));
        }
        this.f5228a.c();
    }
}
