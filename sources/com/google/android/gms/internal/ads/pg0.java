package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class pg0 {

    /* renamed from: a  reason: collision with root package name */
    private final pk0 f4168a;

    /* renamed from: b  reason: collision with root package name */
    private final jj0 f4169b;

    /* renamed from: c  reason: collision with root package name */
    private final nz f4170c;
    private final sf0 d;

    public pg0(pk0 pk0, jj0 jj0, nz nzVar, sf0 sf0) {
        this.f4168a = pk0;
        this.f4169b = jj0;
        this.f4170c = nzVar;
        this.d = sf0;
    }

    public final View a() {
        ws a2 = this.f4168a.a(um2.e(), false);
        a2.getView().setVisibility(8);
        a2.b("/sendMessageToSdk", new og0(this));
        a2.b("/adMuted", new rg0(this));
        this.f4169b.a(new WeakReference(a2), "/loadHtml", new qg0(this));
        this.f4169b.a(new WeakReference(a2), "/showOverlay", new tg0(this));
        this.f4169b.a(new WeakReference(a2), "/hideOverlay", new sg0(this));
        return a2.getView();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(ws wsVar, Map map) {
        co.c("Hiding native ads overlay.");
        wsVar.getView().setVisibility(8);
        this.f4170c.a(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f4169b.a("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(ws wsVar, Map map) {
        co.c("Showing native ads overlay.");
        wsVar.getView().setVisibility(0);
        this.f4170c.a(true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(ws wsVar, Map map) {
        this.d.c();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(ws wsVar, Map map) {
        this.f4169b.a("sendMessageToNativeJs", map);
    }
}
