package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import b.c.b.a.c.j;
import com.google.android.gms.common.util.c;
import com.google.android.gms.common.util.n;

@TargetApi(17)
public class ql extends ll {
    public ql() {
        super();
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final int a(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "wifi_on", 0);
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final Drawable a(Context context, Bitmap bitmap, boolean z, float f) {
        if (!z || f <= 0.0f || f > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return new BitmapDrawable(context.getResources(), createBitmap);
        } catch (RuntimeException unused) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final String a(Context context) {
        jn a2 = jn.a();
        if (TextUtils.isEmpty(a2.f3251a)) {
            a2.f3251a = (String) (c.a() ? kn.a(context, new mn(a2, context)) : kn.a(context, new ln(a2, j.b(context), context)));
        }
        return a2.f3251a;
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final boolean a(Context context, WebSettings webSettings) {
        super.a(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final int b(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "airplane_mode_on", 0);
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final void b(Context context) {
        jn a2 = jn.a();
        wk.e("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(a2.f3251a)) {
            Context b2 = j.b(context);
            if (c.a() || b2 == null) {
                SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (b2 == null) {
                    putString.apply();
                } else {
                    n.a(context, putString, "admob_user_agent");
                    throw null;
                }
            }
            a2.f3251a = defaultUserAgent;
        }
        wk.e("User agent is updated.");
    }
}
