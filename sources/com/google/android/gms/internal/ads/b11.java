package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ik2;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class b11 {

    /* renamed from: a  reason: collision with root package name */
    private String f1844a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f1845a;

        public final a a(String str) {
            this.f1845a = str;
            return this;
        }
    }

    private b11(a aVar) {
        this.f1844a = aVar.f1845a;
    }

    public final Set<String> a() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f1844a.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String b() {
        return this.f1844a.toLowerCase(Locale.ROOT);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final ik2.a c() {
        char c2;
        String str = this.f1844a;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        return c2 != 0 ? c2 != 1 ? c2 != 2 ? c2 != 3 ? ik2.a.AD_INITIATER_UNSPECIFIED : ik2.a.REWARD_BASED_VIDEO_AD : ik2.a.AD_LOADER : ik2.a.INTERSTITIAL : ik2.a.BANNER;
    }
}
