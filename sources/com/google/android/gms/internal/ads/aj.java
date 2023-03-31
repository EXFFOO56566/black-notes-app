package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.common.util.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* access modifiers changed from: package-private */
@ParametersAreNonnullByDefault
@TargetApi(21)
public final class aj {
    private static final Map<String, String> d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f1766a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f1767b;

    /* renamed from: c  reason: collision with root package name */
    private final mi f1768c;

    static {
        HashMap hashMap = new HashMap();
        if (l.h()) {
            hashMap.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
            hashMap.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
        }
        d = hashMap;
    }

    aj(Context context, List<String> list, mi miVar) {
        this.f1766a = context;
        this.f1767b = list;
        this.f1768c = miVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        r5 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> a(java.lang.String[] r11) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aj.a(java.lang.String[]):java.util.List");
    }
}
