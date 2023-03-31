package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class r9<I, O> implements i9<I, O> {

    /* renamed from: a  reason: collision with root package name */
    private final k9<O> f4462a;

    /* renamed from: b  reason: collision with root package name */
    private final j9<I> f4463b;

    /* renamed from: c  reason: collision with root package name */
    private final f8 f4464c;
    private final String d;

    r9(f8 f8Var, String str, j9<I> j9Var, k9<O> k9Var) {
        this.f4464c = f8Var;
        this.d = str;
        this.f4463b = j9Var;
        this.f4462a = k9Var;
    }

    /* access modifiers changed from: private */
    public final void a(s8 s8Var, e9 e9Var, I i, ro<O> roVar) {
        try {
            q.c();
            String b2 = gl.b();
            p4.o.a(b2, new w9(this, s8Var, roVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", b2);
            jSONObject.put("args", this.f4463b.a(i));
            e9Var.b(this.d, jSONObject);
        } catch (Exception e) {
            roVar.a(e);
            co.b("Unable to invokeJavascript", e);
            s8Var.c();
        } catch (Throwable th) {
            s8Var.c();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ln1
    public final lo1<O> a(I i) {
        return b(i);
    }

    @Override // com.google.android.gms.internal.ads.i9
    public final lo1<O> b(I i) {
        ro roVar = new ro();
        s8 b2 = this.f4464c.b((eq1) null);
        b2.a(new u9(this, b2, i, roVar), new t9(this, roVar, b2));
        return roVar;
    }
}
