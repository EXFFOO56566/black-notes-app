package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

public final class bo {
    public static Context a(Context context) {
        return b(context).a();
    }

    public static <T> T a(Context context, String str, eo<IBinder, T> eoVar) {
        try {
            return eoVar.a(b(context).a(str));
        } catch (Exception e) {
            throw new Cdo(e);
        }
    }

    private static DynamiteModule b(Context context) {
        try {
            return DynamiteModule.a(context, DynamiteModule.i, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new Cdo(e);
        }
    }
}
