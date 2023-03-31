package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.s.d;
import com.google.android.gms.ads.s.g;
import com.google.android.gms.ads.s.h;
import com.google.android.gms.ads.s.i;
import com.google.android.gms.ads.s.k;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.c4;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.f4;
import com.google.android.gms.internal.ads.g4;
import com.google.android.gms.internal.ads.h4;
import com.google.android.gms.internal.ads.i4;
import com.google.android.gms.internal.ads.m1;
import com.google.android.gms.internal.ads.nm2;
import com.google.android.gms.internal.ads.oa;
import com.google.android.gms.internal.ads.on2;
import com.google.android.gms.internal.ads.sm2;
import com.google.android.gms.internal.ads.wn2;
import com.google.android.gms.internal.ads.xn2;
import com.google.android.gms.internal.ads.zp2;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1380a;

    /* renamed from: b  reason: collision with root package name */
    private final wn2 f1381b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f1382a;

        /* renamed from: b  reason: collision with root package name */
        private final xn2 f1383b;

        private a(Context context, xn2 xn2) {
            this.f1382a = context;
            this.f1383b = xn2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(Context context, String str) {
            this(context, on2.b().a(context, str, new oa()));
            r.a(context, "context cannot be null");
        }

        public a a(b bVar) {
            try {
                this.f1383b.b(new nm2(bVar));
            } catch (RemoteException e) {
                co.c("Failed to set AdListener.", e);
            }
            return this;
        }

        public a a(d dVar) {
            try {
                this.f1383b.a(new m1(dVar));
            } catch (RemoteException e) {
                co.c("Failed to specify native ad options", e);
            }
            return this;
        }

        @Deprecated
        public a a(g.a aVar) {
            try {
                this.f1383b.a(new c4(aVar));
            } catch (RemoteException e) {
                co.c("Failed to add app install ad listener", e);
            }
            return this;
        }

        @Deprecated
        public a a(h.a aVar) {
            try {
                this.f1383b.a(new g4(aVar));
            } catch (RemoteException e) {
                co.c("Failed to add content ad listener", e);
            }
            return this;
        }

        public a a(k.a aVar) {
            try {
                this.f1383b.a(new i4(aVar));
            } catch (RemoteException e) {
                co.c("Failed to add google native ad listener", e);
            }
            return this;
        }

        public a a(String str, i.b bVar, i.a aVar) {
            try {
                this.f1383b.a(str, new h4(bVar), aVar == null ? null : new f4(aVar));
            } catch (RemoteException e) {
                co.c("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public c a() {
            try {
                return new c(this.f1382a, this.f1383b.H1());
            } catch (RemoteException e) {
                co.b("Failed to build AdLoader.", e);
                return null;
            }
        }
    }

    c(Context context, wn2 wn2) {
        this(context, wn2, sm2.f4681a);
    }

    private c(Context context, wn2 wn2, sm2 sm2) {
        this.f1380a = context;
        this.f1381b = wn2;
    }

    private final void a(zp2 zp2) {
        try {
            this.f1381b.b(sm2.a(this.f1380a, zp2));
        } catch (RemoteException e) {
            co.b("Failed to load ad.", e);
        }
    }

    public void a(d dVar) {
        a(dVar.a());
    }
}
