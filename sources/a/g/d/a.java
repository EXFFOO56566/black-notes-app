package a.g.d;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f100a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static TypedValue f101b;

    public static int a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }

    public static boolean a(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    public static ColorStateList b(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
    }

    public static Drawable c(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            return context.getDrawable(i);
        }
        if (i2 < 16) {
            synchronized (f100a) {
                if (f101b == null) {
                    f101b = new TypedValue();
                }
                context.getResources().getValue(i, f101b, true);
                i = f101b.resourceId;
            }
        }
        return context.getResources().getDrawable(i);
    }
}
