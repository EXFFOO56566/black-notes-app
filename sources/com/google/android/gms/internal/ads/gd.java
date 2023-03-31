package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.u.a;
import java.util.Map;

public final class gd extends wd {

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f2737c;
    private final Context d;
    private String e = d("description");
    private long f = e("start_ticks");
    private long g = e("end_ticks");
    private String h = d("summary");
    private String i = d("location");

    public gd(ws wsVar, Map<String, String> map) {
        super(wsVar, "createCalendarEvent");
        this.f2737c = map;
        this.d = wsVar.a();
    }

    private final String d(String str) {
        return TextUtils.isEmpty(this.f2737c.get(str)) ? BuildConfig.FLAVOR : this.f2737c.get(str);
    }

    private final long e(String str) {
        String str2 = this.f2737c.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(14)
    public final Intent a() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.e);
        data.putExtra("eventLocation", this.i);
        data.putExtra("description", this.h);
        long j = this.f;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.g;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void b() {
        if (this.d == null) {
            a("Activity context is not available.");
            return;
        }
        q.c();
        if (!gl.e(this.d).d()) {
            a("This feature is not available on the device.");
            return;
        }
        q.c();
        AlertDialog.Builder d2 = gl.d(this.d);
        Resources b2 = q.g().b();
        d2.setTitle(b2 != null ? b2.getString(a.s5) : "Create calendar event");
        d2.setMessage(b2 != null ? b2.getString(a.s6) : "Allow Ad to create a calendar event?");
        d2.setPositiveButton(b2 != null ? b2.getString(a.s3) : "Accept", new jd(this));
        d2.setNegativeButton(b2 != null ? b2.getString(a.s4) : "Decline", new id(this));
        d2.create().show();
    }
}
