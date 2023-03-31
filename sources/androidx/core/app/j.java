package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.h;
import java.lang.reflect.Field;
import java.util.List;

/* access modifiers changed from: package-private */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f789a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static Field f790b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f791c;

    public static Bundle a(Notification.Builder builder, h.a aVar) {
        builder.addAction(aVar.e(), aVar.i(), aVar.a());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", a(aVar.f()));
        }
        if (aVar.c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", a(aVar.c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        return bundle;
    }

    public static Bundle a(Notification notification) {
        String str;
        String str2;
        synchronized (f789a) {
            if (f791c) {
                return null;
            }
            try {
                if (f790b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f791c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f790b = declaredField;
                }
                Bundle bundle = (Bundle) f790b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f790b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                e = e;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f791c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                e = e2;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f791c = true;
                return null;
            }
        }
    }

    static Bundle a(h.a aVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("icon", aVar.e());
        bundle.putCharSequence("title", aVar.i());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", a(aVar.f()));
        bundle.putBoolean("showsUserInterface", aVar.h());
        bundle.putInt("semanticAction", aVar.g());
        return bundle;
    }

    private static Bundle a(k kVar) {
        new Bundle();
        kVar.a();
        throw null;
    }

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    private static Bundle[] a(k[] kVarArr) {
        if (kVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[kVarArr.length];
        if (kVarArr.length <= 0) {
            return bundleArr;
        }
        a(kVarArr[0]);
        throw null;
    }
}
