package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.fo;
import com.google.android.gms.internal.ads.jk;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private Context f1396a;

    /* renamed from: b  reason: collision with root package name */
    private long f1397b = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r11.b() != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(android.content.Context r8, com.google.android.gms.internal.ads.fo r9, boolean r10, com.google.android.gms.internal.ads.jk r11, java.lang.String r12, java.lang.String r13, java.lang.Runnable r14) {
        /*
        // Method dump skipped, instructions count: 215
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.d.a(android.content.Context, com.google.android.gms.internal.ads.fo, boolean, com.google.android.gms.internal.ads.jk, java.lang.String, java.lang.String, java.lang.Runnable):void");
    }

    public final void a(Context context, fo foVar, String str, jk jkVar) {
        a(context, foVar, false, jkVar, jkVar != null ? jkVar.d() : null, str, null);
    }

    public final void a(Context context, fo foVar, String str, Runnable runnable) {
        a(context, foVar, true, null, str, null, runnable);
    }
}
