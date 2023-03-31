package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.api.i;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public abstract class wr implements i {

    /* renamed from: b  reason: collision with root package name */
    protected Context f5309b;

    /* renamed from: c  reason: collision with root package name */
    protected String f5310c;
    protected WeakReference<gq> d;

    public wr(gq gqVar) {
        this.f5309b = gqVar.getContext();
        this.f5310c = q.c().a(this.f5309b, gqVar.b().f2633b);
        this.d = new WeakReference<>(gqVar);
    }

    /* access modifiers changed from: private */
    public final void a(String str, Map<String, String> map) {
        gq gqVar = this.d.get();
        if (gqVar != null) {
            gqVar.a(str, map);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: private */
    public static String c(String str) {
        char c2;
        switch (str.hashCode()) {
            case -1947652542:
                if (str.equals("interrupted")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1396664534:
                if (str.equals("badUrl")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1347010958:
                if (str.equals("inProgress")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -918817863:
                if (str.equals("downloadTimeout")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -659376217:
                if (str.equals("contentLengthMissing")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -642208130:
                if (str.equals("playerFailed")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -354048396:
                if (str.equals("sizeExceeded")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -32082395:
                if (str.equals("externalAbort")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 3387234:
                if (str.equals("noop")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 96784904:
                if (str.equals("error")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 580119100:
                if (str.equals("expireFailed")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 725497484:
                if (str.equals("noCacheDir")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                return "internal";
            case 6:
            case 7:
                return "io";
            case '\b':
            case '\t':
                return "network";
            case '\n':
            case 11:
                return "policy";
        }
    }

    @Override // com.google.android.gms.common.api.i
    public void a() {
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String str2, int i) {
        sn.f4682b.post(new as(this, str, str2, i));
    }

    public final void a(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        sn.f4682b.post(new bs(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    public final void a(String str, String str2, long j) {
        sn.f4682b.post(new ds(this, str, str2, j));
    }

    public final void a(String str, String str2, long j, long j2, boolean z, int i, int i2) {
        sn.f4682b.post(new yr(this, str, str2, j, j2, z, i, i2));
    }

    public final void a(String str, String str2, String str3, String str4) {
        sn.f4682b.post(new cs(this, str, str2, str3, str4));
    }

    public abstract boolean a(String str);

    public boolean a(String str, String[] strArr) {
        return a(str);
    }

    /* access modifiers changed from: protected */
    public String b(String str) {
        on2.a();
        return sn.a(str);
    }

    public abstract void b();

    /* access modifiers changed from: protected */
    public void b(int i) {
    }

    /* access modifiers changed from: protected */
    public void c(int i) {
    }

    /* access modifiers changed from: protected */
    public void d(int i) {
    }

    /* access modifiers changed from: protected */
    public void e(int i) {
    }
}
