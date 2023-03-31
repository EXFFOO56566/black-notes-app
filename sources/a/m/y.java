package a.m;

import android.animation.LayoutTransition;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public class y {

    /* renamed from: a  reason: collision with root package name */
    private static LayoutTransition f369a;

    /* renamed from: b  reason: collision with root package name */
    private static Field f370b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f371c;
    private static Method d;
    private static boolean e;

    /* access modifiers changed from: package-private */
    public static class a extends LayoutTransition {
        a() {
        }

        public boolean isChangingLayout() {
            return true;
        }
    }

    private static void a(LayoutTransition layoutTransition) {
        if (!e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            e = true;
        }
        Method method = d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(android.view.ViewGroup r5, boolean r6) {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m.y.a(android.view.ViewGroup, boolean):void");
    }
}
