package androidx.appcompat.app;

import a.g.d.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* access modifiers changed from: package-private */
public class j {
    private static j d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f485a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f486b;

    /* renamed from: c  reason: collision with root package name */
    private final a f487c = new a();

    /* access modifiers changed from: private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f488a;

        /* renamed from: b  reason: collision with root package name */
        long f489b;

        /* renamed from: c  reason: collision with root package name */
        long f490c;
        long d;
        long e;
        long f;

        a() {
        }
    }

    j(Context context, LocationManager locationManager) {
        this.f485a = context;
        this.f486b = locationManager;
    }

    private Location a(String str) {
        try {
            if (this.f486b.isProviderEnabled(str)) {
                return this.f486b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    static j a(Context context) {
        if (d == null) {
            Context applicationContext = context.getApplicationContext();
            d = new j(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return d;
    }

    private void a(Location location) {
        long j;
        a aVar = this.f487c;
        long currentTimeMillis = System.currentTimeMillis();
        i a2 = i.a();
        a2.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a2.f482a;
        a2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a2.f484c == 1;
        long j3 = a2.f483b;
        long j4 = a2.f482a;
        a2.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = a2.f483b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar.f488a = z;
        aVar.f489b = j2;
        aVar.f490c = j3;
        aVar.d = j4;
        aVar.e = j5;
        aVar.f = j;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location = null;
        Location a2 = b.a(this.f485a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? a("network") : null;
        if (b.a(this.f485a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = a("gps");
        }
        return (location == null || a2 == null) ? location != null ? location : a2 : location.getTime() > a2.getTime() ? location : a2;
    }

    private boolean c() {
        return this.f487c.f > System.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        a aVar = this.f487c;
        if (c()) {
            return aVar.f488a;
        }
        Location b2 = b();
        if (b2 != null) {
            a(b2);
            return aVar.f488a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
