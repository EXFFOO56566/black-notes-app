package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class eo0 {

    /* renamed from: a  reason: collision with root package name */
    private List<Map<String, String>> f2458a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private boolean f2459b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2460c = false;
    private String d;
    private zn0 e;

    public eo0(String str, zn0 zn0) {
        this.d = str;
        this.e = zn0;
    }

    private final Map<String, String> c() {
        Map<String, String> a2 = this.e.a();
        a2.put("tms", Long.toString(q.j().b(), 10));
        a2.put("tid", this.d);
        return a2;
    }

    public final synchronized void a() {
        if (((Boolean) on2.e().a(zr2.Q0)).booleanValue()) {
            if (!this.f2459b) {
                Map<String, String> c2 = c();
                c2.put("action", "init_started");
                this.f2458a.add(c2);
                this.f2459b = true;
            }
        }
    }

    public final synchronized void a(String str) {
        if (((Boolean) on2.e().a(zr2.Q0)).booleanValue()) {
            Map<String, String> c2 = c();
            c2.put("action", "adapter_init_started");
            c2.put("ancn", str);
            this.f2458a.add(c2);
        }
    }

    public final synchronized void a(String str, String str2) {
        if (((Boolean) on2.e().a(zr2.Q0)).booleanValue()) {
            Map<String, String> c2 = c();
            c2.put("action", "adapter_init_finished");
            c2.put("ancn", str);
            c2.put("rqe", str2);
            this.f2458a.add(c2);
        }
    }

    public final synchronized void b() {
        if (((Boolean) on2.e().a(zr2.Q0)).booleanValue()) {
            if (!this.f2460c) {
                Map<String, String> c2 = c();
                c2.put("action", "init_finished");
                this.f2458a.add(c2);
                for (Map<String, String> map : this.f2458a) {
                    this.e.a(map);
                }
                this.f2460c = true;
            }
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) on2.e().a(zr2.Q0)).booleanValue()) {
            Map<String, String> c2 = c();
            c2.put("action", "adapter_init_finished");
            c2.put("ancn", str);
            this.f2458a.add(c2);
        }
    }
}
