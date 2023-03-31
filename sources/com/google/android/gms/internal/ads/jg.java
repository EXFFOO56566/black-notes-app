package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class jg implements Callable<ig> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f3216a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ kg f3217b;

    jg(kg kgVar, Context context) {
        this.f3217b = kgVar;
        this.f3216a = context;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ ig call() {
        ig igVar;
        mg mgVar = (mg) this.f3217b.f3384a.get(this.f3216a);
        if (mgVar != null) {
            if (!(mgVar.f3703a + i0.f3004a.a().longValue() < q.j().a())) {
                igVar = new hg(this.f3216a, mgVar.f3704b).a();
                this.f3217b.f3384a.put(this.f3216a, new mg(this.f3217b, igVar));
                return igVar;
            }
        }
        igVar = new hg(this.f3216a).a();
        this.f3217b.f3384a.put(this.f3216a, new mg(this.f3217b, igVar));
        return igVar;
    }
}
