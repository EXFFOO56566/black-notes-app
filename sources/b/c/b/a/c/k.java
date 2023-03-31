package b.c.b.a.c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.r;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
public class k {

    /* renamed from: b  reason: collision with root package name */
    private static k f1168b;

    /* renamed from: a  reason: collision with root package name */
    private final Context f1169a;

    private k(Context context) {
        this.f1169a = context.getApplicationContext();
    }

    public static k a(Context context) {
        r.a(context);
        synchronized (k.class) {
            if (f1168b == null) {
                t.a(context);
                f1168b = new k(context);
            }
        }
        return f1168b;
    }

    private static u a(PackageInfo packageInfo, u... uVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        w wVar = new w(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < uVarArr.length; i++) {
            if (uVarArr[i].equals(wVar)) {
                return uVarArr[i];
            }
        }
        return null;
    }

    public static boolean a(PackageInfo packageInfo, boolean z) {
        u uVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                uVar = a(packageInfo, y.f1184a);
            } else {
                uVar = a(packageInfo, y.f1184a[0]);
            }
            if (uVar != null) {
                return true;
            }
        }
        return false;
    }

    public boolean a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (a(packageInfo, false)) {
            return true;
        }
        if (a(packageInfo, true)) {
            if (j.d(this.f1169a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }
}
