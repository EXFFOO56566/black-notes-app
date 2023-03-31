package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.internal.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class th2 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f4814a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private int f4815b;

    /* renamed from: c  reason: collision with root package name */
    private List<qh2> f4816c = new LinkedList();

    public final qh2 a(boolean z) {
        synchronized (this.f4814a) {
            qh2 qh2 = null;
            if (this.f4816c.size() == 0) {
                co.a("Queue empty");
                return null;
            }
            int i = 0;
            if (this.f4816c.size() >= 2) {
                int i2 = RecyclerView.UNDEFINED_DURATION;
                int i3 = 0;
                for (qh2 qh22 : this.f4816c) {
                    int a2 = qh22.a();
                    if (a2 > i2) {
                        i = i3;
                        qh2 = qh22;
                        i2 = a2;
                    }
                    i3++;
                }
                this.f4816c.remove(i);
                return qh2;
            }
            qh2 qh23 = this.f4816c.get(0);
            if (z) {
                this.f4816c.remove(0);
            } else {
                qh23.f();
            }
            return qh23;
        }
    }

    public final boolean a(qh2 qh2) {
        synchronized (this.f4814a) {
            return this.f4816c.contains(qh2);
        }
    }

    public final boolean b(qh2 qh2) {
        synchronized (this.f4814a) {
            Iterator<qh2> it = this.f4816c.iterator();
            while (it.hasNext()) {
                qh2 next = it.next();
                if (!q.g().i().d()) {
                    if (qh2 != next && next.c().equals(qh2.c())) {
                        it.remove();
                        return true;
                    }
                } else if (!q.g().i().j() && qh2 != next && next.e().equals(qh2.e())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void c(qh2 qh2) {
        synchronized (this.f4814a) {
            if (this.f4816c.size() >= 10) {
                int size = this.f4816c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                co.a(sb.toString());
                this.f4816c.remove(0);
            }
            int i = this.f4815b;
            this.f4815b = i + 1;
            qh2.a(i);
            qh2.i();
            this.f4816c.add(qh2);
        }
    }
}
