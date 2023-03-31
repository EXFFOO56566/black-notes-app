package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

public class h {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f777a;

        /* renamed from: b  reason: collision with root package name */
        private final k[] f778b;

        /* renamed from: c  reason: collision with root package name */
        private final k[] f779c;
        private boolean d;
        boolean e;
        private final int f;
        public int g;
        public CharSequence h;
        public PendingIntent i;

        public a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true);
        }

        a(int i2, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, k[] kVarArr, k[] kVarArr2, boolean z, int i3, boolean z2) {
            this.e = true;
            this.g = i2;
            this.h = c.d(charSequence);
            this.i = pendingIntent;
            this.f777a = bundle == null ? new Bundle() : bundle;
            this.f778b = kVarArr;
            this.f779c = kVarArr2;
            this.d = z;
            this.f = i3;
            this.e = z2;
        }

        public PendingIntent a() {
            return this.i;
        }

        public boolean b() {
            return this.d;
        }

        public k[] c() {
            return this.f779c;
        }

        public Bundle d() {
            return this.f777a;
        }

        public int e() {
            return this.g;
        }

        public k[] f() {
            return this.f778b;
        }

        public int g() {
            return this.f;
        }

        public boolean h() {
            return this.e;
        }

        public CharSequence i() {
            return this.h;
        }
    }

    public static class b extends d {
        private CharSequence e;

        public b a(CharSequence charSequence) {
            this.e = c.d(charSequence);
            return this;
        }

        @Override // androidx.core.app.h.d
        public void a(g gVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(gVar.a()).setBigContentTitle(this.f784b).bigText(this.e);
                if (this.d) {
                    bigText.setSummaryText(this.f785c);
                }
            }
        }
    }

    public static class c {
        String A;
        Bundle B;
        int C;
        int D;
        Notification E;
        RemoteViews F;
        RemoteViews G;
        RemoteViews H;
        String I;
        int J;
        String K;
        long L;
        int M;
        Notification N;
        @Deprecated
        public ArrayList<String> O;

        /* renamed from: a  reason: collision with root package name */
        public Context f780a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f781b;

        /* renamed from: c  reason: collision with root package name */
        ArrayList<a> f782c;
        CharSequence d;
        CharSequence e;
        PendingIntent f;
        PendingIntent g;
        RemoteViews h;
        Bitmap i;
        CharSequence j;
        int k;
        int l;
        boolean m;
        boolean n;
        d o;
        CharSequence p;
        CharSequence[] q;
        int r;
        int s;
        boolean t;
        String u;
        boolean v;
        String w;
        boolean x;
        boolean y;
        boolean z;

        @Deprecated
        public c(Context context) {
            this(context, null);
        }

        public c(Context context, String str) {
            this.f781b = new ArrayList<>();
            this.f782c = new ArrayList<>();
            this.m = true;
            this.x = false;
            this.C = 0;
            this.D = 0;
            this.J = 0;
            this.M = 0;
            Notification notification = new Notification();
            this.N = notification;
            this.f780a = context;
            this.I = str;
            notification.when = System.currentTimeMillis();
            this.N.audioStreamType = -1;
            this.l = 0;
            this.O = new ArrayList<>();
        }

        private void a(int i2, boolean z2) {
            Notification notification;
            int i3;
            if (z2) {
                notification = this.N;
                i3 = i2 | notification.flags;
            } else {
                notification = this.N;
                i3 = (~i2) & notification.flags;
            }
            notification.flags = i3;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public Notification a() {
            return new i(this).b();
        }

        public c a(int i2) {
            this.l = i2;
            return this;
        }

        public c a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f781b.add(new a(i2, charSequence, pendingIntent));
            return this;
        }

        public c a(long j2) {
            this.N.when = j2;
            return this;
        }

        public c a(PendingIntent pendingIntent) {
            this.f = pendingIntent;
            return this;
        }

        public c a(d dVar) {
            if (this.o != dVar) {
                this.o = dVar;
                if (dVar != null) {
                    dVar.a(this);
                }
            }
            return this;
        }

        public c a(CharSequence charSequence) {
            this.e = d(charSequence);
            return this;
        }

        public c a(String str) {
            this.I = str;
            return this;
        }

        public c a(boolean z2) {
            a(16, z2);
            return this;
        }

        public Bundle b() {
            if (this.B == null) {
                this.B = new Bundle();
            }
            return this.B;
        }

        public c b(int i2) {
            this.N.icon = i2;
            return this;
        }

        public c b(CharSequence charSequence) {
            this.d = d(charSequence);
            return this;
        }

        public c b(boolean z2) {
            this.x = z2;
            return this;
        }

        public c c(CharSequence charSequence) {
            this.N.tickerText = d(charSequence);
            return this;
        }
    }

    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        protected c f783a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f784b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f785c;
        boolean d = false;

        public void a(Bundle bundle) {
        }

        public abstract void a(g gVar);

        public void a(c cVar) {
            if (this.f783a != cVar) {
                this.f783a = cVar;
                if (cVar != null) {
                    cVar.a(this);
                }
            }
        }

        public RemoteViews b(g gVar) {
            return null;
        }

        public RemoteViews c(g gVar) {
            return null;
        }

        public RemoteViews d(g gVar) {
            return null;
        }
    }

    public static Bundle a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return j.a(notification);
        }
        return null;
    }
}
