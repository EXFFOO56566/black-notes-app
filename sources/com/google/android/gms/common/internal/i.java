package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public abstract class i {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f1626b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static i f1627c;

    /* access modifiers changed from: protected */
    public static final class a {
        private static final Uri f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

        /* renamed from: a  reason: collision with root package name */
        private final String f1628a;

        /* renamed from: b  reason: collision with root package name */
        private final String f1629b;

        /* renamed from: c  reason: collision with root package name */
        private final ComponentName f1630c = null;
        private final int d;
        private final boolean e;

        public a(String str, String str2, int i, boolean z) {
            r.b(str);
            this.f1628a = str;
            r.b(str2);
            this.f1629b = str2;
            this.d = i;
            this.e = z;
        }

        public final ComponentName a() {
            return this.f1630c;
        }

        public final Intent a(Context context) {
            if (this.f1628a == null) {
                return new Intent().setComponent(this.f1630c);
            }
            Intent intent = null;
            if (this.e) {
                Bundle bundle = new Bundle();
                bundle.putString("serviceActionBundleKey", this.f1628a);
                Bundle call = context.getContentResolver().call(f, "serviceIntentCall", (String) null, bundle);
                if (call != null) {
                    intent = (Intent) call.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    String valueOf = String.valueOf(this.f1628a);
                    Log.w("ConnectionStatusConfig", valueOf.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(valueOf) : new String("Dynamic lookup for intent failed for action: "));
                }
            }
            return intent == null ? new Intent(this.f1628a).setPackage(this.f1629b) : intent;
        }

        public final String b() {
            return this.f1629b;
        }

        public final int c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p.a(this.f1628a, aVar.f1628a) && p.a(this.f1629b, aVar.f1629b) && p.a(this.f1630c, aVar.f1630c) && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return p.a(this.f1628a, this.f1629b, this.f1630c, Integer.valueOf(this.d), Boolean.valueOf(this.e));
        }

        public final String toString() {
            String str = this.f1628a;
            return str == null ? this.f1630c.flattenToString() : str;
        }
    }

    public static i a(Context context) {
        synchronized (f1626b) {
            if (f1627c == null) {
                f1627c = new i0(context.getApplicationContext());
            }
        }
        return f1627c;
    }

    public final void a(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        b(new a(str, str2, i, z), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(a aVar, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    public abstract void b(a aVar, ServiceConnection serviceConnection, String str);
}
