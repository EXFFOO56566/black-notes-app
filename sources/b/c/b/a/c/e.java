package b.c.b.a.c;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.h;
import b.c.b.a.b.b;
import b.c.b.a.e.d.d;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.l;

public class e extends f {
    private static final Object d = new Object();
    private static final e e = new e();

    /* renamed from: c  reason: collision with root package name */
    private String f1160c;

    /* access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    public class a extends d {

        /* renamed from: a  reason: collision with root package name */
        private final Context f1161a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f1161a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int b2 = e.this.b(this.f1161a);
            if (e.this.b(b2)) {
                e.this.b(this.f1161a, b2);
            }
        }
    }

    static Dialog a(Context context, int i, f fVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.e.b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String a2 = com.google.android.gms.common.internal.e.a(context, i);
        if (a2 != null) {
            builder.setPositiveButton(a2, fVar);
        }
        String e2 = com.google.android.gms.common.internal.e.e(context, i);
        if (e2 != null) {
            builder.setTitle(e2);
        }
        return builder.create();
    }

    public static e a() {
        return e;
    }

    static void a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof androidx.fragment.app.d) {
            m.a(dialog, onCancelListener).a(((androidx.fragment.app.d) activity).g(), str);
            return;
        }
        c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    private final void a(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            c(context);
        } else if (pendingIntent != null) {
            String d2 = com.google.android.gms.common.internal.e.d(context, i);
            String c2 = com.google.android.gms.common.internal.e.c(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            h.c cVar = new h.c(context);
            cVar.b(true);
            cVar.a(true);
            cVar.b(d2);
            h.b bVar = new h.b();
            bVar.a(c2);
            cVar.a(bVar);
            if (com.google.android.gms.common.util.h.c(context)) {
                r.b(l.g());
                cVar.b(context.getApplicationInfo().icon);
                cVar.a(2);
                if (com.google.android.gms.common.util.h.d(context)) {
                    cVar.a(b.c.b.a.b.a.common_full_open_on_phone, resources.getString(b.common_open_on_phone), pendingIntent);
                } else {
                    cVar.a(pendingIntent);
                }
            } else {
                cVar.b(17301642);
                cVar.c(resources.getString(b.common_google_play_services_notification_ticker));
                cVar.a(System.currentTimeMillis());
                cVar.a(pendingIntent);
                cVar.a((CharSequence) c2);
            }
            if (l.k()) {
                r.b(l.k());
                String b2 = b();
                if (b2 == null) {
                    b2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(b2);
                    String b3 = com.google.android.gms.common.internal.e.b(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel(b2, b3, 4);
                    } else if (!b3.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b3);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                cVar.a(b2);
            }
            Notification a2 = cVar.a();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                j.d.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, a2);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    private final String b() {
        String str;
        synchronized (d) {
            str = this.f1160c;
        }
        return str;
    }

    @Override // b.c.b.a.c.f
    public int a(Context context, int i) {
        return super.a(context, i);
    }

    public Dialog a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return a(activity, i, f.a(activity, a(activity, i, "d"), i2), onCancelListener);
    }

    @Override // b.c.b.a.c.f
    public PendingIntent a(Context context, int i, int i2) {
        return super.a(context, i, i2);
    }

    public PendingIntent a(Context context, b bVar) {
        return bVar.i() ? bVar.g() : a(context, bVar.d(), 0);
    }

    @Override // b.c.b.a.c.f
    public Intent a(Context context, int i, String str) {
        return super.a(context, i, str);
    }

    @Override // b.c.b.a.c.f
    public final String a(int i) {
        return super.a(i);
    }

    public final boolean a(Context context, b bVar, int i) {
        PendingIntent a2 = a(context, bVar);
        if (a2 == null) {
            return false;
        }
        a(context, bVar.d(), (String) null, GoogleApiActivity.a(context, a2, i));
        return true;
    }

    @Override // b.c.b.a.c.f
    public int b(Context context) {
        return super.b(context);
    }

    public void b(Context context, int i) {
        a(context, i, (String) null, a(context, i, 0, "n"));
    }

    @Override // b.c.b.a.c.f
    public final boolean b(int i) {
        return super.b(i);
    }

    public boolean b(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a2 = a(activity, i, i2, onCancelListener);
        if (a2 == null) {
            return false;
        }
        a(activity, a2, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void c(Context context) {
        new a(context).sendEmptyMessageDelayed(1, 120000);
    }
}
