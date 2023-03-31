package b.c.b.a.c.q;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.l;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1177a;

    public b(Context context) {
        this.f1177a = context;
    }

    public int a(String str) {
        return this.f1177a.checkCallingOrSelfPermission(str);
    }

    public int a(String str, String str2) {
        return this.f1177a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo a(String str, int i) {
        return this.f1177a.getPackageManager().getApplicationInfo(str, i);
    }

    public boolean a() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.f1177a);
        }
        if (!l.k() || (nameForUid = this.f1177a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f1177a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    public final boolean a(int i, String str) {
        if (l.f()) {
            try {
                ((AppOpsManager) this.f1177a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f1177a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String str2 : packagesForUid) {
                    if (str.equals(str2)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public PackageInfo b(String str, int i) {
        return this.f1177a.getPackageManager().getPackageInfo(str, i);
    }

    public CharSequence b(String str) {
        return this.f1177a.getPackageManager().getApplicationLabel(this.f1177a.getPackageManager().getApplicationInfo(str, 0));
    }
}
