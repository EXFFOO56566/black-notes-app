package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.q;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class x5 implements de2 {

    /* renamed from: a  reason: collision with root package name */
    private volatile q5 f5363a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5364b;

    public x5(Context context) {
        this.f5364b = context;
    }

    /* access modifiers changed from: private */
    public final void a() {
        if (this.f5363a != null) {
            this.f5363a.i();
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.internal.ads.de2
    public final ef2 a(gh2<?> gh2) {
        p5 a2 = p5.a(gh2);
        long b2 = q.j().b();
        try {
            ro roVar = new ro();
            this.f5363a = new q5(this.f5364b, q.q().b(), new b6(this, roVar), new f6(this, roVar));
            this.f5363a.m();
            lo1 a3 = yn1.a(yn1.a(roVar, new a6(this, a2), jo.f3256a), (long) ((Integer) on2.e().a(zr2.S1)).intValue(), TimeUnit.MILLISECONDS, jo.d);
            a3.a(new c6(this), jo.f3256a);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) a3.get();
            long b3 = q.j().b() - b2;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(b3);
            sb.append("ms");
            wk.e(sb.toString());
            r5 r5Var = (r5) new yf(parcelFileDescriptor).a(r5.CREATOR);
            if (r5Var == null) {
                return null;
            }
            if (r5Var.f4446b) {
                throw new e3(r5Var.f4447c);
            } else if (r5Var.f.length != r5Var.g.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                int i = 0;
                while (true) {
                    String[] strArr = r5Var.f;
                    if (i >= strArr.length) {
                        return new ef2(r5Var.d, r5Var.e, hashMap, r5Var.h, r5Var.i);
                    }
                    hashMap.put(strArr[i], r5Var.g[i]);
                    i++;
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(q.j().b() - b2);
            sb2.append("ms");
            wk.e(sb2.toString());
            return null;
        } catch (Throwable th) {
            long b4 = q.j().b() - b2;
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(b4);
            sb3.append("ms");
            wk.e(sb3.toString());
            throw th;
        }
    }
}
