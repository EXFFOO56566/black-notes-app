package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private BlockingQueue<o> f2344a = new ArrayBlockingQueue(100);

    /* renamed from: b  reason: collision with root package name */
    private LinkedHashMap<String, String> f2345b = new LinkedHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private Map<String, i> f2346c = new HashMap();
    private String d;
    private Context e;
    private String f;
    private final HashSet<String> g = new HashSet<>(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));
    private AtomicBoolean h;
    private File i;

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087 A[SYNTHETIC, Splitter:B:32:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0092 A[SYNTHETIC, Splitter:B:37:0x0092] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.util.Map<java.lang.String, java.lang.String> r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e.a(java.util.Map, java.lang.String):void");
    }

    public final i a(String str) {
        i iVar = this.f2346c.get(str);
        return iVar != null ? iVar : i.f3001a;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> a(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String str = (String) linkedHashMap.get(key);
            linkedHashMap.put(key, a(key).a(str, entry.getValue()));
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        while (true) {
            try {
                o take = this.f2344a.take();
                String a2 = take.a();
                if (!TextUtils.isEmpty(a2)) {
                    a(a(this.f2345b, take.b()), a2);
                }
            } catch (InterruptedException e2) {
                co.c("CsiReporter:reporter interrupted", e2);
                return;
            }
        }
    }

    public final void a(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.e = context;
        this.f = str;
        this.d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.h = atomicBoolean;
        atomicBoolean.set(m0.f3637c.a().booleanValue());
        if (this.h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f2345b.put(entry.getKey(), entry.getValue());
        }
        jo.f3256a.execute(new h(this));
        this.f2346c.put("action", i.f3002b);
        this.f2346c.put("ad_format", i.f3002b);
        this.f2346c.put("e", i.f3003c);
    }

    public final boolean a(o oVar) {
        return this.f2344a.offer(oVar);
    }

    public final void b(String str) {
        if (!this.g.contains(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sdkVersion", this.f);
            linkedHashMap.put("ue", str);
            a(a(this.f2345b, linkedHashMap), BuildConfig.FLAVOR);
        }
    }
}
