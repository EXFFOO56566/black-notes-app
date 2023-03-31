package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class q7<ReferenceT> implements n7 {

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, CopyOnWriteArrayList<d5<? super ReferenceT>>> f4281b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private ReferenceT f4282c;

    private final synchronized void b(String str, Map<String, String> map) {
        if (co.a(2)) {
            String valueOf = String.valueOf(str);
            wk.e(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                wk.e(sb.toString());
            }
        }
        CopyOnWriteArrayList<d5<? super ReferenceT>> copyOnWriteArrayList = this.f4281b.get(str);
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            if (((Boolean) on2.e().a(zr2.z3)).booleanValue() && q.g().c() != null) {
                jo.f3256a.execute(new s7(str));
                return;
            }
            return;
        }
        Iterator<d5<? super ReferenceT>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            jo.e.execute(new p7(this, it.next(), map));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(d5 d5Var, Map map) {
        d5Var.a(this.f4282c, map);
    }

    public final void a(ReferenceT referencet) {
        this.f4282c = referencet;
    }

    public final synchronized void a(String str, m<d5<? super ReferenceT>> mVar) {
        CopyOnWriteArrayList<d5<? super ReferenceT>> copyOnWriteArrayList = this.f4281b.get(str);
        if (copyOnWriteArrayList != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<d5<? super ReferenceT>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                d5<? super ReferenceT> next = it.next();
                if (mVar.a(next)) {
                    arrayList.add(next);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
        }
    }

    public final synchronized void a(String str, d5<? super ReferenceT> d5Var) {
        CopyOnWriteArrayList<d5<? super ReferenceT>> copyOnWriteArrayList = this.f4281b.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(d5Var);
        }
    }

    public final boolean a(Uri uri) {
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        b(uri);
        return true;
    }

    public final void b(Uri uri) {
        String path = uri.getPath();
        q.c();
        b(path, gl.b(uri));
    }

    public final synchronized void b(String str, d5<? super ReferenceT> d5Var) {
        CopyOnWriteArrayList<d5<? super ReferenceT>> copyOnWriteArrayList = this.f4281b.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f4281b.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(d5Var);
    }

    @Override // com.google.android.gms.internal.ads.n7
    public final boolean b(String str) {
        return str != null && a(Uri.parse(str));
    }

    public final synchronized void p() {
        this.f4281b.clear();
    }
}
