package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import b.c.b.a.c.l;
import javax.annotation.Nullable;

public class v {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f1650a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1651b;

    public v(Context context) {
        r.a(context);
        Resources resources = context.getResources();
        this.f1650a = resources;
        this.f1651b = resources.getResourcePackageName(l.common_google_play_services_unknown_issue);
    }

    @Nullable
    public String a(String str) {
        int identifier = this.f1650a.getIdentifier(str, "string", this.f1651b);
        if (identifier == 0) {
            return null;
        }
        return this.f1650a.getString(identifier);
    }
}
