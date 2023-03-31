package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.du;
import com.google.android.gms.internal.ads.eu;
import com.google.android.gms.internal.ads.gu;
import com.google.android.gms.internal.ads.wt;
import com.google.android.gms.internal.ads.zt;
import java.net.URISyntaxException;
import java.util.Map;

public final class h5<T extends wt & zt & du & eu & gu> implements d5<T> {

    /* renamed from: a  reason: collision with root package name */
    private final c f2860a;

    /* renamed from: b  reason: collision with root package name */
    private final ld f2861b;

    public h5(c cVar, ld ldVar) {
        this.f2860a = cVar;
        this.f2861b = ldVar;
    }

    static Uri a(Context context, eq1 eq1, Uri uri, View view, Activity activity) {
        if (eq1 == null) {
            return uri;
        }
        try {
            return eq1.b(uri) ? eq1.a(uri, context, view, activity) : uri;
        } catch (ht1 unused) {
            return uri;
        } catch (Exception e) {
            q.g().a(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri a(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            String valueOf = String.valueOf(uri.toString());
            co.b(valueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(valueOf) : new String("Error adding click uptime parameter to url: "), e);
        }
        return uri;
    }

    private final void a(boolean z) {
        ld ldVar = this.f2861b;
        if (ldVar != null) {
            ldVar.a(z);
        }
    }

    private static boolean a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int b(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            q.e();
            return 7;
        } else if ("l".equalsIgnoreCase(str)) {
            q.e();
            return 6;
        } else if ("c".equalsIgnoreCase(str)) {
            return q.e().a();
        } else {
            return -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.d5
    public final /* synthetic */ void a(Object obj, Map map) {
        wt wtVar = (wt) obj;
        String a2 = sj.a((String) map.get("u"), wtVar.getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            co.d("Action missing from an open GMSG.");
            return;
        }
        c cVar = this.f2860a;
        if (cVar != null && !cVar.b()) {
            this.f2860a.a(a2);
        } else if ("expand".equalsIgnoreCase(str)) {
            if (((zt) wtVar).h()) {
                co.d("Cannot expand WebView that is already expanded.");
                return;
            }
            a(false);
            ((du) wtVar).a(a(map), b(map));
        } else if ("webapp".equalsIgnoreCase(str)) {
            a(false);
            du duVar = (du) wtVar;
            if (a2 != null) {
                duVar.a(a(map), b(map), a2);
            } else {
                duVar.a(a(map), b(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else if (!"app".equalsIgnoreCase(str) || !"true".equalsIgnoreCase((String) map.get("system_browser"))) {
            a(true);
            String str2 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    intent = Intent.parseUri(str2, 0);
                } catch (URISyntaxException e) {
                    String valueOf = String.valueOf(str2);
                    co.b(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e);
                }
            }
            if (!(intent == null || intent.getData() == null)) {
                Uri data = intent.getData();
                if (!Uri.EMPTY.equals(data)) {
                    intent.setData(a(a(wtVar.getContext(), ((eu) wtVar).d(), data, ((gu) wtVar).getView(), wtVar.a())));
                }
            }
            if (intent != null) {
                ((du) wtVar).a(new d(intent));
                return;
            }
            if (!TextUtils.isEmpty(a2)) {
                a2 = a(a(wtVar.getContext(), ((eu) wtVar).d(), Uri.parse(a2), ((gu) wtVar).getView(), wtVar.a())).toString();
            }
            ((du) wtVar).a(new d((String) map.get("i"), a2, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
        } else {
            a(true);
            if (TextUtils.isEmpty(a2)) {
                co.d("Destination url cannot be empty.");
                return;
            }
            try {
                ((du) wtVar).a(new d(new k5(wtVar.getContext(), ((eu) wtVar).d(), ((gu) wtVar).getView()).a(map)));
            } catch (ActivityNotFoundException e2) {
                co.d(e2.getMessage());
            }
        }
    }
}
