package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import b.c.b.a.c.l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.o0;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.v;
import javax.annotation.concurrent.GuardedBy;

@Deprecated
public final class g {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1571c = new Object();
    @GuardedBy("sLock")
    private static g d;

    /* renamed from: a  reason: collision with root package name */
    private final String f1572a;

    /* renamed from: b  reason: collision with root package name */
    private final Status f1573b;

    g(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(l.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            resources.getInteger(identifier);
        }
        String a2 = o0.a(context);
        a2 = a2 == null ? new v(context).a("google_app_id") : a2;
        if (TextUtils.isEmpty(a2)) {
            this.f1573b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f1572a = null;
            return;
        }
        this.f1572a = a2;
        this.f1573b = Status.f;
    }

    public static Status a(Context context) {
        Status status;
        r.a(context, "Context must not be null.");
        synchronized (f1571c) {
            if (d == null) {
                d = new g(context);
            }
            status = d.f1573b;
        }
        return status;
    }

    private static g a(String str) {
        g gVar;
        synchronized (f1571c) {
            if (d != null) {
                gVar = d;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return gVar;
    }

    public static String a() {
        return a("getGoogleAppId").f1572a;
    }
}
