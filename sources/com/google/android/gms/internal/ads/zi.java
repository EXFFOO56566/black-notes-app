package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;

public final class zi implements fh2 {

    /* renamed from: b  reason: collision with root package name */
    private final Context f5757b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f5758c;
    private String d;
    private boolean e;

    public zi(Context context, String str) {
        this.f5757b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.d = str;
        this.e = false;
        this.f5758c = new Object();
    }

    @Override // com.google.android.gms.internal.ads.fh2
    public final void a(hh2 hh2) {
        a(hh2.j);
    }

    public final void a(boolean z) {
        if (q.A().a(this.f5757b)) {
            synchronized (this.f5758c) {
                if (this.e != z) {
                    this.e = z;
                    if (!TextUtils.isEmpty(this.d)) {
                        if (this.e) {
                            q.A().a(this.f5757b, this.d);
                        } else {
                            q.A().b(this.f5757b, this.d);
                        }
                    }
                }
            }
        }
    }

    public final String j() {
        return this.d;
    }
}
