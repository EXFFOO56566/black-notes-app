package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

public final class on {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private final BroadcastReceiver f4017a = new nn(this);
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private final Map<BroadcastReceiver, IntentFilter> f4018b = new WeakHashMap();

    /* renamed from: c  reason: collision with root package name */
    private boolean f4019c = false;
    private boolean d;
    private Context e;

    /* access modifiers changed from: private */
    public final synchronized void a(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<BroadcastReceiver, IntentFilter> entry : this.f4018b.entrySet()) {
            if (entry.getValue().hasAction(intent.getAction())) {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((BroadcastReceiver) obj).onReceive(context, intent);
        }
    }

    public final synchronized void a(Context context) {
        if (!this.f4019c) {
            Context applicationContext = context.getApplicationContext();
            this.e = applicationContext;
            if (applicationContext == null) {
                this.e = context;
            }
            zr2.a(this.e);
            this.d = ((Boolean) on2.e().a(zr2.y1)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.e.registerReceiver(this.f4017a, intentFilter);
            this.f4019c = true;
        }
    }

    public final synchronized void a(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.d) {
            this.f4018b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    public final synchronized void a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.d) {
            this.f4018b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
