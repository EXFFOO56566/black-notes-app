package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.bl2;
import com.google.android.gms.internal.ads.pk2;
import com.google.android.gms.internal.ads.zk2;
import java.util.ArrayList;

public final class xs0 {
    private static final SparseArray<bl2.c> g;

    /* renamed from: a */
    private final Context f5489a;

    /* renamed from: b */
    private final z40 f5490b;

    /* renamed from: c */
    private final TelephonyManager f5491c;
    private final us0 d;
    private final os0 e;
    private wl2 f;

    static {
        SparseArray<bl2.c> sparseArray = new SparseArray<>();
        g = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), bl2.c.CONNECTED);
        g.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), bl2.c.CONNECTING);
        g.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), bl2.c.CONNECTING);
        g.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), bl2.c.CONNECTING);
        g.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), bl2.c.DISCONNECTING);
        g.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), bl2.c.DISCONNECTED);
        g.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), bl2.c.DISCONNECTED);
        g.put(NetworkInfo.DetailedState.FAILED.ordinal(), bl2.c.DISCONNECTED);
        g.put(NetworkInfo.DetailedState.IDLE.ordinal(), bl2.c.DISCONNECTED);
        g.put(NetworkInfo.DetailedState.SCANNING.ordinal(), bl2.c.DISCONNECTED);
        g.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), bl2.c.SUSPENDED);
        if (Build.VERSION.SDK_INT >= 17) {
            g.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), bl2.c.CONNECTING);
        }
        g.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), bl2.c.CONNECTING);
    }

    xs0(Context context, z40 z40, us0 us0, os0 os0) {
        this.f5489a = context;
        this.f5490b = z40;
        this.d = us0;
        this.e = os0;
        this.f5491c = (TelephonyManager) context.getSystemService("phone");
    }

    /* access modifiers changed from: public */
    private final zk2 a(Bundle bundle) {
        zk2.a aVar;
        zk2.b p = zk2.p();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            this.f = wl2.ENUM_TRUE;
        } else {
            this.f = wl2.ENUM_FALSE;
            p.a(i != 0 ? i != 1 ? zk2.c.NETWORKTYPE_UNSPECIFIED : zk2.c.WIFI : zk2.c.CELL);
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    aVar = zk2.a.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    aVar = zk2.a.THREE_G;
                    break;
                case 13:
                    aVar = zk2.a.LTE;
                    break;
                default:
                    aVar = zk2.a.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            p.a(aVar);
        }
        return (zk2) ((rz1) p.e());
    }

    /* access modifiers changed from: public */
    private final byte[] a(boolean z, ArrayList<pk2.a> arrayList, zk2 zk2, bl2.c cVar) {
        bl2.a.C0076a r = bl2.a.r();
        r.a(arrayList);
        boolean z2 = true;
        r.c(b(q.e().b(this.f5489a.getContentResolver()) != 0));
        r.d(q.e().a(this.f5489a, this.f5491c));
        r.b(this.d.b());
        r.c(this.d.d());
        r.a(this.d.a());
        r.a(cVar);
        r.a(zk2);
        r.e(this.f);
        r.a(b(z));
        r.a(q.j().a());
        if (q.e().a(this.f5489a.getContentResolver()) == 0) {
            z2 = false;
        }
        r.b(b(z2));
        return ((bl2.a) ((rz1) r.e())).f();
    }

    public static bl2.c b(Bundle bundle) {
        return g.get(ee1.a(ee1.a(bundle, "device"), "network").getInt("active_network_state", -1), bl2.c.UNSPECIFIED);
    }

    private static wl2 b(boolean z) {
        return z ? wl2.ENUM_TRUE : wl2.ENUM_FALSE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.google.android.gms.internal.ads.pk2.a> c(android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xs0.c(android.os.Bundle):java.util.ArrayList");
    }

    public final void a(boolean z) {
        yn1.a(this.f5490b.a(), new bt0(this, z), jo.f);
    }
}
