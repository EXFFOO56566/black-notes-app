package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

public final class nu extends MutableContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private Activity f3886a;

    /* renamed from: b  reason: collision with root package name */
    private Context f3887b;

    /* renamed from: c  reason: collision with root package name */
    private Context f3888c;

    public nu(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final Context a() {
        return this.f3888c;
    }

    public final Activity b() {
        return this.f3886a;
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public final Object getSystemService(String str) {
        return this.f3888c.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        this.f3887b = context.getApplicationContext();
        this.f3886a = context instanceof Activity ? (Activity) context : null;
        this.f3888c = context;
        super.setBaseContext(this.f3887b);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.f3886a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f3887b.startActivity(intent);
    }
}
