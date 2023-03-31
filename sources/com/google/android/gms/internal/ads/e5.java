package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.q;
import java.util.HashMap;
import java.util.Map;

final class e5 implements d5<ws> {
    e5() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.d5
    public final /* synthetic */ void a(ws wsVar, Map map) {
        ws wsVar2 = wsVar;
        q.c();
        DisplayMetrics a2 = gl.a((WindowManager) wsVar2.getContext().getSystemService("window"));
        int i = a2.widthPixels;
        int i2 = a2.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) wsVar2).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        wsVar2.a("locationReady", hashMap);
        co.d("GET LOCATION COMPILED");
    }
}
