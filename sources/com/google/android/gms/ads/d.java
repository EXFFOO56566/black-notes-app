package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.yp2;
import com.google.android.gms.internal.ads.zp2;
import java.util.Date;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final zp2 f1384a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final yp2 f1385a;

        public a() {
            yp2 yp2 = new yp2();
            this.f1385a = yp2;
            yp2.b("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        @Deprecated
        public final a a(int i) {
            this.f1385a.a(i);
            return this;
        }

        public final a a(Location location) {
            this.f1385a.a(location);
            return this;
        }

        public final a a(Class<? extends Object> cls, Bundle bundle) {
            this.f1385a.a(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f1385a.c("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public final a a(String str) {
            this.f1385a.a(str);
            return this;
        }

        @Deprecated
        public final a a(Date date) {
            this.f1385a.a(date);
            return this;
        }

        @Deprecated
        public final a a(boolean z) {
            this.f1385a.a(z);
            return this;
        }

        public final d a() {
            return new d(this);
        }

        @Deprecated
        public final a b(String str) {
            this.f1385a.b(str);
            return this;
        }

        @Deprecated
        public final a b(boolean z) {
            this.f1385a.b(z);
            return this;
        }
    }

    private d(a aVar) {
        this.f1384a = new zp2(aVar.f1385a);
    }

    public final zp2 a() {
        return this.f1384a;
    }
}
