package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.w.a;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class yp2 {

    /* renamed from: a  reason: collision with root package name */
    private final HashSet<String> f5629a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f5630b = new Bundle();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<Class<? extends Object>, Object> f5631c = new HashMap<>();
    private final HashSet<String> d = new HashSet<>();
    private final Bundle e = new Bundle();
    private final HashSet<String> f = new HashSet<>();
    private Date g;
    private String h;
    private final List<String> i = new ArrayList();
    private int j = -1;
    private Location k;
    private boolean l = false;
    private String m;
    private String n;
    private int o = -1;
    private boolean p;
    private a q;
    private int r = -1;
    private String s;

    @Deprecated
    public final void a(int i2) {
        this.j = i2;
    }

    public final void a(Location location) {
        this.k = location;
    }

    public final void a(Class<? extends Object> cls, Bundle bundle) {
        this.f5630b.putBundle(cls.getName(), bundle);
    }

    public final void a(String str) {
        this.f5629a.add(str);
    }

    @Deprecated
    public final void a(Date date) {
        this.g = date;
    }

    @Deprecated
    public final void a(boolean z) {
        this.p = z;
    }

    public final void b(String str) {
        this.d.add(str);
    }

    @Deprecated
    public final void b(boolean z) {
        this.o = z ? 1 : 0;
    }

    public final void c(String str) {
        this.d.remove(str);
    }
}
