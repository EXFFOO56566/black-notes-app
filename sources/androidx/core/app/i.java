package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
public class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Notification.Builder f786a;

    /* renamed from: b  reason: collision with root package name */
    private final h.c f787b;

    /* renamed from: c  reason: collision with root package name */
    private RemoteViews f788c;
    private RemoteViews d;
    private final List<Bundle> e = new ArrayList();
    private final Bundle f = new Bundle();
    private int g;
    private RemoteViews h;

    i(h.c cVar) {
        ArrayList<String> arrayList;
        String str;
        Bundle bundle;
        this.f787b = cVar;
        this.f786a = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(cVar.f780a, cVar.I) : new Notification.Builder(cVar.f780a);
        Notification notification = cVar.N;
        this.f786a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, cVar.h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(cVar.d).setContentText(cVar.e).setContentInfo(cVar.j).setContentIntent(cVar.f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(cVar.g, (notification.flags & 128) != 0).setLargeIcon(cVar.i).setNumber(cVar.k).setProgress(cVar.r, cVar.s, cVar.t);
        if (Build.VERSION.SDK_INT < 21) {
            this.f786a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f786a.setSubText(cVar.p).setUsesChronometer(cVar.n).setPriority(cVar.l);
            Iterator<h.a> it = cVar.f781b.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            Bundle bundle2 = cVar.B;
            if (bundle2 != null) {
                this.f.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (cVar.x) {
                    this.f.putBoolean("android.support.localOnly", true);
                }
                String str2 = cVar.u;
                if (str2 != null) {
                    this.f.putString("android.support.groupKey", str2);
                    if (cVar.v) {
                        bundle = this.f;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = cVar.w;
                if (str3 != null) {
                    this.f.putString("android.support.sortKey", str3);
                }
            }
            this.f788c = cVar.F;
            this.d = cVar.G;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f786a.setShowWhen(cVar.m);
            if (Build.VERSION.SDK_INT < 21 && (arrayList = cVar.O) != null && !arrayList.isEmpty()) {
                Bundle bundle3 = this.f;
                ArrayList<String> arrayList2 = cVar.O;
                bundle3.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f786a.setLocalOnly(cVar.x).setGroup(cVar.u).setGroupSummary(cVar.v).setSortKey(cVar.w);
            this.g = cVar.M;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f786a.setCategory(cVar.A).setColor(cVar.C).setVisibility(cVar.D).setPublicVersion(cVar.E).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = cVar.O.iterator();
            while (it2.hasNext()) {
                this.f786a.addPerson(it2.next());
            }
            this.h = cVar.H;
            if (cVar.f782c.size() > 0) {
                Bundle bundle4 = cVar.b().getBundle("android.car.EXTENSIONS");
                bundle4 = bundle4 == null ? new Bundle() : bundle4;
                Bundle bundle5 = new Bundle();
                for (int i = 0; i < cVar.f782c.size(); i++) {
                    bundle5.putBundle(Integer.toString(i), j.a(cVar.f782c.get(i)));
                }
                bundle4.putBundle("invisible_actions", bundle5);
                cVar.b().putBundle("android.car.EXTENSIONS", bundle4);
                this.f.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f786a.setExtras(cVar.B).setRemoteInputHistory(cVar.q);
            RemoteViews remoteViews = cVar.F;
            if (remoteViews != null) {
                this.f786a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = cVar.G;
            if (remoteViews2 != null) {
                this.f786a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = cVar.H;
            if (remoteViews3 != null) {
                this.f786a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f786a.setBadgeIconType(cVar.J).setShortcutId(cVar.K).setTimeoutAfter(cVar.L).setGroupAlertBehavior(cVar.M);
            if (cVar.z) {
                this.f786a.setColorized(cVar.y);
            }
            if (!TextUtils.isEmpty(cVar.I)) {
                this.f786a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
    }

    private void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & -2;
        notification.defaults = i;
        notification.defaults = i & -3;
    }

    private void a(h.a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            Notification.Action.Builder builder = new Notification.Action.Builder(aVar.e(), aVar.i(), aVar.a());
            if (aVar.f() != null) {
                for (RemoteInput remoteInput : k.a(aVar.f())) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            Bundle bundle = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.g());
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.g());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.h());
            builder.addExtras(bundle);
            this.f786a.addAction(builder.build());
        } else if (i >= 16) {
            this.e.add(j.a(this.f786a, aVar));
        }
    }

    @Override // androidx.core.app.g
    public Notification.Builder a() {
        return this.f786a;
    }

    public Notification b() {
        Bundle a2;
        RemoteViews d2;
        RemoteViews b2;
        h.d dVar = this.f787b.o;
        if (dVar != null) {
            dVar.a(this);
        }
        RemoteViews c2 = dVar != null ? dVar.c(this) : null;
        Notification c3 = c();
        if (!(c2 == null && (c2 = this.f787b.F) == null)) {
            c3.contentView = c2;
        }
        if (!(Build.VERSION.SDK_INT < 16 || dVar == null || (b2 = dVar.b(this)) == null)) {
            c3.bigContentView = b2;
        }
        if (!(Build.VERSION.SDK_INT < 21 || dVar == null || (d2 = this.f787b.o.d(this)) == null)) {
            c3.headsUpContentView = d2;
        }
        if (!(Build.VERSION.SDK_INT < 16 || dVar == null || (a2 = h.a(c3)) == null)) {
            dVar.a(a2);
        }
        return c3;
    }

    /* access modifiers changed from: protected */
    public Notification c() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f786a.build();
        }
        if (i >= 24) {
            Notification build = this.f786a.build();
            if (this.g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.g != 2)) {
                    a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.g == 1) {
                    a(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f786a.setExtras(this.f);
            Notification build2 = this.f786a.build();
            RemoteViews remoteViews = this.f788c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.g != 2)) {
                    a(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.g == 1) {
                    a(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f786a.setExtras(this.f);
            Notification build3 = this.f786a.build();
            RemoteViews remoteViews4 = this.f788c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.g != 2)) {
                    a(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.g == 1) {
                    a(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> a2 = j.a(this.e);
            if (a2 != null) {
                this.f.putSparseParcelableArray("android.support.actionExtras", a2);
            }
            this.f786a.setExtras(this.f);
            Notification build4 = this.f786a.build();
            RemoteViews remoteViews6 = this.f788c;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.d;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.f786a.getNotification();
        } else {
            Notification build5 = this.f786a.build();
            Bundle a3 = h.a(build5);
            Bundle bundle = new Bundle(this.f);
            for (String str : this.f.keySet()) {
                if (a3.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a3.putAll(bundle);
            SparseArray<Bundle> a4 = j.a(this.e);
            if (a4 != null) {
                h.a(build5).putSparseParcelableArray("android.support.actionExtras", a4);
            }
            RemoteViews remoteViews8 = this.f788c;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.d;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }
}
