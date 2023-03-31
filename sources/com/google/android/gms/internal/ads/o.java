package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class o {

    /* renamed from: a  reason: collision with root package name */
    boolean f3919a = true;

    /* renamed from: b  reason: collision with root package name */
    private final List<m> f3920b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f3921c = new LinkedHashMap();
    private final Object d = new Object();
    private o e;

    public o(boolean z, String str, String str2) {
        this.f3921c.put("action", str);
        this.f3921c.put("ad_format", str2);
    }

    public final m a(long j) {
        if (!this.f3919a) {
            return null;
        }
        return new m(j, null, null);
    }

    public final String a() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.d) {
            for (m mVar : this.f3920b) {
                long a2 = mVar.a();
                String b2 = mVar.b();
                m c2 = mVar.c();
                if (c2 != null && a2 > 0) {
                    sb2.append(b2);
                    sb2.append('.');
                    sb2.append(a2 - c2.a());
                    sb2.append(',');
                }
            }
            this.f3920b.clear();
            if (!TextUtils.isEmpty(null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    public final void a(o oVar) {
        synchronized (this.d) {
            this.e = oVar;
        }
    }

    public final void a(String str, String str2) {
        e c2;
        if (this.f3919a && !TextUtils.isEmpty(str2) && (c2 = q.g().c()) != null) {
            synchronized (this.d) {
                i a2 = c2.a(str);
                Map<String, String> map = this.f3921c;
                map.put(str, a2.a(map.get(str), str2));
            }
        }
    }

    public final boolean a(m mVar, long j, String... strArr) {
        synchronized (this.d) {
            for (String str : strArr) {
                this.f3920b.add(new m(j, str, mVar));
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> b() {
        synchronized (this.d) {
            e c2 = q.g().c();
            if (c2 != null) {
                if (this.e != null) {
                    return c2.a(this.f3921c, this.e.b());
                }
            }
            return this.f3921c;
        }
    }
}
