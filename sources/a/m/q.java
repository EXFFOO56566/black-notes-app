package a.m;

import a.m.m;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public class q extends m {
    private ArrayList<m> K = new ArrayList<>();
    private boolean L = true;
    int M;
    boolean N = false;
    private int O = 0;

    class a extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f356a;

        a(q qVar, m mVar) {
            this.f356a = mVar;
        }

        @Override // a.m.m.f
        public void e(m mVar) {
            this.f356a.r();
            mVar.b(this);
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends n {

        /* renamed from: a  reason: collision with root package name */
        q f357a;

        b(q qVar) {
            this.f357a = qVar;
        }

        @Override // a.m.m.f, a.m.n
        public void a(m mVar) {
            q qVar = this.f357a;
            if (!qVar.N) {
                qVar.s();
                this.f357a.N = true;
            }
        }

        @Override // a.m.m.f
        public void e(m mVar) {
            q qVar = this.f357a;
            int i = qVar.M - 1;
            qVar.M = i;
            if (i == 0) {
                qVar.N = false;
                qVar.c();
            }
            mVar.b(this);
        }
    }

    private void b(m mVar) {
        this.K.add(mVar);
        mVar.s = this;
    }

    private void u() {
        b bVar = new b(this);
        Iterator<m> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.M = this.K.size();
    }

    public m a(int i) {
        if (i < 0 || i >= this.K.size()) {
            return null;
        }
        return this.K.get(i);
    }

    @Override // a.m.m
    public q a(long j) {
        ArrayList<m> arrayList;
        super.a(j);
        if (this.d >= 0 && (arrayList = this.K) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.K.get(i).a(j);
            }
        }
        return this;
    }

    @Override // a.m.m
    public q a(m.f fVar) {
        super.a(fVar);
        return this;
    }

    public q a(m mVar) {
        b(mVar);
        long j = this.d;
        if (j >= 0) {
            mVar.a(j);
        }
        if ((this.O & 1) != 0) {
            mVar.a(g());
        }
        if ((this.O & 2) != 0) {
            mVar.a(j());
        }
        if ((this.O & 4) != 0) {
            mVar.a(i());
        }
        if ((this.O & 8) != 0) {
            mVar.a(f());
        }
        return this;
    }

    @Override // a.m.m
    public q a(TimeInterpolator timeInterpolator) {
        this.O |= 1;
        ArrayList<m> arrayList = this.K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.K.get(i).a(timeInterpolator);
            }
        }
        super.a(timeInterpolator);
        return this;
    }

    @Override // a.m.m
    public q a(View view) {
        for (int i = 0; i < this.K.size(); i++) {
            this.K.get(i).a(view);
        }
        super.a(view);
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // a.m.m
    public String a(String str) {
        String a2 = super.a(str);
        for (int i = 0; i < this.K.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append("\n");
            sb.append(this.K.get(i).a(str + "  "));
            a2 = sb.toString();
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    @Override // a.m.m
    public void a() {
        super.a();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).a();
        }
    }

    @Override // a.m.m
    public void a(g gVar) {
        super.a(gVar);
        this.O |= 4;
        if (this.K != null) {
            for (int i = 0; i < this.K.size(); i++) {
                this.K.get(i).a(gVar);
            }
        }
    }

    @Override // a.m.m
    public void a(m.e eVar) {
        super.a(eVar);
        this.O |= 8;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).a(eVar);
        }
    }

    @Override // a.m.m
    public void a(p pVar) {
        super.a(pVar);
        this.O |= 2;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).a(pVar);
        }
    }

    @Override // a.m.m
    public void a(s sVar) {
        if (b(sVar.f362b)) {
            Iterator<m> it = this.K.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.b(sVar.f362b)) {
                    next.a(sVar);
                    sVar.f363c.add(next);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // a.m.m
    public void a(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long k = k();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            m mVar = this.K.get(i);
            if (k > 0 && (this.L || i == 0)) {
                long k2 = mVar.k();
                if (k2 > 0) {
                    mVar.b(k2 + k);
                } else {
                    mVar.b(k);
                }
            }
            mVar.a(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    public q b(int i) {
        if (i == 0) {
            this.L = true;
        } else if (i == 1) {
            this.L = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    @Override // a.m.m
    public q b(long j) {
        super.b(j);
        return this;
    }

    @Override // a.m.m
    public q b(m.f fVar) {
        super.b(fVar);
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // a.m.m
    public void b(s sVar) {
        super.b(sVar);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).b(sVar);
        }
    }

    @Override // a.m.m
    public void c(s sVar) {
        if (b(sVar.f362b)) {
            Iterator<m> it = this.K.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.b(sVar.f362b)) {
                    next.c(sVar);
                    sVar.f363c.add(next);
                }
            }
        }
    }

    @Override // a.m.m
    public void c(View view) {
        super.c(view);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).c(view);
        }
    }

    @Override // a.m.m, a.m.m, java.lang.Object
    public m clone() {
        q qVar = (q) super.clone();
        qVar.K = new ArrayList<>();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            qVar.b(this.K.get(i).clone());
        }
        return qVar;
    }

    @Override // a.m.m
    public q d(View view) {
        for (int i = 0; i < this.K.size(); i++) {
            this.K.get(i).d(view);
        }
        super.d(view);
        return this;
    }

    @Override // a.m.m
    public void e(View view) {
        super.e(view);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).e(view);
        }
    }

    /* access modifiers changed from: protected */
    @Override // a.m.m
    public void r() {
        if (this.K.isEmpty()) {
            s();
            c();
            return;
        }
        u();
        if (!this.L) {
            for (int i = 1; i < this.K.size(); i++) {
                this.K.get(i - 1).a(new a(this, this.K.get(i)));
            }
            m mVar = this.K.get(0);
            if (mVar != null) {
                mVar.r();
                return;
            }
            return;
        }
        Iterator<m> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().r();
        }
    }

    public int t() {
        return this.K.size();
    }
}
